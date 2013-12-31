print("Imprimir sem quebra de linha", end='')
print("o pedido para inserir dois números")

a, b = input('Bora pow\n').split()  # Ler vários números na mesma linha

a = float(a)  # No Python a entrada por comando input é sempre em string, portanto se precisa converter para outro tipo
b = float(b)

print("{:.2f}".format(a / b))  # Limita número real à 2 casas decimais
# print("O valor da soma é {} e o valor da divisão é {}".format(a + b, a / b))
# <variável> = <valor1> if (True) else <valor2>
# output_list = [expression for var in input_list if condition]      List Comprehension
