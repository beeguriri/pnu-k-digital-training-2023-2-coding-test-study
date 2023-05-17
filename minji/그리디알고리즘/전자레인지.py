import sys

t = int(sys.stdin.readline().rstrip())
seconds = [300, 60, 10]
a = 0
b = 0
c = 0

if t % 10 != 0:
    print(-1)
else:
    while t > 0:
        if t >= seconds[0]:
            t = t - seconds[0]
            a += 1
        elif seconds[1] <= t < seconds[0]:
            t = t - seconds[1]
            b += 1
        else:
            t = t - seconds[2]
            c += 1
    print(a, b, c)