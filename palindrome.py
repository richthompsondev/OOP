# Faça uma função que receba como entrada uma palavra e diga se ela é palíndroma.
def palindrome(palavra):
    return palavra.lower() == palavra[::-1].lower()

print(palindrome(input()))    # True or False
