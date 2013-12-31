# Time is not precise as there might be background process momentarily running which disrupts the code execution
import operator
from time import time
# Precise
from timeit import timeit

# Here we want to invert digits
number = ''.join([str(i) for i in range(100)])  # input("Input a number to invert its order:")


# Slightly better for a comparatively short string
def slicing_method(number1):
    return "Printing using string: ", number1[::-1]


inicio = time()
slicing_method(number)
fim = time()
print("Duracao time slicing_method: %f" % (fim - inicio))
print("Duracao timeit slicing_method: ", timeit('slicing_method(number)', 'from __main__ import slicing_method, number',
                                                number=100))
print()


# Elegant but slow
def math_method(number2):
    inverted = 0
    exponent = len(number2)
    number2 = int(number2)
    while number2 >= 1:
        inverted += (number2 % 10) * (10 ** (exponent - 1))
        exponent -= 1
        number2 = number2 // 10  # the floor division // rounds the result down to the nearest whole number
    return "Printing using elegant math: {}".format(inverted)


inicio2 = time()
math_method(number)
fim2 = time()
print("Duracao time math_method: ", (fim2 - inicio2))
print("Duracao timeit math_method: ", timeit('math_method(number)', 'from __main__ import math_method, number',
                                             number=100))
print()


# Better for a comparatively large list (~10*6)
def reversed_method(number3):
    return f"Printing using string: {reversed(number3)}."


inicio3 = time()
reversed_method(number)
fim3 = time()
print(f"Duracao time reversed_method: {fim3 - inicio3}")
print("Duracao timeit reversed_method: ", timeit('reversed_method(number)',
                                                 'from __main__ import reversed_method, number', number=100))
print()

# Here we want to invert a list
number_list = [str(i) for i in range(100)]

print("Duracao timeit slicing_method em lista: ", timeit('slicing_method(number_list)',
                                                         'from __main__ import slicing_method, number_list',
                                                         number=100))
print("Duracao timeit reversed_method em lista: ", timeit('reversed_method(number_list)',
                                                          'from __main__ import reversed_method, number_list',
                                                          number=100))


# Slightly better for a comparatively short list
def reverse_method(number4):
    return f"Printing using string: {number4.reverse()}."


print("Duracao timeit reverse_method em lista: ", timeit('reverse_method(number_list)',
                                                         'from __main__ import reverse_method, number_list',
                                                         number=100))
print()


def add(x, y):
    return x + y


def operators_add(x, y):
    return operator.add(x, y)


# Strings
a = '1'
b = '2'
print(timeit('add(a, b)', 'from __main__ import add, a, b'))
# 0.16069997000158764
print(timeit('operators_add(a, b)', 'from __main__ import operators_add, a, b'))
# Integers
a2 = 1
b2 = 2
print(timeit('add(a2, b2)', 'from __main__ import add, a2, b2'))
# 0.10841095799696632
print(timeit('operators_add(a2, b2)', 'from __main__ import operators_add, a2, b2'))
