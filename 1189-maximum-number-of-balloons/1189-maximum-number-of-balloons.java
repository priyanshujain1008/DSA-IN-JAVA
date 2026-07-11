class Solution {
    public int maxNumberOfBalloons(String text) {
        Map<Character,Integer>have=new HashMap<>();
        for(int i=0;i<text.length();i++){
            char c=text.charAt(i);
            have.put(c,have.getOrDefault(c,0)+1);
        }
        Map<Character,Integer>need=new HashMap<>();
        need.put('b',1);
        need.put('a',1);
        need.put('l',2);
        need.put('o',2);
        need.put('n',1);

        int res=Integer.MAX_VALUE;
        for(char c:need.keySet()){
            int fneed=need.get(c);
            int fhave=have.getOrDefault(c,0);
            int times=fhave/fneed;
            res=Math.min(res,times);
        }return res;

    }
}