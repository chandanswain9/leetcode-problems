class Solution:
    def countNumbersWithUniqueDigits(self, n: int) -> int:
        if n == 0:
            return 1

        result = 10
        unique_digits = 9
        available_digits = 9

        for i in range(2, n + 1):
            if available_digits == 0:
                break
            unique_digits *= available_digits
            result += unique_digits
            available_digits -= 1

        return result