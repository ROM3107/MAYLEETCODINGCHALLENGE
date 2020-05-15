class Solution {
    public int maxSubarraySumCircular(int[] A) {
        int max=Integer.MIN_VALUE;
        int globalMax= Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int globalMin=Integer.MAX_VALUE;
        int sum=0;
        for(int i:A){
            sum+=i;
            globalMax=Math.max(globalMax,0)+i;
            max= Math.max(max,globalMax);
            
            globalMin=Math.min(globalMin,0)+i;
            min= Math.min(min,globalMin);
            
            
        }
        if(sum!=min){
            return Math.max(max,sum-min);
        }
        return max;
        
    }
}
