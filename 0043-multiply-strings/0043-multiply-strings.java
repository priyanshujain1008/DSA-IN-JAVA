import java.math.BigInteger;
class Solution {
    public String multiply(String num1, String num2) {
     BigInteger B1=new BigInteger(num1);
     BigInteger B2=new BigInteger(num2);
     BigInteger B3= B1.multiply(B2);

     return B3.toString();
    }
}