import sys

n = int(sys.stdin.readline().rstrip())
dic = {}
arr = list(map(int, sys.stdin.readline().split()))
for i in arr:
    if i not in dic:
        dic[i] = 1
    else:
        dic[i] += 1
m = int(sys.stdin.readline().rstrip())
x = list(map(int, sys.stdin.readline().split()))
for i in x:
    try:
        print(dic[i], end=' ')
    except:
        print(0, end=' ')

# 다른 방법
from collections import Counter

_ = sys.stdin.readline().rstrip()
N = sys.stdin.readline().split()
_ = sys.stdin.readline().rstrip()
M = sys.stdin.readline().split()

C = Counter(N)
for m in M:
    if m in C:
        print(C[m], end=' ')
    else:
        print(0, end=' ')