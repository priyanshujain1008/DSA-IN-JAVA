class Solution {
    public boolean isBlooming(int[] bloomDay, int m, int k, int mid){
        int count=0, bouqets=0;
        for(int bloom: bloomDay){
            if(bloom<=mid){
                count++;
                if(count==k){
                    bouqets++;
                    count=0;
                }
                }else{
                    count=0;
                }
            }return bouqets >=m;
        } 
   
 
    public int minDays(int[] bloomDay, int m, int k) {
        int res=-1;
        int low=bloomDay[0], high=0;
        for(int i=0;i<bloomDay.length;i++){
            low=Math.min(low,bloomDay[i]);
            high=Math.max(high,bloomDay[i]);

        }
        while(low<=high){
            int mid=low+(high-low)/2;
            if(isBlooming(bloomDay, m , k, mid)){
                res=mid;
                high=mid-1;

            }else{
                low=mid+1;
            }
        }return res;
    }
}