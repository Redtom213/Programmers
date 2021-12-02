
import collections


def solution(participant, completion):
    answer = ''

    hashKeys = {}  # 파이썬에서 해쉬맵은 딕셔너리라는 거를 쓰더라구요
    sumHash = 0

    for man in participant:
        hashKeys[hash(man)] = man
        sumHash += hash(man)  # sumHash = sumHash + hash(man)

    print(hashKeys)

    for man in completion:
        sumHash -= hash(man)  # sumHash = sumHash - hash(man)

    answer = hashKeys[sumHash]

    return answer


participant = ["marina", "josipa", "nikola", "vinko", "filipa"]
completion = ["josipa", "filipa", "marina", "nikola"]

print(solution(participant, completion))
