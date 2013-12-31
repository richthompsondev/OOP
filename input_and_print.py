print("Imprimir sem quebra de linha", end='')
print(" o pedido para inserir dois números")

a, b = input('Bora pow\n').split()  # Ler vários números na mesma linha

a = float(a)  # No Python a entrada por comando input é sempre em string, portanto se precisa converter para outro tipo
b = float(b)

a2, b2 = map(int, input('Bora pow\n').split())  # É mais pythonico usar map function

print(f"{a / b:.2f}")
# print("{:.2f}".format(a / b)) old form
# print("O valor da soma é {} e o valor da divisão é {}".format(a + b, a / b))

# <variável> = <valor1> if (True) else <valor2>
# output_list = [expression for var in input_list if condition]      List Comprehension

# for x in range(1, 11):
#   print(f'{x:02} {x*x:3} {x*x*x:4}')
# Out:
# 01   1    1
# 02   4    8
# 03   9   27
# 04  16   64
# 05  25  125
# 06  36  216
# 07  49  343
# 08  64  512
# 09  81  729
# 10 100 1000

# matrix = [[i for i in range(5)] for _ in range(6)]
# >>> matrix
# [
#     [0, 1, 2, 3, 4],
#     [0, 1, 2, 3, 4],
#     [0, 1, 2, 3, 4],
#     [0, 1, 2, 3, 4],
#     [0, 1, 2, 3, 4],
#     [0, 1, 2, 3, 4]
# ]
