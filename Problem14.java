public class HelloWorld{

     public static void main(String []args){
        System.out.println("Answer: " + collatz(1000000));
     }
     
     public static int collatz(int limit) {
         long result = 0l;
         int maxLength = 0;
         int length;
         int [] array = new int[limit];
         for (int i = 0; i < limit; i++) {
            array[i] = -1;
        }
         array[1] = 1;
         for (int i = 2; i < limit; i++) {
             result = i;
             length = 0;
             while (result != 1 && result >= i) {
                 length++;
                 if ((result % 2) == 0) {
                     result/=2;
                 }
                 else {
                    result = 3*result + 1;
                 }  
             }
             array[i] = length + array[(int)result];
             if (array[i] > maxLength) {
                 maxLength = array[i];
                 System.out.println(i);
             }
         }
         return maxLength;
     }
}