class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int m=s.length();
        int n=p.length();
        List<Integer>res=new ArrayList<>();


        if(m<n){
            return res;
        }
        Map<Character,Integer>h1=new HashMap<>();
        for(int i=0;i<n;i++){
            char c=p.charAt(i);
            h1.put(c,h1.getOrDefault(c,0)+1);
        }
        Map<Character,Integer>h2=new HashMap<>();
        int left=0;
        for(int right=0;right<m;right++){
            char g=s.charAt(right);
            h2.put(g,h2.getOrDefault(g,0)+1);

            if(right-left+1 >n){
                char cha=s.charAt(left);
                if(h2.get(cha)==1){
                    h2.remove(cha);
                    
            }
            else{
                h2.put(cha,h2.get(cha)-1);
            }left++;
            }
                if(h1.equals(h2)){
                res.add(left);
                
                      
                }
            }return res;
    }
}