import numpy as np
from fractions import Fraction
import math

def matrixEntries():
    print("Enter the number of Rows: ")
    rowIndex = int(input())
    print("Enter the number of Columns: ")
    columnIndex = int(input())

    elements = list(map(int, input().split(',')))
    
    matrixEntry = np.array(elements).reshape(rowIndex, columnIndex)
    return rowIndex, columnIndex, matrixEntry

def operations():
    row, column, matrix = matrixEntries()
    print("Row index: ", row, "Column Index: ", column, "\n MATRIX \n", matrix)

operations()