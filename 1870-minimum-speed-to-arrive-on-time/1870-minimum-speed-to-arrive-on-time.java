class Solution {
    public double train(int[]dist,double hour,int mid){
        double time =0;

        for(int i=0;i<dist.length;i++){
           double t=(double)dist[i]/mid;

           if(i!=dist.length-1){
            time+=Math.ceil(t);
           }else{
            time+=t;
           }
                
            
        }return time;
    }
    
    public int minSpeedOnTime(int[] dist, double hour) {
        int low=1;
        int high=(int) 1e7;
        int res=-1;

        while(low<=high){
            int mid=low+(high-low)/2;
            double helped=train(dist,hour,mid);
            if(helped>hour){
                
                low=mid+1;
            }else{
                res=mid;
                high=mid-1;
            }
        }return res;
    }
    }
