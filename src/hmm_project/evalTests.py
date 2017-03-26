# coding: utf-8

TestData = open("/home/kenobi/Repos/Github/hmm-project/src/hmm_project/Test/result.txt", "r", encoding="utf-8")
TreeTaggerData = open("/home/kenobi/Repos/Github/hmm-project/src/hmm_project/Test/output.txt", "r", encoding="utf-8")

linesTestData = TestData.readlines()
linesTreeTagger = TreeTaggerData.readlines()

index = 0
truePos = 0
falsePos = 0
falseNeg = 0
while index < len(linesTestData):
    test = linesTestData[index]
    test = test.split("\t")
    test = test[1]
    result = linesTreeTagger[index]
    if (test == result):
        truePos += 1
    else:
        falseNeg += 1
        falsePos += 1
    index += 1


precison = truePos/(truePos + falsePos)
recall = truePos/(truePos + falseNeg)
fmeasure = 2 * ((precison*recall)/(precison + recall))

print("TP:\t"+str(truePos))
print("FP:\t"+str(falsePos))
print("FN:\t"+str(falseNeg))
print("===========")
print("P:\t"+str(precison))
print("R:\t"+str(recall))
print("F:\t"+str(fmeasure))
