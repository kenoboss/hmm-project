# coding: utf-8
import xml.etree.ElementTree as etree
from operator import attrgetter
import os

dictionary = {}

path = 'C:/Users/Kenobi/Ressourcen/TuebaDZ/9.0/corpora' # need the folder of TuebaDZ corpus
# for filename in os.listdir(path):
#     print(filename)
filename = 't_890102_141.xml' # test with one file
tree = etree.parse(str(path)+"/"+str(filename))
root = tree.getroot()
terminals = root.iter('t')

words = []
for t in terminals:
    words.append(t.attrib['word'])

def n_grams (n, words):
    # max trigrams
    index = n
    while index < len(words):
        prev = words[index-n]
        if (n >= 2):
            prev1 = words[index-n+1]

        current = words[index]

        print(prev,prev1, current)
        index += 1


print(n_grams(2, words))
