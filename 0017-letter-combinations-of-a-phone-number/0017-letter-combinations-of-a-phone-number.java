class Solution {
   static String [] map={
    "","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"
   };
   public  static void fun(String digits, int n, int idx, String diary, List<String>res){
        if(idx==n){
            res.add(diary);
            return;
        }

        String choice = map[digits.charAt(idx)-'0'];
        for(int j=0;j<choice.length();j++){
            fun(digits, n, idx + 1, diary + choice.charAt(j), res);;
        }
    }
    public List<String> letterCombinations(String digits) {
        int n=digits.length();
        int idx=0;
        String diary="";
        List<String>res=new ArrayList<>();
        if(digits.length()==0){
            return res;
        }
        fun(digits,n,0,diary,res);
        return res;
    }
}