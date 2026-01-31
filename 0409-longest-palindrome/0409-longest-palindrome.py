class Solution:
    def longestPalindrome(self, s: str) -> int:
        count = Counter(s)
        length = 0
        odd = False
        for v in count.values():
            length += (v // 2) * 2
            if v % 2 == 1:
                odd = True
        return length + 1 if odd else length