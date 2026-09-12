class Solution {
    public int[] shuffle(int[] nums, int n) {
        int capacity=nums.length;
        // yeh toh x ke liye
        int mid=capacity/2;
        int s2=capacity-mid;
     
       int[] res=new int[nums.length];
        for(int i=0;i<n;i++){
            int x=nums[i];
            int y=nums[s2+i];

            res[2*i]=x;
            res[2*i+1]=y;
            
        }return res;



    }
}