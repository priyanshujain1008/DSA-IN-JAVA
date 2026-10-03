class Solution {
    public boolean isPalindrome(int x) {
        int rev=0;
        int orignal=x;
        while(x>0){
            int digit=x%10;
            x/=10;
            rev=rev*10+digit;  
            
        }
        
        if(rev==orignal){
            return true;
        }else{
            return false;
        }
    }
}