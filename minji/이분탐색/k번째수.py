import sys

n = int(sys.stdin.readline().rstrip())
k = int(sys.stdin.readline().rstrip())


def binary_search(target, start, end):
    while start <= end:
        mid = (start + end) // 2
        cnt = 0
        for i in range(1, n + 1):
            cnt += min(mid // i, n)
        if cnt >= target:
            end = mid - 1
        else:
            start = mid + 1
    return start


print(binary_search(k, 1, n * n))
