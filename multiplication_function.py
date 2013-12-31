# Make a sum function and use it to make a multiplication function.
def sum(a=0, b=0): # 合計
    return a + b


def multiply(a=1, b=1): # 掛ける
    summation = 0
    if a < b:
        for i in range(a):
            summation = sum(summation, b)
        return summation
    else:
        for i in range(b):
            summation = sum(summation, a)
        return summation


try:
    a, b = input("Input two numbers in the same line:").split()
    a = int(a)
    b = int(b)
except ValueError:
    a, b = input("You broke the line, please, try again:").split()
    a = int(a)
    b = int(b)

print(sum(a, b))
print(multiply(a, b))