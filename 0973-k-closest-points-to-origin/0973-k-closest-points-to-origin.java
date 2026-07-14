class Solution {
    class Pair{
        int first;
        int second;

        Pair(int f, int s){
            this.first=f;
            this.second=s;
        }
    }
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Pair>pq=new PriorityQueue<>((a,b)-> {
            if(a.first==b.first){
                return b.second-a.second;
            }return b.first-a.first;
        });

      for(int i=0;i<points.length;i++){
        int x=points[i][0];
        int y=points[i][1];

        int distance =(x*x)+(y*y);
        Pair curr=new Pair(distance,i);

        if(pq.size()<k){
            pq.add(curr);
        }else{
            if(curr.first<pq.peek().first){
                pq.poll();
                pq.add(curr);
            }
        }
      } int[][] res=new int [k][2];
      int i=0;

      while(!pq.isEmpty()){
        var node=pq.poll();
        res[i][0] = points[node.second][0];
        res[i][1] = points[node.second][1];
        i++;
      }return res;
        
        
    }
}