package lab5.lab5_3;

import javax.swing.JOptionPane; 

public class lab5_3 {
    
    public static void main(String[] args){       
        int value;       
        String output = "";       
        // loop 20 times       
        for ( int counter = 1; counter <= 20; counter++ ){          
            // pick random integer between 1 and 6          
            value = 1 + ( int ) ( Math.random() * 6 );          
            output += value + "  ";  
            // append value to output          
            // if counter divisible by 5, append newline to String output          
            if ( counter % 5 == 0 )             
            output += "\n";       
        } 
        // end for       
        JOptionPane.showMessageDialog( null, output,"20 Random Numbers from 1 to 6",JOptionPane.INFORMATION_MESSAGE );       
        System.exit( 0 );  
        // terminate application    
    } 
}  

