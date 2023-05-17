import sys

k, n = list(map(int, sys.stdin.readline().split()))
arr = []
for _ in range(k):
    arr.append(int(sys.stdin.readline().rstrip()))

start = 1
end = max(arr)

while start <= end:
    mid = (start + end) // 2
    cnt = 0
    for i in range(k):
        cnt += arr[i] // mid
    if cnt >= n:
        start = mid + 1
    else:
        end = mid - 1

print(end)