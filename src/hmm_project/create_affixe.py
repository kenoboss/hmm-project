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

# get morphTags
morphTags = []
affixePre = open("/home/kenobi/Repos/Github/hmm-project/src/hmm_project/morph_tags.clj", "r", encoding="utf-8")
affixeLines = affixePre.readlines()
for line in affixeLines:
    line = line.strip()
    line = line.replace('"', '')
    if re.search("lemma", line):
        parts = line.split(" ")
        index = 0
        while index < len(parts):
            if (parts[index] == '{:lemma' or parts[index] == ':lemma'):
                morphTags.append(parts[index + 1])
            index += 1

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
            graph = s.iter('graph')
            for g in graph:
                terminals = g.iter('t')
                for t in terminals:
                    pos = t.attrib['pos']
                    word = t.attrib['word']

                    key = word

                    for tag in morphTags:
                        if (key.find(tag) != -1):
                            if pos in dictionary[tag]:
                                dictionary[tag][pos] += 1
                            else:
                                dictionary[tag][pos] = 1

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

print(wahrscheinlichkeiten)

target = open("Github/hmm-project/src/hmm_project/morphs.clj", "w", encoding="utf-8")
target.write("(ns viterbi.lexicon)\n")
target.write("(def lexicon\n"
  "\t(hash-map\n" )

test = {}
for key, value in dictionary.items():

    token = key

    target.write('\t\t(apply str "'+str(token)+'") (hash-map')
    for key2, value2 in dictionary[key].items():

        for k,v in wahrscheinlichkeiten.items():

            if (k == key2):
                wahrscheinlichkeit = value2/v

                if key2 in test:
                    test[key2] += wahrscheinlichkeit
                else:
                    test[key2] = wahrscheinlichkeit

        target.write(' "'+str(key2)+'" '+str(wahrscheinlichkeit))

    target.write(')\n')


target.write('\t)\n )')
target.close()

for k, v in test.items():
    print (str(k)+"\t"+str(v))
