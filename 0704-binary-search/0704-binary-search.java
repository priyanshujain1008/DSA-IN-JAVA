class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length;
        int low=0, high=n-1;
        while(low<=high){
            int predict=(low+high)/2;
            if(nums[predict]==target)
            return predict;

            if(nums[predict]<target){
                low=predict+1;
            }else{
                high=predict-1;
            }
        }return -1;
    }
}