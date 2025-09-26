import numpy as np
from fractions import Fraction
import math

x = np.array([1,2,3])
y = np.array([1, 0 ,0 ])
z = np.array([2,-6,9,0])
A = np.array([[1,2],[1,-1]])

dot = x - y

distance = np.linalg.norm(dot)

cube_np = np.linalg.matrix_power(A,2)

print(cube_np)