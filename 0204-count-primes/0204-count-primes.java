class Solution {
    public int countPrimes(int n) {

        if(n<=1){
            return 0;
        }
        boolean[] iscomposite=new boolean[n];

        for(int i=2;i<=Math.sqrt(n);i++){
            if(iscomposite[i]){
                continue;
            }
            for(int j=i*i;j<n;j=j+i){
                iscomposite[j]=true;
            }
        }
        int count=0;
        for(int i=2;i<n;i++){
            if(!iscomposite[i]){
                count++;
            }
        }return count;
    }
}