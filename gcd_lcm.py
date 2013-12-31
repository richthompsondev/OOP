# Python program to demonstrate Basic Euclidean Algorithm
# Function to return gcd of a and b
# Time Complexity: O(Log min(a, b))

def gcd(a, b):
    if a == 0:
        return b
    return gcd(b % a, a)


a = 10
b = 15
print("gcd(", a, ",", b, ") = ", gcd(a, b))

a = 35
b = 10
print("gcd(", a, ",", b, ") = ", gcd(a, b))

a = 31
b = 2
print("gcd(", a, ",", b, ") = ", gcd(a, b))


# Python program to demonstrate working of extended Euclidean Algorithm
# function for extended Euclidean Algorithm

def gcd_extended(a, b):
    # Base Case
    if a == 0:
        return b, 0, 1
    gcd, x1, y1 = gcd_extended(b % a, a)

    # Update x and y using results of recursive
    # call
    x = y1 - (b // a) * x1
    y = x1
    return gcd, x, y


# Driver code
a, b = 35, 15
g, x, y = gcd_extended(a, b)
print("gcd(", a, ",", b, ") = ", g)


# Function to return LCM of two numbers
def lcm(a, b):
    return (a / gcd(a, b)) * b


# Driver program to test above function
a = 15
b = 20
print('LCM of', a, 'and', b, 'is', lcm(a, b))
