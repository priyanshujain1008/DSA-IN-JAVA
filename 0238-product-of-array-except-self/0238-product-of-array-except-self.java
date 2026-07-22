class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int []res=new int[n];
        res[0]=1;
        for(int i=1;i<n;i++){
            res[i]=res[i-1]*nums[i-1];
        }
        int rightProduct=1;
        for(int right=n-1;right>=0;right--){
            res[right]=res[right] * rightProduct;
            rightProduct = rightProduct * nums[right];
        } return res;
    }
}