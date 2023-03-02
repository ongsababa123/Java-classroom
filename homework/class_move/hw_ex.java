package homework.class_move;

import java.util.Scanner; 

public class hw_ex {
    
    int tmp = 0;
    
    private int comp1,cal1_1,cal1_2;
     int comp2,cal2_1,cal2_2;

    
  
    
    public static void main(String[] args) {
        hw_ex out = new hw_ex();
        String student;
        Scanner scan = new Scanner(System.in);         

        System.out.println("Enter info Student 1");
        student = scan.nextLine();
        String[] student_1 = student.split(" ");


        System.out.println("Enter info Student 2");
        student = scan.nextLine();
        String[] student_2 = student.split(" ");


        
       out.reverse(student_1,student_2);
       System.out.println(out.cal1_1);
        scan.close();
    }
   
    public void reverse(String[] student_1,String[] student_2) {
        comp1 = Integer.parseInt(student_1[2]);
        cal1_1 = Integer.parseInt(student_1[3]);
        cal1_2 = Integer.parseInt(student_1[4]);

        comp2 = Integer.parseInt(student_1[2]);
        cal2_1 = Integer.parseInt(student_1[3]);
        cal2_2 = Integer.parseInt(student_1[4]);
    }

    
       
    // public int check_gpax(String[] student_1, String[] student_2) {

    //     double gpax_1 = Double.parseDouble(student_1[1]);
    //     double gpax_2 = Double.parseDouble(student_2[1]);
    //     if (gpax_1 > gpax_2) {
    //         tmp = Integer.parseInt(student_1[0]);
    //     }
    //     else if (gpax_2 > gpax_1){
    //         tmp = Integer.parseInt(student_2[0]);
    //     }
    //     else{

    //     }
    //     return (Integer)tmp;
    // }

    
}
