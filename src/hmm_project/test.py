# coding: utf-8
import xml.etree.ElementTree as etree
from operator import attrgetter
import os
import re

path = '/media/kenobi/5C56715E56713A3A/Users/Kenobi/Ressourcen/TuebaDZ/9.0/corpora' # need the folder of TuebaDZ corpus
targetControl = open("result.txt", "w+", encoding="utf-8")

targetTest = open("testTreeTagger.txt", "w+", encoding="utf-8")

targetTestOwn = open("testPOSTagger.txt", "w+", encoding="utf-8")

# ============= reading files =============
def create_test (filename):

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

                    targetControl.write(str(word)+"\t"+str(pos)+"\n")
                    targetTest.write(str(word)+"\n")

                    targetTestOwn.write(str(word)+" ")
            targetTestOwn.write("\n")



index = 0
counter = 0
for filename in os.listdir(path):
    if (index >= 2296):
        print(filename)
        create_test(filename)
        counter += 1
    index += 1


print(counter)


targetTest.close()
targetControl.close()
