N = int(input())  # 3
M = list(map(int, input().split()))  # 60 80 40

B = max(M)  # 80
for i in range(N):
    M[i] = M[i]/B*100
print(sum(M)/N)
