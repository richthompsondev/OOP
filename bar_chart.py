from collections import Counter
import matplotlib.pyplot as plt


def print_ascii_bar_chart(data, symbol="#"):
    counter = Counter(data).most_common()
    chart = {category: symbol * frequency for category, frequency in counter}
    max_len = max(len(category) for category in chart)
    for category, frequency in chart.items():
        padding = (max_len - len(category)) * " "
        print(f"{category}{padding} |{frequency}")


def main():
    letters = "mississippimississippimississippimississippi"
    print_ascii_bar_chart(letters)
    # a new counter from keyword args
    sales = Counter(banana=15, tomato=4, apple=39, orange=30)
    print_ascii_bar_chart(sales, symbol="+")
    sales2 = Counter(banana=15, tomato=4, apple=39, orange=30).most_common()
    x, y = zip(*sales2)
    plt.bar(x, y)
    plt.show()


if __name__ == "__main__":
    main()
