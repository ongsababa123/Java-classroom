package midterm;

import java.util.Scanner; 

public class Ordinal_Number {
    
    private int[] num;
    public static void main(String[] args) {
        Ordinal_Number output = new Ordinal_Number();
        Scanner scan = new Scanner(System.in);
        String number;
        int[] num;
        System.out.print("Please Enter Number Stick Together : ");
        number = scan.nextLine();
        
        char[] chars = ("" + number).toCharArray();
        num = new int[chars.length];
        for (int i=0; i < chars.length; i++){
            System.out.println(chars[i]);
        // if (chars[i] < chars[i+1]) {
        //     output.cal2(chars);
        //     break;
        // }

        // else if (chars[i] > chars[i+1]) {
        //     output.cal1(chars);
        //     break;
        // }
       
        }
        output.cal2(chars);

        scan.close();

    }

    public void cal1(char[] chars) {
        System.out.print("Result Ordinary Number is None");
    }

    public void cal2(char[] chars){
        for (int j = 0; j < chars.length; j++){
            System.out.print(chars[j]+", ");

         
        }
    }

    
}
