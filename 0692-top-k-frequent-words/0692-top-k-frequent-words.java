class Solution {
    class Pair{
        int first;
        String second;
        Pair(int f, String s){
            this.first=f;
            this.second=s;
        }
    }
    public List<String> topKFrequent(String[] words, int k) {
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> {
    if (a.first == b.first) {
        return b.second.compareTo(a.second);
    } else {
        return a.first - b.first;
    }
});
        
        Map<String,Integer> help=new HashMap<>();
        
        //Count frequency...
        for(String word: words){
            help.put(word, help.getOrDefault(word,0)+1);
        }
        for(String wor:help.keySet()){
            int frequency=help.get(wor);
            Pair curr=new Pair(frequency,wor);

            if(pq.size()<k){
                pq.add(curr);
            }else{
                if (curr.first > pq.peek().first ||
    (curr.first == pq.peek().first &&
     curr.second.compareTo(pq.peek().second) < 0)){
                    pq.poll();
                    pq.add(curr);
                }
            }
        } List<String>res=new ArrayList<>();
        
        while(!pq.isEmpty()){
            res.add(pq.poll().second);
        }Collections.reverse(res);
        return res;
        
    }
}