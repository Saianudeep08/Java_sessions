public class Day5_Loops {
    public static void main(String args[]){
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
        // for loop
        // 1. initialization
        // condition
        // incrementaition or decrementation
        for(int count=0; count<=4;count++){
        System.out.println(count);
    }
        for(int count=20; count<=35;count++){
        System.out.println(count);
    }
        for(int count=11;count<=20;count++){
            if( count%2==0){
            System.out.println(count);
        }
        }
        //Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars, or whatever is there if the string is less than length 3. Return n copies of the front;
        public String frontTimes(String str, int n) {
            String result = "";
            int end = 3;
            if(str.length()<3){
              end=str.length();
            }
            
            String front =str.substring(0,end);
            for(int i=0;i<n;i++){
            result = front + result;
            }
            return result;
          }
    }
}
