import numpy as np

matrix_A = np.array([[1,1,1],[1,1,0],[1,0,0]])
matrix_B = np.array([[1,1,-1,1],[-1,0,1,1],[0,-1,-1,2]])

size = matrix_B.shape
print(size[0])
print(size[1])

#Determinant Checker
determinant = np.linalg.det(matrix_A)

print(determinant)

#Rank Checker
pivot = np.linalg.matrix_rank(matrix_B)

print(pivot)