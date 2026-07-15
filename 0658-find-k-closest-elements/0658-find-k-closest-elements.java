import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    class Pair{
        int first;
        int second;

        Pair(int f, int s){
            this.first=f;
            this.second=s;
        }
    }
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Pair>pq=new PriorityQueue<>((a,b)->{
            if(a.first==b.first){
                return arr[b.second]-arr[a.second];
            }return b.first-a.first;
        });

        for(int i=0;i<arr.length;i++){
            int closest=Math.abs(arr[i]-x);

            Pair curr=new Pair(closest,i);
            if(pq.size()<k){
                pq.add(curr);
            }else{
                if(curr.first<pq.peek().first){
                    pq.poll();
                    pq.add(curr);
                }else if (curr.first == pq.peek().first) {
                 if (arr[curr.second] < arr[pq.peek().second]){
                 pq.poll();
                pq.add(curr);
}
                }
            }
        } int []res= new int [k];
        int i=0;

        while(!pq.isEmpty()){
            Pair node = pq.poll();
            res[i] = arr[node.second];
            i++;
        }
        return Arrays.stream(res).boxed().sorted().collect(Collectors.toList());
        

        
    }
}