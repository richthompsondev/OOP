number = input("Input a number to invert its order:")
print("Printing using string: " + number[::-1])

inverted = 0
exponent = len(number)
number = int(number)
while number >= 1:
    inverted += (number % 10) * (10 ** (exponent - 1))
    exponent -= 1
    number = number // 10  # the floor division // rounds the result down to the nearest whole number
print("Printing using way faster and elegant math: {}".format(inverted))
