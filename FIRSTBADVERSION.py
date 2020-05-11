
class Solution:
    def firstBadVersion(self, n):
        low, high = 1, n
       
        while low <= high:
            mid = (low + high) // 2
            
            if isBadVersion(mid) and not isBadVersion(mid-1): 
                return mid
            elif not isBadVersion(mid): 
                low = mid+1
            else: high = mid-1
       
        return -1
        