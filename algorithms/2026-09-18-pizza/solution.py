def solution(n):
    quotient = n // 7
    remainder = n % 7

    if remainder == 0:
        return quotient
    else:
        return quotient + 1
