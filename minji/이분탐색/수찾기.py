import sys

n = int(sys.stdin.readline().rstrip())
arr = list(map(int, sys.stdin.readline().split()))
m = int(sys.stdin.readline().rstrip())
x = list(map(int, sys.stdin.readline().split()))

arr.sort()


def binary_search(arr, target, start, end):
    while start <= end:
        mid = (start + end) // 2
        if arr[mid] == target:
            return mid
        elif arr[mid] > target:
            end = mid - 1
        else:
            start = mid + 1
    return None


for i in x:
    result = binary_search(arr, i, 0, n - 1)
    if result is not None:
        print(1)
    else:
        print(0)