class Solution {
    public int maxSubArray(int[] nums) {
        int i=0;
        int bestending=nums[0];
        int sum=nums[0];

        for(int j=1;j<nums.length;j++){
            int v1=nums[j]+bestending;
            int v2=nums[j];

            bestending=Math.max(v1,v2);
            sum=Math.max(sum,bestending);
        }
        return sum;
    }
}