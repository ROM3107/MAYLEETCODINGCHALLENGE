class Solution {
    public String removeKdigits(String num, int k) {
        char digits[]= num.toCharArray();
        if(k>=digits.length)
            return "0";
        // Greedy logic!!
            
    StringBuilder sb = new StringBuilder();
        for(char digit:digits){
            while(sb.length()>0 && sb.charAt(sb.length()-1)>digit && k>0){
                sb.deleteCharAt(sb.length()-1);
                k--;
            }
            sb.append(digit);
        }
        //if any leading zeroes delete that
        while(sb.length()>1 && sb.charAt(0)=='0'){
            sb.deleteCharAt(0);
        }
        //delete the leftover elements.
        for(int i=0;i<k;i++){
            sb.deleteCharAt(sb.length()-1);
            
        }
        return sb.toString();
        
    }
}

