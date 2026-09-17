class Solution {
    public int subtractProductAndSum(int n) {
       int res=0;
       int product=1;
       int sum=0;
       while(n>0){
        int digit=n%10;
        n=n/10;

        product *= digit;
        sum += digit;
        res=product-sum;
       }return res; 
    }
}