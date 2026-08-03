class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int x=0;
        for(int i=0;i<n;i++){
             x=x^nums[i]^i;
             
            
        }return x=x^n;
    }
}