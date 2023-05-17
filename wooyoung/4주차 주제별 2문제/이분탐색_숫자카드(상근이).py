N = int(input())
list_n = list(map(int,input().split()))
list_n.sort()

listDic = {}

for i in list_n:
    if i not in listDic:
        listDic[i] = 1
    else:
        listDic[i] = listDic[i] + 1

M = int(input())
list_m = list(map(int, input().split()))

for n in list_m:
    start = 0
    end = N -1

    while start <= end:
        mid = (start+end)//2

        if list_n[mid] == n:
            break

        if list_n[mid] > n:
            end = mid - 1

        else:
            start = mid + 1
    if list_n[mid] == n:
        print(listDic[n], end=" ")
    else:
        print(0,end=" ")