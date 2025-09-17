import numpy as np
from fractions import Fraction
import math

x = np.array([1,2,3])
y = np.array([1, 0 ,0 ])
z = np.array([2,-6,9,0])

dot = x - y

distance = np.linalg.norm(dot)

print(distance)