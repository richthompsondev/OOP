# Program to add two matrices using list comprehension

X = [[12, 7, 3],
     [4, 5, 6],
     [7, 8, 9]]

Y = [[5, 8, 1],
     [6, 7, 3],
     [4, 5, 9]]

result = [[X[i][j] + Y[i][j]  for j in range(len(X[0]))] for i in range(len(X))]

for r in result:
    print(r)

# Using NumPy
import numpy as np

A = np.array([[2, 4], [5, -6]])
B = np.array([[9, -3], [3, 6]])
C = A + B      # element wise addition
print(C)

# Program to transpose a matrix using list comprehension

X = [[12, 7],
     [4, 5],
     [3, 8]]

result = [[X[j][i] for j in range(len(X))] for i in range(len(X[0]))]

for r in result:
    print(r)

# Using NumPy
A = np.array([[1, 1], [2, 1], [3, -3]])
print(A.transpose())

# Program to multiply two matrices using list comprehension

# 3x3 matrix
X = [[12, 7, 3],
     [4, 5, 6],
     [7, 8, 9]]

# 3x4 matrix
Y = [[5, 8, 1, 2],
     [6, 7, 3, 0],
     [4, 5, 9, 1]]

# result is 3x4
result = [[sum(a*b for a,b in zip(X_row,Y_col)) for Y_col in zip(*Y)] for X_row in X]

for r in result:
    print(r)

# Using NumPy
A = np.array([[3, 6, 7], [5, -3, 0]])
B = np.array([[1, 1], [2, 1], [3, -3]])
C = A.dot(B)
print(C)
