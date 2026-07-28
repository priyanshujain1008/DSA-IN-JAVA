class Solution {

    public  long Allocated(int[] candies,long k,  int mid){
      long candy=0;
      for(int i=0;i<candies.length;i++){
        if(candies[i]<mid){
            continue;
        }else{
            candy+=candies[i]/mid; 
            
        }
      }return candy;

    }
    public int maximumCandies(int[] candies, long k) {
        int low=1;
        int ans=0;
        int high=candies[0];
        for(int i=0;i<candies.length;i++){
            high=Math.max(high,candies[i]);
        }
        
        while(low<=high){
            int mid=low+(high-low)/2;
            long helper=Allocated(candies,k,mid);
            if(helper>=k){
                ans=mid;
                low=mid+1;
            }else{
                
                high=mid-1;
            }
        }return ans;
        
    }
}