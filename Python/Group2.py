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
    
def Gram_Schmidt(input):
    #gawin mo yung gram_schmidt here

def main():
    matrix = np.array([[1,1,-1,1],[-1,0,1,1],[0,-1,-1,2]])

    independence = LI_tester(matrix)
    if independence == True:
        Gram_Schmidt(matrix)
    else:
        print("Input Error: The input is not linearly independent")

main()