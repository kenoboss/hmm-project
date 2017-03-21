# coding: utf-8
import xml.etree.ElementTree as etree
from operator import attrgetter
import os

class AutoVivification(dict):
    def __getitem__(self, item):
        try:
            return dict.__getitem__(self, item)
        except KeyError:
            value = self[item] = type(self)()
            return value



words = []

def getTokens (path, filename):
    # appends the tokens of a xml file to the list 'words'
    tree = etree.parse(str(path)+"/"+str(filename))
    root = tree.getroot()
    body = root.iter('body')
    for b in body:
        sentence = b.iter('s')
        for s in sentence:

            words.append("<s>")
            graph = s.iter('graph')
            for g in graph:
                terminals = g.iter('t')
                for t in terminals:
                    words.append(t.attrib['pos'])
            words.append("</s>")

path = 'C:/Users/Tobias/Ressourcen/TuebaDZ/9.0/corpora' # need the folder of TuebaDZ corpus
fileCounter = 0
for filename in os.listdir(path):
    # iterates through the whole corpus
    if fileCounter < 2296:
        print(filename)
        getTokens (path, filename)
    fileCounter += 1


dictionary = AutoVivification()
index = 1
while index < len(words):
    prev = words[index - 1]
    current = words[index]

    if current in dictionary[prev]:
        dictionary[prev][current] += 1
    else:
        dictionary[prev][current] = 1

    index += 1

target = open("bigrams.clj", "w", encoding="utf-8")
target.write("(def bigram (hash-map \n")
for key, value in dictionary.items():
    target.write('"'+str(key)+'"'+"\t(hash-map ")
    sum = 0
    for key2, value2 in value.items():
        sum = sum + value2
    counter = 0
    for key2, value2 in value.items():
        quot = value2 / sum
        if counter == (len(value.items()) - 1):
            target.write('"'+str(key2)+'" '+str(quot))
        else:
            target.write('"'+str(key2)+'" '+str(quot)+', ')
        counter += 1
    target.write(")\n")
target.write(")")


target.close()





# def bigrams (words):
#     # writes the bigrams line for line in a result file
#     target = open("result.txt", "w", encoding="utf-8")
#     index = 1
#     while index < len(words):
#         prev = words[index - 1]
#         current = words[index]
#         target.write(str(prev)+" "+str(current)+"\n")
#         index += 1
#
#     target.close()
#
# bigrams(words)
