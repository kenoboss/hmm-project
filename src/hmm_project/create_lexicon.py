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


# ============= reading files =============

def create_dictionary (filename):
    path = 'C:/Users/Kenobi/Ressourcen/TuebaDZ/9.0/corpora' # need the folder of TuebaDZ corpus
    tree = etree.parse(str(path)+"/"+str(filename))
    root = tree.getroot()

    for t in root.iter('t'):
        pos = t.attrib['pos']
        word = t.attrib['word']

        key = word

    # ============= create dictionary =============
        if pos in dictionary[key]:
            dictionary[key][pos] += 1
        else:
            dictionary[key][pos] = 1


# for filename in os.listdir(path):
#     print(filename)
#     create_dictionary(filename)
filename = 't_890102_141.xml' # test with one file
create_dictionary(filename)


def translite (token):
    token = re.sub("ö", "oe", token)
    token = re.sub("ü", "ue", token)
    token = re.sub("ä", "ae", token)
    token = re.sub("Ö", "Oe", token)
    token = re.sub("Ü", "Ue", token)
    token = re.sub("Ä", "Ae", token)
    token = re.sub("ß", "ss", token)

    token = re.sub("'", "XX", token)

    return token


# ============= write in clj file =============

target = open("lexicon.clj", "w", encoding="utf-8")
target.write("(def lexicon\n"
  "\t'(\n" )

for key, value in dictionary.items():

    token = translite(key)

    target.write('\t { :'+str(token)+' \'(')
    for key2, value2 in dictionary[key].items():
        target.write(' \'( {:pos "'+str(key2)+'" }, {:counter "'+str(value2)+'" }) ')

    target.write(' ) }\n')

target.write(') )')
target.close()
