import sys

n, c = map(int, sys.stdin.readline().split())
arr = []

for _ in range(n):
    arr.append(int(sys.stdin.readline().rstrip()))

arr.sort()

start = 1
end = arr[-1] - arr[0]
result = 0


def binary_search(arr, start, end):
    while start <= end:
        mid = (start + end) // 2
        cur = arr[0]
        cnt = 1
        for i in range(1, len(arr)):
            if arr[i] >= cur + mid:
                cnt += 1
                cur = arr[i]
        if cnt >= c:
            global result
            start = mid + 1
            result = mid
        else:
            end = mid - 1


binary_search(arr, start, end)
print(result)
