class Solution {
    public int rearrangeCharacters(String s, String target) {
        Map<Character,Integer>have=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            have.put(ch,have.getOrDefault(ch,0)+1);
        }
        Map<Character,Integer>need=new HashMap<>();
        for(int i=0;i<target.length();i++){
            char ch=target.charAt(i);
            need.put(ch,need.getOrDefault(ch,0)+1);
        }
        int res=Integer.MAX_VALUE;
        for(char c:need.keySet()){
            int fhave=need.get(c);
            int fneed=have.getOrDefault(c,0);
            int time=fneed/fhave;
            res=Math.min(res,time);
        }return res;
    }
}