class Solution:
    def numJewelsInStones(self, J: str, S: str) -> int:
        r=0
        for i in J:
            r += S.count(i)
        return r
        