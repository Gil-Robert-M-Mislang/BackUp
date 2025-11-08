import numpy as np

#I don't know what I'm doing, I'll answer leetcode na muna


def process():
    data = np.array([[1,2,3], [4,5,6]])
    datas = [[0,0,0], [0,0,0]]
    i = 0
    j = 0

    for row in data:
        for column in row:
            datas[j][i] = column
            i += 1
        j += 1
        i = 0

    for mase in datas:
        print(*mase)

process()
    