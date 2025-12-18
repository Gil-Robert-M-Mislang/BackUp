import numpy as np

#Step1: Traverse the Data 
#Step2: If the current data is 0, check for the next row: if the next row is 1 Change it with the previous zero
#Step3: if flag == i then Type 3 operation
#Step4: if the current data is nonzero and the rest is also nonzero

def Type1Operation(data, indexFlag, indexChange):
    temp = data[indexFlag]
    data[indexFlag] = data[indexChange]
    data[indexChange] = temp

    return data

def Type2Operation(data, row, column):
    data[row] = (data[row][column]**-1) * data[row]

    return data

def Type3Operation(data, flag, row, column):
    for j in range(column):
        for i in range(row):
            if data[i][j] == 0 or flag == i:
                continue
            else:
                data[i] = data[i] + (-data[i][j])*data[flag] 
        
    return data

def Row_Traverse(data, flag, row, column):
    for j in range(column):
        for i in range(row):
            if data[i][j] == 0 or flag == i:
                continue
            elif data[i][j] == 1:
                data = Type1Operation(data, flag, i)
                flag = -1
        if flag < 0:
            return 1
        
    return 0
                

def process():
    data = np.array([[0,2,3], [4,5,6]])
    row_range = data.shape[0]
    column_range = data.shape[1]

    for i in range(row_range):
        for j in range(column_range):
            if data[i][j] != 1:
                flag = i
                status = Row_Traverse(data, flag, row_range, column_range)
            else:
                data = Type3Operation(data, i, row_range, column_range)
        
        if status == 0:
            data = Type2Operation(data, i, j)

process()
    