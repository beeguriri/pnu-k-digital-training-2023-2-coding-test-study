import sys

n = int(sys.stdin.readline().rstrip())
un_list = []
s_list = []


def merge_sort(list):
    if len(list) <= 1:
        return list
    mid = len(list) // 2
    left_list = list[:mid]
    right_list = list[mid:]
    left_list = merge_sort(left_list)
    right_list = merge_sort(right_list)
    return merge(left_list, right_list)


def merge(left, right):
    merge_list = []
    l = h = 0
    while l < len(left) and h < len(right):
        if left[l] < right[h]:
            merge_list.append(left[l])
            l += 1
        else:
            merge_list.append(right[h])
            h += 1
    merge_list += left[l:]
    merge_list += right[h:]
    return merge_list


for i in range(n):
    num = int(sys.stdin.readline().rstrip())
    un_list.append(num)

s_list = merge_sort(un_list)

for i in s_list:
    print(i)
