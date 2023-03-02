package lab4.ex.ex3;

import java.util.Scanner;

public class ex4_3 {

  int check = 0;

  public ex4_3(int num) {

    for (int i = 2; i <= num / 2; ++i) {
      // condition for nonprime number
      if (num % i == 0) {
        check = check + 1;
      }
    }
  }

  public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);  

        int num;
        System.out.print("Enter positive number : ");
        num = scan.nextInt();
        
        ex4_3 output = new ex4_3(num);
    
        if (output.check == 0){
          System.out.println(num + " is a prime number.");
        }
        else{
          System.out.println(num + " is not a prime number.");
        }
          scan.close();
      }
}
