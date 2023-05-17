import sys

n = int(sys.stdin.readline().rstrip())
a = list(map(int, sys.stdin.readline().split()))
l = [0]

for i in a:
    if l[-1] < i:
        l.append(i)
    else:
        left = 0
        right = len(l)
        while left < right:
            mid = (left + right) // 2
            if l[mid] < i:
                left = mid + 1
            else:
                right = mid
        l[right] = i

print(len(l) - 1)