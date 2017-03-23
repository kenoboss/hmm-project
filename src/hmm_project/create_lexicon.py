# coding: utf-8
import xml.etree.ElementTree as etree
from operator import attrgetter
import os
import re

# ============= AutoVivification =============
class AutoVivification(dict):
    def __getitem__(self, item):
        try:
            return dict.__getitem__(self, item)
        except KeyError:
            value = self[item] = type(self)()
            return value

dictionary = AutoVivification()

path = '/media/kenobi/5C56715E56713A3A/Users/Kenobi/Ressourcen/TuebaDZ/9.0/corpora' # need the folder of TuebaDZ corpus


wahrscheinlichkeiten = {}

# ============= reading files =============
def create_dictionary (filename):

    tree = etree.parse(str(path)+"/"+str(filename))
    root = tree.getroot()

    body = root.iter('body')
    for b in body:
        sentence = b.iter('s')
        for s in sentence:

            pos = "<s>"
            word = "<s>"

            key = word

            if pos in dictionary[key]:
                dictionary[key][pos] += 1
            else:
                dictionary[key][pos] = 1

            if pos in wahrscheinlichkeiten:
                wahrscheinlichkeiten[pos] += 1
            else:
                wahrscheinlichkeiten[pos] = 1

            graph = s.iter('graph')
            for g in graph:
                terminals = g.iter('t')
                for t in terminals:
                    pos = t.attrib['pos']
                    word = t.attrib['word']

                    key = word

                    if pos in dictionary[key]:
                        dictionary[key][pos] += 1
                    else:
                        dictionary[key][pos] = 1

                    if pos in wahrscheinlichkeiten:
                        wahrscheinlichkeiten[pos] += 1
                    else:
                        wahrscheinlichkeiten[pos] = 1
            pos = "</s>"
            word = "</s>"

            key = word

            if pos in dictionary[key]:
                dictionary[key][pos] += 1
            else:
                dictionary[key][pos] = 1

            if pos in wahrscheinlichkeiten:
                wahrscheinlichkeiten[pos] += 1
            else:
                wahrscheinlichkeiten[pos] = 1


index = 0
for filename in os.listdir(path):
    if (index < 2296):
        print(filename)
        create_dictionary(filename)
    index += 1
# filename = 't_890102_141.xml' # test with one file
# create_dictionary(filename)

print(wahrscheinlichkeiten)

# not used
def translite (token):
    token = token.replace('"', '\\"')

    return token


# ============= write in clj file =============
# Bsp: "werden" (hash-map "MV" 0.3 "KOPV" 0.5)
target = open("Github/hmm-project/src/hmm_project/lexicon.clj", "w", encoding="utf-8")
target.write("(ns viterbi.lexicon)\n")
target.write("(def lexicon\n"
  "\t(hash-map\n" )

for key, value in dictionary.items():

    token = translite(key)
    # token = key

    target.write('\t\t(apply str "'+str(token)+'") (hash-map')
    for key2, value2 in dictionary[key].items():

        for k,v in wahrscheinlichkeiten.items():

            if (k == key2):
                wahrscheinlichkeit = value2/v

        target.write(' "'+str(key2)+'" '+str(wahrscheinlichkeit))

    target.write(')\n')


target.write('\t)\n )')
target.close()
