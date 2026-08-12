class Solution {
    public int minimumRecolors(String blocks, int k) {
        int left=0;
        int res=Integer.MAX_VALUE;
        int count=0;
        for(int right=0;right<blocks.length();right++){
            if(blocks.charAt(right)=='W'){
                count++;
            }
            if(right-left+1==k){
                res= Math.min(res,count);
                if(blocks.charAt(left)=='W'){
                    count--;    
                }
                left++;
            }
        }return res;
    }
}