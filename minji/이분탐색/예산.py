import sys
n = int(sys.stdin.readline().rstrip())
array = list(map(int, sys.stdin.readline().split()))
m = int(sys.stdin.readline().rstrip())

start = 0
end = max(array)

while start <= end:
    mid = (start + end) // 2
    curr = 0
    for i in array:
        if i >= mid:
            curr += mid
        else:
            curr += i
    if curr <= m:
        start = mid + 1
    else:
        end = mid - 1

print(end)