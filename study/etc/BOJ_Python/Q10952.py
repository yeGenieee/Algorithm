import sys

for lines in sys.stdin:
    a,b = map(int, lines.split(" "))
    if (a == 0 and b == 0):
         break
    print(a+b)