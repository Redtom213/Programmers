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


print(solution(["marina", "josipa", "nikola", "vinko", "filipa"], [
      "josipa", "filipa", "marina", "nikola"]))
