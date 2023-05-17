n = int(input())
list = []

for i in range(n):
    element = map(int, input().split())

list.append(element)
list.sort()
print(list[0]+list[1]+list[])

import heapq
import sys

input = sys.stdin.readline

n = int(input())
card = []
for _ in range(n):
    num = int(input())
    heapq.heappush(card, num)

result = 0
while len(card)>1:
    n1 = heapq.heappop(card)
    n2 = heapq.heappop(card)
    result += n1 + n2
    heapq.heappush(card, n1+n2)

print(result)
