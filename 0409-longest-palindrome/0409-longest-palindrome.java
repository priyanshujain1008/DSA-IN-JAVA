class Solution {
    public int longestPalindrome(String s) {
       Map<Character,Integer>help=new HashMap<>();
       for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        help.put(ch,help.getOrDefault(ch,0)+1);
       }
       boolean odd=false;
       int res=0;
       for(char c: help.keySet()){
        int val=help.get(c);
        int sec=help.getOrDefault(c,0);
        if(sec%2==0){
            res+=sec;
        }else{
            odd=true;
        }
        
       }if(odd==false)
       {
        return res;
       }
        for(char c:help.keySet()){
            int val=help.get(c);
            int sec=help.getOrDefault(c,0);
            if(sec%2==1){
                res+=sec-1;
            }
        }return res+1;


    }
}