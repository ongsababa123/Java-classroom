package lab3.ex.ex1;

import java.util.Scanner;

public class ex1 {
    
    float fh;
    
    public ex1 (float c){

        fh = (float) ((float)c*1.8+32);
    }

    public static void main (String[] args){
        
        float c;
        Scanner scan = new Scanner (System.in); 
        System.out.print("Enter fahrenheit : ");
        c = scan.nextFloat();
        
        ex1 output = new ex1(c);
        System.out.println("Celsius = " + output.fh);
        scan.close();
        
    }
}
