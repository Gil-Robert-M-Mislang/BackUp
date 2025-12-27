import numpy as np

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
    
def Sum_Projection(input, size):
    result_matrix = np.empty(size)

    return result_matrix

def Gram_Schmidt(input, size):
    result_matrix = np.empty(size)

    for i in range(size[0]):
        for j in range(size[0]):
            result_matrix[i]
    #For loop in every row excluding first row
    #Create another function that sums the gram schmidt

def main():
    matrix = np.array([[1,1,-1,1],[-1,0,1,1],[0,-1,-1,2]])
    matrix_size = matrix.shape

    independence = LI_tester(matrix)
    if independence == True:
        Gram_Schmidt(matrix, matrix_size)
    else:
        print("Input Error: The input is not linearly independent")

main()