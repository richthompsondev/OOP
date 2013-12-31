from collections import Counter


def count_letters(filename):
    letter_counter = Counter()
    with open(filename) as file:
        for line in file:
            line_letters = [char for char in line.lower() if char.isalpha()]
            letter_counter.update(Counter(line_letters))
    return letter_counter


def main():
    letter_counter = count_letters("pyzen.txt")
    for letter, count in letter_counter.items():
        print(letter, "->", count)
    for letter, count in letter_counter.most_common(5):
        print(letter, "->", count)


if __name__ == "__main__":
    main()
