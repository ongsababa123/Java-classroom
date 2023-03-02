package lab3.ex.ex2;

import java.util.Scanner;

public class ex2 {
    static int principal;
    float year1 = 0.0f, year2 = 0.0f,year3 = 0.0f,year4 = 0.0f,year5 = 0.0f;
    static float interest1 = 0.0f;

    public ex2 (float interest1 , int principal) {

        year1 = principal + (principal * (interest1/100));
        year2 = year1 + (year1 * (interest1/100));
        year3 = year2 + (year2 * (interest1/100));
        year4 = year3 + (year3 * (interest1/100));
        year5 = year4 + (year4 * (interest1/100));
    }

   
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    
    System.out.print("Enter principal : ");
    principal = scan.nextInt();

    System.out.println("Principal = " + principal);
    System.out.print("Enter interest : ");
    interest1 = scan.nextFloat();
   
    ex2 out = new ex2(interest1 , principal);

    System.out.println("Year 1 = " + out.year1);
    System.out.println("Year 2 = " + out.year2);
    System.out.println("Year 3 = " + out.year3);
    System.out.println("Year 4 = " + out.year4);
    System.out.println("Year 5 = " + out.year5);
    scan.close();
    }
}


