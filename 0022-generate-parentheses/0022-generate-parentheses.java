class Solution {
     static void fun ( int open, int close,int n, String temp,List<String>res){
        if (open==n && close==n){
            res.add(temp);
            return;
        }
        if(open<n){
            
            fun(open+1,close,n, temp+"(",res);
        }
        if(close<open){
            
            fun(open,close+1,n,temp+")",res);

        }

    }

    
    public List<String> generateParenthesis(int n) {
        List<String>res=new ArrayList<>();
        fun(0,0,n,"",res);
        for(String str:res){
            System.out.println(str);
            
        }return res;

    }
}