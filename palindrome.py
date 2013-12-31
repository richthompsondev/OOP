# Make a function that receives a word as input and says if it is a palindrome.
def palindrome(word):
    return word.lower() == word[::-1].lower()

print(palindrome(input()))    # True or False
