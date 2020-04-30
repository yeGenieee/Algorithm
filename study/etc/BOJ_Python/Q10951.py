import sys

for lines in sys.stdin:
    a,b = map(int, lines.split(" "))
    print(a+b)