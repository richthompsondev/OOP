from collections import Counter


def main():
    prices = {"course": 97.99, "book": 54.99, "wallpaper": 4.99}
    cart = Counter(course=1, book=3, wallpaper=2)

    for product, units in cart.items():
        subtotal = units * prices[product]
        price = prices[product]
        print(f"{product:9}: ${price:7.2f} × {units} = ${subtotal:7.2f}")


if __name__ == "__main__":
    main()
