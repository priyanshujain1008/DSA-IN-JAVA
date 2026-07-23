class Solution {
    static boolean solutioniscorrect(int[]nums,int k, int mid){
        int count=1;
        int length=0;

        for(int i=0;i<nums.length;i++){
            if(length+nums[i]<=mid){
                length+=nums[i];
            }else{
                count++;
                length=0;
                if(count > k || nums[i]>mid){
                    return false;
                }else{
                    length+=nums[i];
                }
            }
        }return true;
    }

    public int splitArray(int[] nums, int k) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        int res=-1;
        int low=0;
        int high=sum;
        while(low<=high){
            int mid=low+(high-low)/2;

            if(solutioniscorrect(nums,k,mid)){
                res=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }return res;

    }
}