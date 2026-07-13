class Solution {
    class Pair{
        int first;
        int second;
        Pair(int f, int s){
            this.first=f;
            this.second=s;
        }
    }
    public int[] topKFrequent(int[] nums, int k) {
       PriorityQueue<Pair>pq=new PriorityQueue<>((a,b)-> a.first-b.first);
       Map<Integer,Integer>help=new HashMap<>();

       for(int num:nums){
        help.put(num,help.getOrDefault(num,0)+1);
       } 
       for(int element:help.keySet()){
        int freq=help.get(element);
        Pair curr=new Pair(freq,element);
        if(pq.size()<k){
            pq.add(curr);
        }else{
            if(curr.first>pq.peek().first){
                pq.poll();
                pq.add(curr);
            }
        }
       }
       int []res=new int[k];
       int j=0;
       while(!pq.isEmpty()){
        res[j++]=pq.poll().second;
       }return res;
    }
}