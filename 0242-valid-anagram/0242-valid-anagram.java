class Solution {
    public boolean isAnagram(String s, String t) {

        int m=s.length();
        int n=t.length();

        if(m!=n){
            return false;
        }
  
      Map<Character,Integer>helper1=new HashMap<>();
      for(int i=0;i<m;i++){
        char c=s.charAt(i);
        helper1.put(c,helper1.getOrDefault(c,0)+1);
      }

       Map<Character,Integer>helper2=new HashMap<>();
      for(int j=0;j<n;j++){
        char p=t.charAt(j);
        helper2.put(p,helper2.getOrDefault(p,0)+1);
      }

      if(helper1.equals(helper2)){
        return true;
      }else{
        return false;
      }


    }
}