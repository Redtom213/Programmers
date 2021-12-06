H, M = map(int, input().split())

totalMinute = (60 * H) + (M - 45)

print(*(totalMinute//60, totalMinute % 60)
      if totalMinute >= 0 else (23, (60 + totalMinute)))
