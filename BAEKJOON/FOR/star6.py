N = int(input())

for i in range(1, N + 1):
    if i < N / 2 + 1:
        star = 2 * i - 1
    else:
        star = (N-i) * 2 + 1
    print(" "*int((N-star)/2) + "*"*star + " "*int((N-star)/2))

""" N = 9
i : 1, 공백 = 4, 별 = 1
i : 2, 공백 = 3, 별 = 3
i : 3, 공백 = 2, 별 = 5
i : 4, 공백 = 1, 별 = 7
i : 5, 공백 = 0, 별 = 9 --> 2*i-1
i : 6, 공백 = 1, 별 = 7 --> 2*i - 9 
i : 7, 공백 = 2, 별 = 5
i : 8, 공백 = 3, 별 = 3
i : 9, 공백 = 4, 별 = 1

i : 6,   * : 7, need num : 1 = (N-i) * 2 +1
i : 7,   * : 5, need num : 3 = (N-i) * 2 +1
i : 8,   * : 3, need num : 5
i : 9,   * : 1, need num : 7
"""
