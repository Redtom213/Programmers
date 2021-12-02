import random

manList = ['권민석', '김미래', '김훈', '임주혁']
post_day = ['8일', '15일', '22일', '29일']


def mobile():
    temp = random.choice(manList)
    manList.pop(manList.index(temp))
    return temp


for day in post_day:
    print('1월 {} 당직은 {}입니다.'.format(day, mobile()))
