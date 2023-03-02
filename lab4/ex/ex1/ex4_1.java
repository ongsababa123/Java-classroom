package lab4.ex.ex1;

import java.util.Scanner;

public class ex4_1 {
        
        int number;

    public ex4_1(int i) {
           
            if ((i % 3 == 0) && (i % 5 == 0)) {
                number = i;
            }
           
        }

    
   
    public static void main(String args[]) {
        int numberstart;
        int numberend;
        int cout=0;
        Scanner scan = new Scanner (System.in);

        do {
            System.out.print("Enter Start number : ");
            numberstart = scan.nextInt();
    
            System.out.print("Enter end number : ");
            numberend = scan.nextInt();
        } while (numberstart > numberend);
        

        for (int i = (int) numberstart; i < numberend; i++){
            ex4_1 out = new ex4_1 (i);
            if (out.number > 1) {
                System.out.print(out.number + " ");
                cout++;
                if (cout > 4 ) {
                    System.out.println(" ");
                    cout = 0;
                }
            }
            
        }
        scan.close();
    }
}
