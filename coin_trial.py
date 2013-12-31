from random import random


def coin_trial():
    heads = sum([1 for _ in range(100) if random() <= 0.5])
    return heads


def simulate(n):
    trials = [coin_trial() for _ in range(n)]
    return sum(trials)/n


print(simulate(10))
print(simulate(100))
print(simulate(1000))
print(simulate(1000000))
