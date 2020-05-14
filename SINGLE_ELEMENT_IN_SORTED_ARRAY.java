class Solution {
    public int singleNonDuplicate(int[] nums) {
        int result = 0;
        for(int i: nums)
            result= result^i;
        return result;
        
        
    }
}

