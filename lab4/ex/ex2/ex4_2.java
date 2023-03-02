package lab4.ex.ex2;

import java.util.Scanner;

public class ex4_2 {
        static int n;
        int cal;
        int even;
        int odd ;
        int zero;
        String convert;

    public ex4_2(String convert){
        for (int i = 0;i < convert.length(); i++){

            n = Character.getNumericValue(convert.charAt(i));
            cal = n % 2;
           if (n == 0) {
               zero = zero + 1;
           }
           else if (cal == 0) {
               even = even + 1;
           }
           else{
               odd = odd + 1;
           }        
        }
    }
    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);  

        long number;
        System.out.print("Enter positive number : ");
        number = scan.nextLong();

        String convert = String.valueOf(number);
        
        ex4_2 out = new ex4_2(convert);
        
         System.out.println("Odd digit = " + out.odd);
         System.out.println("Odd even = " + out.even);
         System.out.println("Odd zero = " + out.zero);
        scan.close();
    }
}
