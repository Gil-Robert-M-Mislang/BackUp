import numpy as np
import sympy as sp

def LI_tester(input):
    size = input.shape

    if size[1] < size[0]:
        return False
    elif size[0] == size[1]:
        determinant = int(np.linalg.det(input))
        if determinant == 0:
            return False
        
        return True
    else:
        pivot = np.linalg.matrix_rank(input)
        if pivot < size[0]:
            return False
        
        return True
    
def Sum_Projection(input, size, index):
    result_matrix = np.zeros(size[1])

    for i in range(index):
        norm = np.linalg.norm(input[i])
        result_matrix += ((input[index] @ input[i])/ norm**2) * input[i] 

    return result_matrix

def Normalization(input, size):
    result_matrix = np.empty(size)

    for i in range(size[0]):
        result_matrix[i] = input[i]/np.linalg.norm(input[i])
    
    return result_matrix

def Gram_Schmidt(input, size):
    result_matrix = np.empty(size)

    for i in range(size[0]):
        if i == 0:
            result_matrix[i] = input[i]
        else:
            result_matrix[i] = input[i] - Sum_Projection(result_matrix, size, i)

    result_matrix = Normalization(result_matrix, size)

    return result_matrix

def main():
    matrix = np.array([[1,2,-1,0],[2,2,0,1],[1,1,1,0]])
    matrix_size = matrix.shape

    independence = LI_tester(matrix)
    if independence == True:
        result_matrix = Gram_Schmidt(matrix, matrix_size)
        result_matrix[np.abs(result_matrix) < 1e-12] = 0
        end_matrix = sp.Matrix(result_matrix).applyfunc(sp.nsimplify)
        print(f"The orthonormal matrix of the given matrix is: ")
        for row in end_matrix.tolist():
            print(row)
    else:
        print("Input Error: The input is not linearly independent")

main()