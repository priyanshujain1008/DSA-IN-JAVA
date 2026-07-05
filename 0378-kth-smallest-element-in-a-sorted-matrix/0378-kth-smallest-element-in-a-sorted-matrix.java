class Solution {
    public int helper(int[][]matrix, int n, int m, int mid){
        int col=0,
        row=n-1,
        count=0;

        while(row>=0 && col<m){
            if(matrix[row][col]<=mid){
                count=count+row+1;
                col++;
            }else{
                row--;
            }
        }return count; 
    }
    public int kthSmallest(int[][] matrix, int k) {
    int  n=matrix.length,
         m=matrix[0].length,
         low=matrix[0][0],
         high=matrix[n-1][m-1],
         res=-1;

         while(low<=high){
            int mid=(low+high)/2;
            int answer=helper(matrix,n,m,mid);
            if(answer<k){
                low=mid+1;
            }else{
                res=mid;
                high=mid-1;
            }
         }return res;
    }
}