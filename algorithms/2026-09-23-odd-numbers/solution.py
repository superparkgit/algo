def solution(n):
    answer = []

    for number in range(1, n + 1):
        if number % 2 == 1:
            answer.append(number)

    return answer
