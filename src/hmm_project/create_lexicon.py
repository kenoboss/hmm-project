# coding: utf-8
import xml.etree.ElementTree as etree
from operator import attrgetter
import os

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
path = 'C:/Users/Kenobi/Ressourcen/TuebaDZ/9.0/corpora' # need the folder of TuebaDZ corpus
for filename in os.listdir(path):
    print(filename)
#filename = 't_890102_141.xml' # test with one file
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


# ============= write in clj file =============

target = open("lexicon.clj", "w", encoding="utf-8")
target.write("(def lexicon\n"
  "\t(set\n"
    "\t\t[\n" )

for key, value in dictionary.items():
    target.write('\t\t\t{:word "'+str(key)+'" ')
    for key2, value2 in dictionary[key].items():
        target.write('{:pos "'+str(key2)+'" :counter "'+str(value2)+'" }')

    target.write(' }\n')

target.write(']))')
target.close()
