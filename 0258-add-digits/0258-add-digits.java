class Solution {
    public int addDigits(int num) {
       // pehla case jisme agar 0 jai toh return 0 hi karna hai
        if(num==0)
        return 0;
        //
        return 1+(num-1)%9;
    }
}