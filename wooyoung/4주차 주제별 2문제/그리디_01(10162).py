
T = int(input())

list = [300,60,10]
answer = []
count = 0

if T % 10 != 0:
    print(-1)
else:
    for i in list:
        count = (T // i)
        answer.append(count)
        T = T % i
    print(answer[0],answer[1],answer[2],sep=' ')