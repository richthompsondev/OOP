import math


# A function to print all prime factors of a given number n


def prime_factors(n):
    # Print the number of two's that divide n
    while n % 2 == 0:
        print(2),
        n = n / 2
    # n must be odd at this point so a skip of 2 ( i = i + 2) can be used
    for i in range(3, int(math.sqrt(n)) + 1, 2):
        # while i divides n , print i ad divide n
        while n % i == 0:
            print(i),
            n = n / i
    # Condition if n is a prime number greater than 2
    if n > 2:
        print(n)


# Driver Program to test above function
n = 12246
prime_factors(n)


print()
# Python3 program to find prime factorization of a number n in O(Log n) time with pre computation allowed.
# Works well for n up to the order of 10^7. Beyond this there will be memory issues.
# The above method is overall better
MAXN = 100001
# stores smallest prime factor for every number
spf = [0 for i in range(MAXN)]


# Calculating SPF (Smallest Prime Factor) for every number till MAXN.
# Time Complexity : O(nlog(log n))
def sieve():
    spf[1] = 1
    for i in range(2, MAXN):
        # marking smallest prime factor  for every number to be itself.
        spf[i] = i
    # separately marking spf for every even number as 2
    for i in range(4, MAXN, 2):
        spf[i] = 2
    for i in range(3, math.ceil(math.sqrt(MAXN))):
        # checking if i is prime
        if spf[i] == i:
            # marking SPF for all numbers divisible by i
            for j in range(i * i, MAXN, i):
                # marking spf[j] if it is not previously marked
                if spf[j] == j:
                    spf[j] = i


# A O(log n) function returning prime factorization by dividing by smallest prime factor at every step
def getFactorization(x):
    ret = list()
    while x != 1:
        ret.append(spf[x])
        x = x // spf[x]
    return ret


# Driver code precalculating Smallest Prime Factor
sieve()
x = 12246
print("prime factorization for", x, ": ", end="")

# calling getFactorization function
p = getFactorization(x)

for i in range(len(p)):
    print(p[i], end=" ")
