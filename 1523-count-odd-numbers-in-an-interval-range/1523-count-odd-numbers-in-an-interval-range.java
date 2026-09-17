class Solution {
    public int countOdds(int low, int high) {
        // agar low odd hai toh +1 karna hai 
        int answer=0;
        if(low%2==0){
            answer=(high-low+1)/2;
        }else{
            answer=(high-low)/2+1;
        }return answer;
    }
}