class Solution {
    public List<String> fizzBuzz(int n) {

        // iske test cases toh samajh gya lekin isme humn last mein list ko string mein convert like a String. valueOf(i)   ----->>>> meanns converting no. into string values
        
         //aur loop humne 1 se chalayi bcz question mein de rkha tha 1-indexed se 
       List<String> answer=new ArrayList<>();
       for(int i=1;i<=n;i++){
        if(i%3==0 && i%5==0){
            answer.add("FizzBuzz");
        }else if(i%3==0){
            answer.add("Fizz");
        }else if(i%5==0){
            answer.add("Buzz");
        }else{
            answer.add(String.valueOf(i));
        }
       }return answer;  
    }
}