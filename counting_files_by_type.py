from collections import Counter
import pathlib


def main():
    entries = pathlib.Path("C:/Users/username/Downloads/").iterdir()
    extensions = [entry.suffix for entry in entries if entry.is_file()]
    print(Counter(extensions))


if __name__ == "__main__":
    main()
