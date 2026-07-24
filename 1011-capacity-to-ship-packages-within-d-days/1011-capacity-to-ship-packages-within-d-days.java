class Solution {
    static boolean isCapacity(int []weights,int days, int mid){
        int count=1, packageweight=0;

        for(int  i=0;i<weights.length;i++){
            if(packageweight+weights[i]<=mid){
                packageweight+=weights[i];
            }else{
                count++;
                if(count>days || weights[i]>mid){
                    return false;
                    
                }else{
                    packageweight=weights[i];
                          
                }
            }
        }return true;
    }
    public int shipWithinDays(int[] weights, int days) {
       int sum=0;
       int low=weights[0];
       for(int i=0;i<weights.length;i++){

        sum+=weights[i];
        low=Math.max(low,weights[i]);
       } 
       int high=sum;
       int res=-1;
       while(low<=high){
        int mid=low+(high-low)/2;

        if(isCapacity(weights,days,mid)){
            res=mid;
            high=res-1;
        }else{
            low=mid+1;
        }
       }return res;
    }
}