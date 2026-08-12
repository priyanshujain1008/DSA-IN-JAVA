class Solution {
    public int maxVowels(String s, int k) {
        int count=0;
        int m=s.length();
        int left=0;
        int res=Integer.MIN_VALUE;
        for(int right=0;right<m;right++){
            if(s.charAt(right)=='a' || s.charAt(right)=='e' || s.charAt(right)=='i' || s.charAt(right)=='o' || s.charAt(right)=='u'){
                count++;
            }
            if(right-left+1==k){
                res=Math.max(res,count);
                if(s.charAt(left)=='a' || s.charAt(left)=='e' || s.charAt(left)=='i' || s.charAt(left)=='o' || s.charAt(left)=='u'){
                    count--;
                }
                left++;
            }

        }return res;
    }
}