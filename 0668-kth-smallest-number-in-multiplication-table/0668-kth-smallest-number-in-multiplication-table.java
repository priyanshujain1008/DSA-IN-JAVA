class Solution {
    public int fun(int m, int n, int mid){
        int row=m-1;
        int count=0;
        int col=0;
        while(row>=0 && col<n){
            if((row+1)*(col+1)<=mid){
                count+=row+1;
                col++;
            }else{
                row--;
            }
        }return count;
    }
    public int findKthNumber(int m, int n, int k) {
        int low=0, high=m*n,
        res=-1;
        while(low<=high){
            int mid=(low+high)/2;
            int answer=fun(m,n,mid);
            if(answer<k){
                low=mid+1;
            }else{
                res=mid;
                high=mid-1;
            }
        }return res;
        
    }
}