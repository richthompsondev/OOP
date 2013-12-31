import time


def piramide_invertida(n):
    lista = []
    for i in range(1, n + 1):
        lista.append(i)
    while len(lista) > 1:
        print(str(lista).strip('[]'))
        del(lista[-1])
    else:
        print(str(lista).strip('[]'))


inicio = time.time()
piramide_invertida(100) #duracao: 0.006997
fim = time.time()
print ('duracao: %f' % (fim - inicio))