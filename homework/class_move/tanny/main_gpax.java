package homework.class_move.tanny;

import java.util.Scanner;

public class main_gpax {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        check ck = new check();
        int id_std1, id_std2,comp_and_cal;
        float gpax_std1, gpax_std2;
        String cal1_std1, cal1_std2, cal2_std1, cal2_std2, com_std1, com_std2, gpax, cal1, cal2;

        // STUDENT1
        System.out.print("Enter ID Student 1 : ");
        id_std1 = scan.nextInt();
        System.out.print("Enter GPAX Student 1 : ");
        gpax_std1 = scan.nextFloat();
        System.out.print("Enter Grade Comp prog 1 : ");
        com_std1 = scan.next();
        System.out.print("Enter cal1 Student 1: ");
        cal1_std1 = scan.next();
        System.out.print("Enter cal2 Student 1: ");
        cal2_std1 = scan.next();

        // STUDENT2
        System.out.print("Enter ID Student 2 : ");
        id_std2 = scan.nextInt();
        System.out.print("Enter GPAX Student 2 : ");
        gpax_std2 = scan.nextFloat();
        System.out.print("Enter Grade Comp prog 2 : ");
        com_std2 = scan.next();
        System.out.print("Enter cal1 Student 2: ");
        cal1_std2 = scan.next();
        System.out.print("Enter cal2 Student 2: ");
        cal2_std2 = scan.next();

        comp_and_cal = ck.ck_comp_and_cal(id_std1, id_std2,com_std1, com_std2, cal1_std1, cal1_std2, cal2_std1, cal2_std2);
        if (comp_and_cal == 1) {
            gpax = ck.ck_gpax(id_std1, id_std2, gpax_std1, gpax_std2);
            if (gpax.equals("=")) {
                cal1 = ck.ck_score(id_std1, id_std2,cal1_std1, cal1_std2);
                if (cal1.equals("=")) {
                    cal2 = ck.ck_score(id_std1, id_std2,cal2_std1, cal2_std2);
                    if (cal2.equals("=")) {
                        System.out.println("both");
                    } 
                } else {
                    System.out.println(cal1);
                }
            } else {
                System.out.println(gpax);
            }
        }else if(comp_and_cal == 2){
            System.out.print("None");
        } else {
            System.out.print(comp_and_cal);
        }
        scan.close();
    }
}
