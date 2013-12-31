# Make a function that receives a word as input and says if it is a palindrome.
def palindrome(word):    
    return word.lower() == word[::-1].lower() 
    # return word.lower() == reversed(word.lower()) slightly faster with long entries, but reversed() returns an iterator object


print(palindrome(input()))  # True or False
