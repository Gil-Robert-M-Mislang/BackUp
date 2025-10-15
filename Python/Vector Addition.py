import numpy as np

x = np.array([-2,1,0,-1])
y = np.array([2,3,-6,0])
z = np.array([2,-6,9,0])


def vector_operation():
    #VECTOR ADDITION
    SUM = x + y
    print(SUM) #0, 4, -6, -1

    #SCALAR MULTIPLICATION
    LC = 2*x + 7*z #2*x = [-4, 2, 0, -2]; 7*z = [14, -42, 63, 0]; //[10, -40, 63, -2]
    print(LC)

def dot_product():
    dot = x@y
    print(dot)

    dot_ulit = np.dot(x, y)
    print(dot_ulit)

    #NORM
    norm = np.linalg.norm(x)
    print(norm)
    
    sara = (dot*y)+((norm**2)*z)
    print(sara)

    curlee = np.linalg.norm(np.linalg.norm(x - y)*z)
    print(curlee)

    jinggoy = ((x@z)*y) + (y@z)
    print(jinggoy)

def exercise():
    vec_x = np.array([1,2,3,4])
    sum = 0

    for i in vec_x:
        sum += i
    
    print(sum)

    ones = np.ones(4)
    dot = vec_x@ones

    print(dot)

def matrices():
    A = np.array([[-3, 0, 2],[1, 2, -2]])
    B = np.array([[1, 3, -4],[-3, -2, 0]])

    #Prints the shape of the Matrix
    print(A.shape) #(2,3)
    print(B.shape) #(2,3)

    C = A+B
    print(C) #([[-2, 3, -2],[-2, 0, -2]])

    E = 2*A + (-3)*B
    print(E) #2*A = [-6, 0, 4], [2, 4, -4]; (-3)*B = [-3, -9, 12], [9, 6, 0] => [-9, -9, 16], [11, 10, -4]

    F = np.array([[1,2],[3,4],[5,6]])
    size = F.shape
    print(size)
    #print(A + F) #This will print out an error since A and F have different sizes

    X = np.array([[2,1],[-3,4],[1,6]])
    Y = np.array([[0,-1,0],[4,0,2],[8,-1,7]])

    #MATRIX MULTIPLICATION
    #print(X@Y) #X has size of 3,2 while Y has size of 3,3 and the column of X is not equal to the row of Y

    print(Y@X)
    print(np.matmul(Y,X))
    print(np.dot(Y,X))

#vector_operation()
#dot_product()
#exercise()

matrices()