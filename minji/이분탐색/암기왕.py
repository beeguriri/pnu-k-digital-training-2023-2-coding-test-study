import sys


def binary_search(array, target, start, end):
    while start <= end:
        mid = (start + end) // 2
        if array[mid] == target:
            return mid
        elif array[mid] > target:
            end = mid - 1
        else:
            start = mid + 1
    return None


t = int(sys.stdin.readline().rstrip())
for _ in range(t):
    n = int(sys.stdin.readline().rstrip())
    array1 = list(map(int, sys.stdin.readline().split()))
    array1.sort()
    m = int(sys.stdin.readline().rstrip())
    array2 = list(map(int, sys.stdin.readline().split()))

    for i in array2:
        result = binary_search(array1, i, 0, n - 1)
        if result is not None:
            print(1)
        else:
            print(0)