package lab5.lab5_2.ex;

import javax.swing.JOptionPane; 

public class lab5_2ex {
    // double x, y, z;
    double nummax , nummin;
    double number1, number2, number3; 

    public lab5_2ex ( String s1,String s2,String s3){                                                           
        
        // convert user input to double values   
        number1 = Double.parseDouble( s1 );        
        number2 = Double.parseDouble( s2 );        
        number3 = Double.parseDouble( s3 );  

        nummax = Math.max( number1, Math.max( number2, number3) );  
        nummin = Math.min( number1, Math.min( number2, number3 ) );              
    } 
    public static void main(String[] args) {        
               
        String s1, s2, s3;        
        String output;        
        s1 = JOptionPane.showInputDialog("Enter first floating-point value" );        
        s2 = JOptionPane.showInputDialog("Enter second floating-point value" );        
        s3 = JOptionPane.showInputDialog("Enter third floating-point value" );        
        lab5_2ex out = new lab5_2ex( s1, s2, s3);    
             
        // lab5_2ex out = new lab5_2ex(number1, number2, number3 );        
          
        output = "number1: " + out.number1 + "\nnumber2: " + out.number2 ;        
        output += "\nnumber3: " + out.number3 + "\nmaximum is: " + out.nummax;        
        output += "\nminimum is: " + out.nummin;        
        JOptionPane.showMessageDialog( null, output);        
        System.exit(0);    
    }  
}  
   
