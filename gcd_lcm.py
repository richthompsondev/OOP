# GCD of more than two (or array) numbers
# Function implements the Euclidian algorithm to find highest common factor of two number
def find_gcd(a, b):
    while(b):
        a, b = b, a % b
    return a
         
    
# Driver Code       
l = [2, 4, 6, 8, 16]
num1 = l[0]
num2 = l[1]
gcd = find_gcd(num1, num2)
for i in range(2, len(l)):
    gcd = find_gcd(gcd, l[i])
     
print(gcd)


# Python program to demonstrate Basic Euclidean Algorithm
# Function to return gcd of a and b
# Time Complexity: O(Log min(a, b))
def gcd(a, b):
    if a == 0:
        return b
    return gcd(b % a, a)


a = 15
b = 20
print("gcd(", a, ",", b, ") = ", gcd(a, b))


# Python program to demonstrate working of extended Euclidean Algorithm
# Function for extended Euclidean Algorithm
# Essential step in RSA public-key encryption method.

def gcd_extended(a, b):
    # Base Case
    if a == 0:
        return b, 0, 1
    gcd, x1, y1 = gcd_extended(b % a, a)

    # Update x and y using results of recursive call
    x = y1 - (b // a) * x1
    y = x1
    return gcd, x, y


# Driver code
a, b = 20, 15
g, x, y = gcd_extended(a, b)
print("gcd(", a, ",", b, ") = ", g)


# Function to return LCM of two numbers
def lcm(a, b):
    return (a / gcd(a, b)) * b


# Driver program to test above function
a = 15
b = 20
print('LCM of', a, 'and', b, 'is', lcm(a, b))
# Brute force LCM
# def lcm(a, b):
#    if a > b:
#        lcm = a
#    else:
#        lcm = b
#    while(True):
#        if (lcm % a == 0) and (lcm % b == 0):
#            break
#        lcm += 1
#    return lcm
