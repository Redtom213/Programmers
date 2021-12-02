def solution(participant, completion):
    answer = ''

    hashKeys = {}
    sumHash = 0

    for key in participant:
        hashKeys[hash(key)] = key
        sumHash += hash(key)

    print(hashKeys)

    for key in completion:
        sumHash -= hash(key)

    answer = hashKeys[sumHash]

    return answer


participant = ["marina", "josipa", "nikola", "vinko", "filipa"]
completion = ["josipa", "filipa", "marina", "nikola"]

print(solution(participant, completion))
