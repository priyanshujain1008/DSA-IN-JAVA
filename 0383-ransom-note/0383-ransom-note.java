class Solution {

    public boolean fun(Map<Character,Integer> have, Map<Character,Integer> need){
        for(char c: need.keySet()){
            int fneed=need.get(c);
            int fhave=have.getOrDefault(c,0);

            if(fhave<fneed){
                return false;
            }
                
        }return true;
    }
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character,Integer> have= new HashMap<>();
        Map<Character,Integer> need= new HashMap<>();

        for(int i=0;i<ransomNote.length();i++){
            char ch=ransomNote.charAt(i);
            need.put(ch, need.getOrDefault(ch , 0)+1);
        }

        for(int i=0;i<magazine.length();i++){
            char ch=magazine.charAt(i);
            have.put(ch, have.getOrDefault(ch , 0)+1);
        }
        return fun(have,need);
    }
}