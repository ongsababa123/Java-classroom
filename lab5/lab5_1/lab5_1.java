package lab5.lab5_1;

import java.util.Scanner; 
import java.text.DecimalFormat;

public class lab5_1 {
    

public static void main(String[] args) {         
    double value;         
    Scanner scan = new Scanner(System.in);         
    System.out.println("Enter floating number : ");         
    value = scan.nextDouble();        
     System.out.println("\nCeiling of " +value+ " is " + Math.ceil(value));         
     System.out.println("Floor of " + value + " is " + Math.floor(value));         
     System.out.println("Square root of "+value+" is "+Math.sqrt(value));         
     System.out.println("Exponential of " + value+" is " + Math.exp(value));         
     System.out.println("Absolute of " + value + " is " +Math.abs(value));         
     System.out.println("Natural logarithm of "+value+" is "+Math.log(value));         
     System.out.println("Power three of " +value+ " is "+Math.pow(value,3));         
     System.out.println();         
     for(int n = 1 ; n <= 75 ; n++)  
     System.out.print("=");         
     System.out.println("\n Angle\t\tSin\t\t\tScos\t\t\ttan");         
     for(int n = 1 ; n <= 75 ; n++)  
     System.out.print("=");         
     System.out.println();         
     DecimalFormat twoDigit = new DecimalFormat("0.00");         
     DecimalFormat sixDigit = new DecimalFormat("0.000000");         
     for(double angle = 0.0 ; angle <= 360 ; angle += 40.0) {            
         double radians = angle/180.0 * Math.PI;             
         System.out.print( twoDigit.format(angle) + "\t\t" );             
         System.out.print( sixDigit.format(Math.sin(radians)) + "\t\t" );             
         System.out.print( sixDigit.format(Math.cos(radians)) + "\t\t" );             
         System.out.println( sixDigit.format(Math.tan(radians)) );         
        }     
        scan.close();
    }
}
