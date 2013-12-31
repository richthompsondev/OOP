# Faça uma função que receba um número n e que imprima uma pirâmide invertida de números:
# 1, 2, 3, ... n
# ...
# 1, 2, 3
# 1, 2
# 1

def piramide_invertida(n):
    lista = []
    for i in range(1, n + 1):
        lista.append(i)
    while len(lista) >= 1:
        print(str(lista).strip('[]'))
        del(lista[-1])

n = int(input())
piramide_invertida(n)
