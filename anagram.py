# Make a function that receives two words as input and says if they are anagrams.
def is_anagram(str1, str2):
    return sorted(str1) == sorted(str2)


print(is_anagram(input(), input()))  # True or False
