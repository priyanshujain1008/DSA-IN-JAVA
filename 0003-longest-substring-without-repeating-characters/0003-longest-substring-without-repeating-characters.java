class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> chain=new HashMap<>();
        int left=0, result=0;

        for(int right=0;right<s.length();right++){
            char c=s.charAt(right);
            chain.put(c,chain.getOrDefault(c,0)+1);


            //Condition to print result without duplicate characters
        while(chain.get(c) >1){
            char leftt=s.charAt(left);
            chain.put(leftt,chain.get(leftt)-1);
            left++;
        }
            result=Math.max(result,right-left+1);
        }return result;

    }
}