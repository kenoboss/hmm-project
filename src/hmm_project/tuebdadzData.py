# coding: utf-8
import xml.etree.ElementTree as etree
from operator import attrgetter
import os
import re

path = '/media/kenobi/5C56715E56713A3A/Users/Kenobi/Ressourcen/TuebaDZ/9.0/corpora' # need the folder of TuebaDZ corpus
targetData = open("Github/hmm-project/src/hmm_project/Test/TuebaDZData.txt", "w+", encoding="utf-8")

posTags = {}
wordCounter = 0

# ============= reading files =============
def create_data (filename):

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

                    global wordCounter
                    wordCounter += 1

                    if pos in posTags:
                        posTags[pos] += 1
                    else:
                        posTags[pos] = 1




index = 0
for filename in os.listdir(path):
    if index < 2296:
        print(filename)
        create_data(filename)
    index += 1

print("=========================")
print(wordCounter)
for k,v in posTags.items():
    targetData.write(str(k)+"\t"+str(v)+"\n")


targetData.close()
