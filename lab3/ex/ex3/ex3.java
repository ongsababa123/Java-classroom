package lab3.ex.ex3;

import java.util.*;

public class ex3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0;
        System.out.print("Enter Number : ");
        number = input.nextInt();
        degit cal = new degit(number);
        cal.makeString();
        cal.show();
        input.close();
    }
}