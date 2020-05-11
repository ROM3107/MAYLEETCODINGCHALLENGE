class Solution:
    def firstUniqChar(self, s: str) -> int:
        for i in s:
            if s.find(i)==s.rfind(i):
                return s.find(i)
        return -1
    
        