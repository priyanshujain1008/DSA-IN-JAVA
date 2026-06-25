class Solution {
    public int findMin(int[] nums) {
        int n=nums.length;
        int low=0, high=n-1, res=-1;

        while(low<=high){
            int mid=(low+high)/2;
           if(nums[mid]>nums[n-1]){
            low=mid+1;
           } else{
            res=mid;
            high=mid-1;
           }
        }return nums[res];
    }
}