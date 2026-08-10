class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int m=s1.length();
        int n=s2.length();
     //check wheteher s1 ke characters are present in s2 or not
     //agar humari s1 ki legth s2 se kam hai toh retunr false karna hai
     if(s1.length()>s2.length()){
        return false;
     }

     //s1 ka table ready karlete hai
       Map<Character,Integer>frequency=new HashMap<>();
       for(int i=0;i<s1.length();i++){
        char ch=s1.charAt(i);
        frequency.put(ch,frequency.getOrDefault(ch,0)+1);
       }
       Map<Character,Integer>helper2=new HashMap<>();
       int left=0;
       for(int right=0;right<n;right++){
        char c1=s2.charAt(right);
        helper2.put(c1,helper2.getOrDefault(c1,0)+1);

        if(right-left+1 > m){
            char rem=s2.charAt(left);

            if(helper2.get(rem)==1){
                helper2.remove(rem);
            }else{
            helper2.put(rem,helper2.get(rem)-1);
            }
            left++;
        }if(frequency.equals(helper2)){
            return true;
        }
        
    }return false;
    }
}
