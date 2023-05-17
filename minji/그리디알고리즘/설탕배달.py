import sys

n = int(sys.stdin.readline().rstrip())

if n % 5 == 0:
    print(n // 5)
else:
    result = 0
    while n > 0:
        n -= 3
        result += 1
        if n % 5 == 0:
            result += n // 5
            print(result)
            break
        elif n == 1 or n == 2:
            print(-1)
            break
        elif n == 0:
            print(result)
            break
