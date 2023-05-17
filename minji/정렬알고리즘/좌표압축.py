import sys

n = int(sys.stdin.readline().rstrip())
num_list = list(map(int, sys.stdin.readline().split()))

rank = 0
mean_num = min(num_list)
num_rank = {}

for i in sorted(num_list):
    if i > mean_num:
        mean_num = i
        rank += 1
    num_rank[i] = rank

print(*[num_rank[i] for i in num_list])