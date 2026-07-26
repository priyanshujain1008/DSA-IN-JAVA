class Solution {
    static void fun(int[] candidates, int n, int idx,List<Integer>diary, List<List<Integer>>res,int sum, int target ){
       // yeh toh rha base case
        if(idx==n){
            if(sum==target)
            res.add(new ArrayList<>(diary));
            return;
        }
        fun(candidates,n,idx+1,diary, res,sum, target);
        if(candidates[idx]+sum<=target){
            diary.add(candidates[idx]);
            sum+=candidates[idx];
            fun(candidates,n,idx,diary,res,sum,target);
            diary.remove(diary.size()-1);
            sum-=candidates[idx];
            
        }return;
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
     int n=candidates.length;
     int idx=0;
     int sum=0;
     List<Integer>diary=new ArrayList<>();
     List<List<Integer>>res=new ArrayList<>();
     fun(candidates,n,idx,diary,res,sum,target);
     return res;
    }
};