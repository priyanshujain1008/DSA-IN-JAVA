class Solution {
    public int mySqrt(int x) {
        if(x<2){
            return x;
        }
        long low=0, high=x/2;

        while(low<=high){
            long mid=low+(high-low)/2;
            long square=mid*mid;

            if(square==x)
            {
                return (int) mid;
            }else if(square < x)
            {
                low=mid+1;
            }else
            {
                high=mid-1;
            }
        }return (int)high;
    }
}