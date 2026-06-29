class Solution {

    public long helper(int []piles, int guess){
        long hours=0;
        for(int i=0;i<piles.length;i++){
            hours+=piles[i]/guess;
            if(piles[i]%guess!=0){
                hours++;
            }
        }return hours;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int res=-1;
      int n=piles.length;
      int low=1;
      int high = piles[0];
      for(int i=1;i<piles.length;i++){
        high = Math.max(high, piles[i]);
      }
      while(low<=high){
        int guess=low+(high-low)/2;

        long hours=helper(piles,guess);
        if(hours>h){
            low=guess+1;
        }else{
            res=guess;
            high=guess-1;
        }
      }return res;


    }
}