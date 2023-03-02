package ass.mini;

import java.util.Scanner;

public class main_shop extends process {

    public static void main(String[] args) {
        main_shop main = new main_shop();

        for (int i = 0; i < 1;) { // ลูปไว้ ถ้ากรอกนอกเหนือจาก 1-5 จะกลับมารับเลขใหม่
            int number = main.display_menu();
            switch (number) {
                case 1:
                    clearScreen();
                    product_list();
                    enterkey();
                    clearScreen();
                    break;
                case 2:
                    clearScreen();
                    add_cart();
                    break;
                case 3:
                    clearScreen();
                    add_product();
                    break;
                // case 4: clearScreen(); add_stock_product();
                // break;
                case 5:
                    clearScreen();
                    show_cart();
                    enterkey();
                    clearScreen();
                    break;
                default:
                    System.out.println("\nNo selected item ! Please try again. \n");
                    enterkey();
                    clearScreen();
                    break;
            }
        }
    }

    private static void enterkey() {
    }

    public static int display_menu() {
        process object = new process();
        int number;
        do {

            String str_number;
            Scanner scannerr = new Scanner(System.in);
            System.out.println("----------Menu----------");
            System.out.println("1. Product list");
            System.out.println("2. Sale Product");
            System.out.println("3. Add Product");
            System.out.println("4. Add Stock Product");
            System.out.println("5. Show cart \n");
            System.out.println("Money : " + object.cashhh() + " bath");
            System.out.println("------------------------");
            System.out.print("Select Number : ");
            str_number = scannerr.nextLine();
            number = Integer.parseInt(str_number);

        } while (number <= 0 && number >= 9);

        return number;
    }
}
