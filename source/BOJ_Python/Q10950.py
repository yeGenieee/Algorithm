t = int(input())

for i in range(t):
    a = [int(i) for i in input().split(" ")]
    print("{}".format(sum(a)))