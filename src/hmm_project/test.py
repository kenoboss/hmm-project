class AutoVivification(dict):
    def __getitem__(self, item):
        try:
            return dict.__getitem__(self, item)
        except KeyError:
            value = self[item] = type(self)()
            return value

a = AutoVivification()

for x in range(1,10,1):
    for y in range(1,10,1):
        for z in range(1,10,1):
            if (x in a and y in a):
                a["X"+str(x)]["Y"+str(y)] += 1
            else:
                a["X"+str(x)]["Y"+str(y)] = 1

for key, value in a.items():
    print(key, value)
