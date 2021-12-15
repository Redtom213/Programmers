N = int(input())  # 5

for i in range(N):
    OX = input()
    score = 0
    point = 1

    for j in range(len(OX)):
        if(OX[j] == "O"):
            score += point
            point += 1
        else:
            point = 1
    print(score)
