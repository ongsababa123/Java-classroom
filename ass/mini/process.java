package ass.mini;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedReader;

import java.io.FileReader;

public class process {
    protected String arr_product[];
    protected int money = 1000;

    public static void product_list() {

        System.out.println("PRODUCT LIST");

        for (int i = 0; i < 95; i++) {
            System.out.print("-");
        }
        System.out.println("\nID\t\t\tName\t\t\tQuantity\t\tPrice");
        for (int i = 0; i < 95; i++) {
            System.out.print("-");
        }
        System.out.print("\n");
        try {
            File file = new File("product.txt");
            Scanner myReader = new Scanner(file);

            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String[] check = data.split("\t");
                System.out.println(check[0] + "\t\t\t" + check[1] + "\t\t\t" + check[2] + "\t\t\t" + check[3]);

            }

        } catch (FileNotFoundException e) {
            System.out.println("Error read file.");
            e.printStackTrace();
        }
        for (int i = 0; i < 95; i++) {
            System.out.print("-");
        }
        System.out.print("\n");

    }

    public static boolean check_dup(String str, int index) {
        try {
            File myObj = new File("product.txt");
            Scanner myReader = new Scanner(myObj);

            while (myReader.hasNextLine()) { // ลูปขอมูลในไฟล์
                String data = myReader.nextLine();
                String[] check = data.split("\t"); // นำข้อมูลในบรรทัดเก็บในอาเรย์
                if (check[index].equals(str)) { // ถ้าเช็คแล้วซ้ำกัน
                    return true;
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return false;
    }

    public static void add_product() { // เพิ่มสินค้า
        String id_product, name_product, str_price, str_quantity;
        boolean name, id;
        int price_product, quantity_product, total_cash;
        // อาเรย์ลิสเอาไว้รับข้อมูลที่จะเพิ่มสินค้าแล้วเขียนไฟล์ทีเดียว
        ArrayList<String> a_product = new ArrayList<String>();
        try {
            Scanner scan_add = new Scanner(System.in);
            FileWriter write = new FileWriter("product.txt", true);

            for (int i = 0; i < 1;) { // ลูปเช็คถ้ารับค่ามาแล้วมาซ้ำจะออกจากลูป
                System.out.print("Enter Id product : ");
                id_product = scan_add.nextLine();
                id = check_dup(id_product, 0); // เช็คว่า ID ซ้ำกับตัวอื่นหรือไม่
                if (id) {
                    System.out.println("ID is Duplicate.");
                } else {
                    a_product.add(id_product); // add เก็บไว่้ในลิสอาเรย์
                    i++; // เพิ่มค่า i เพื่อออกจากลูป
                }
            }

            for (int i = 0; i < 1;) { // ลูปเช็คถ้ารับค่ามาแล้วมาซ้ำจะออกจากลูป
                do {
                    System.out.print("Enter Name product : ");
                    name_product = scan_add.nextLine();
                    if (name_product.length() >= 7) {
                        System.out.println("characters exceed");
                        System.out.println("please enter try again");
                    }
                } while (name_product.length() >= 7);

                name = check_dup(name_product, 1); // เช็คว่า Name ซ้ำกับตัวอื่นหรือไม่
                if (name) {
                    System.out.println("Name is Duplicate.");
                } else {
                    a_product.add(name_product); // add เก็บไว่้ในลิสอาเรย์
                    i++; // เพิ่มค่า i เพื่อออกจากลูป
                }
            }

            System.out.print("Enter Qu antity product : ");
            quantity_product = scan_add.nextInt(); // add เก็บไว่้ในลิสอาเรย์
            System.out.print("Enter Price product : ");
            price_product = scan_add.nextInt(); // add เก็บไว่้ในลิสอาเรย์
            total_cash = quantity_product * price_product; // ยอดเงินที่จะต้องหัก
            deduct_cash(total_cash);
            str_quantity = Integer.toString(quantity_product); // แปลงให้เป็น String ให้เก็บในลิสได้
            str_price = Integer.toString(price_product); // แปลงให้เป็น String ให้เก็บในลิสได้
            a_product.add(str_quantity); // add เก็บไว่้ในลิสอาเรย์
            a_product.add(str_price); // add เก็บไว่้ในลิสอาเรย์

            for (int i = 0; i < a_product.size(); i++) {
                write.append(a_product.get(i) + "\t"); // เขียนลงไฟล์
            }
            write.append("\n"); // ขื้นบรทัดใหม่ไว้เพิ่มข้อมูลรอบถัดไป

            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void deduct_cash(int total_cash) { // ฟังชั่นหักเงิน
        try {
            File a_file = new File("cart.txt");
            Scanner Reader = new Scanner(a_file);
            int cash_int = 0;
            String cash = Reader.nextLine();
            cash_int = Integer.parseInt(cash);
            cash_int -= total_cash;
            cash = Integer.toString(cash_int);
            write_cash(cash);

        } catch (FileNotFoundException e) {
            System.out.println("Error read file.");
            e.printStackTrace();
        }

    }

    public static void write_cash(String cash) {
        try {
            FileWriter write = new FileWriter("cart.txt");
            write.write(cash);

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static String get_cash() {
        try {
            File a_file = new File("cart.txt");
            Scanner Reader = new Scanner(a_file);
            String cash = Reader.nextLine();
            return cash;
        } catch (FileNotFoundException e) {
            System.out.println("Error read file.");
            e.printStackTrace();
        }
        return "error";
    }

    public static void show_cart() {

        System.out.println("MY CART");
        for (int i = 0; i < 95; i++) {

            System.out.print("-");
        }
        System.out.println("\nID\t\t\tName\t\t\tAmount\t\tPrice\t\tPriceTotal");
        for (int i = 0; i < 95; i++) {
            System.out.print("-");
        }
        System.out.print("\n");
        try {
            File file = new File("cart.txt");
            Scanner myReader = new Scanner(file);
            while (myReader.hasNextLine()) {

                String data = myReader.nextLine();
                String[] check = data.split("\t");
                System.out.println(check[0] + "\t\t\t" + check[1] + "\t\t\t" + check[2] + "\t\t" + check[3] + "\t\t"
                        + check[4]);

            }

        } catch (FileNotFoundException e) {
            System.out.println("Error read file.");
            e.printStackTrace();
        }
        for (int i = 0; i < 95; i++) {
            System.out.print("-");
        }
        System.out.print("\n");
    }

    public static void add_cart() {
        Scanner scan = new Scanner(System.in);
        String input_id, aaa;
        int amount;
        String number;
        int tmp;
        boolean flag = false;
        do {
            do {
                clearScreen();
                product_list();

                System.out.println("Enter select menu");
                System.out.println("1. Select product");
                System.out.println("2. Select Checkbill");
                System.out.println("3  Select Clear Cart");
                System.out.println("4  Select Exit to menu");
                input_id = scan.nextLine();

                if (input_id.equals("1")) {
                    do {

                        clearScreen();
                        product_list();
                        input_id = "";
                        System.out.println("Enter Select Product");
                        input_id = scan.nextLine();
                        if (check_dup(input_id, 0)) {
                            flag = true;
                            try {
                                File b_file = new File("product.txt");
                                Scanner myReader = new Scanner(b_file);

                                while (myReader.hasNextLine()) {
                                    String data = myReader.nextLine();
                                    String[] check_id = data.split("\t");
                                    if (input_id.equals(check_id[0])) {
                                        System.out.println("You selected " + check_id[1]);

                                        System.out.println("Enter amount");
                                        amount = scan.nextInt();
                                        number = check_id[3];
                                        tmp = Integer.parseInt(number);
                                        int total = tmp * amount;

                                        additemtocart(check_id[0], check_id[1], amount, tmp, total);
                                    }
                                }
                            } catch (FileNotFoundException e) {
                                System.out.println("Error read file.");
                                e.printStackTrace();
                            }

                        } else {
                            System.out.println("ID not found Please Try again.");
                            enterkey();
                        }
                    } while (flag == false);
                    System.out.println("\n");
                    clearScreen();
                    show_cart();

                }

                if (input_id.equals("2")) {
                    check_bill();
                    break;
                }

                if (input_id.equals("3")) {
                    deletefile();

                }

                if (input_id.equals("4")) {
                    clearScreen();
                    break;
                } else {
                    System.out.println("not found");
                    break;
                }

            } while (checkloop());

        } while (checkloop2());
        clearScreen();
    }

    private static void enterkey() {
    }

    public static boolean checkloop() {
        String aaa;
        Scanner scan = new Scanner(System.in);
        System.out.println("Want to choose another product? (yes/no)");
        aaa = scan.nextLine();
        if (aaa.equals("yes")) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean checkloop2() {
        String aaa;
        Scanner scan = new Scanner(System.in);
        System.out.println("Want to choose exit? (yes/no)");
        aaa = scan.nextLine();
        if (aaa.equals("yes")) {
            return false;
        } else {
            return true;
        }
    }

    public static void additemtocart(String id, String name, int amount, int price, int total) {

        try (FileWriter f = new FileWriter("cart.txt", true);
                BufferedWriter b = new BufferedWriter(f);
                PrintWriter p = new PrintWriter(b);) {

            b.write(id + "\t" + name + "\t" + amount + "\t" + price + "\t" + total + "\n");

        } catch (

        IOException i) {
            i.printStackTrace();
        }
    }

    public static void check_bill() {
        String total;
        int price_total, tmp = 0, a;
        try {
            File myObj = new File("cart.txt");
            Scanner myReader = new Scanner(myObj);
            System.out.println("\nRECEIPT");
            show_cart();
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String[] check = data.split("\t");
                // System.out.println(data);
                total = check[4];
                price_total = Integer.parseInt(total);
                tmp = price_total + tmp;

            }
            System.out.println("Total Pice " + "\t\t\t\t\t\t\t\t\t" + tmp + " bath");

            // System.out.println("Withdrawal = " + money(tmp));
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        stock_checkbill();
        enterkey();
        clearScreen();
        deletefile();

    }

    public static void deletefile() {
        try {
            FileWriter myWriter = new FileWriter("cart.txt");
            myWriter.write("");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public int cashhh() {

        return this.money;
    }

    public int money(int moneytotal) {
        process object = new process();
        int money = object.cashhh();

        money = money - moneytotal;
        return money;
    }

    public static void stock_checkbill() {
        int count = 0, i = 0;
        String[][] stock_data;
        String[][] cart_data;
        try {
            File myObj = new File("product.txt");
            try (Scanner read = new Scanner(myObj)) {
                while (read.hasNextLine()) {
                    String data = read.nextLine();
                    count++;
                }
                read.close();
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        stock_data = new String[count][4];
        try {
            File myObj = new File("product.txt");
            try (Scanner myReader = new Scanner(myObj)) {

                while (myReader.hasNextLine()) {
                    String data = myReader.nextLine();

                    for (int j = 0; j < 4; j++) {
                        String[] check = data.split("\t");

                        stock_data[i][j] = check[j];
                    }
                    i++;
                }
                myReader.close();
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        /////////////////////////////////////////////////////////////////
        int tmp = 0, f = 0;

        try {
            File myObj = new File("cart.txt");
            try (Scanner read = new Scanner(myObj)) {
                while (read.hasNextLine()) {
                    String data = read.nextLine();
                    tmp++;
                }
                read.close();
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        cart_data = new String[tmp][4];
        try {
            File myObj = new File("cart.txt");
            try (Scanner myReader = new Scanner(myObj)) {

                while (myReader.hasNextLine()) {
                    String data = myReader.nextLine();

                    for (int j = 0; j < 4; j++) {
                        String[] check = data.split("\t");

                        cart_data[f][j] = check[j];
                    }
                    f++;
                }
                myReader.close();
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        /////////////////////////////////////////////////////////////////////
        int z = 0;
        try {
            File myObj = new File("cart.txt");
            Scanner read = new Scanner(myObj);
            while (read.hasNextLine()) {
                String data = read.nextLine();

                if (cart_data[z][0].equals(stock_data[z][0])) {
                    int num1 = Integer.parseInt(cart_data[z][2]);
                    int num2 = Integer.parseInt(stock_data[z][2]);
                    int sum1 = num2 - num1;
                    String sum2 = String.valueOf(sum1);
                    stock_data[z][2] = sum2;
                }
                z++;
            }
            read.close();

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        //////////////////////////////////////////////////////////
        try {
            FileWriter myWriter = new FileWriter("product.txt");
            myWriter.write("");
            try (FileWriter s = new FileWriter("product.txt", true);
                    BufferedWriter b = new BufferedWriter(s);
                    PrintWriter p = new PrintWriter(b);) {
                for (int n = 0; n < stock_data.length; n++) {

                    b.write(stock_data[n][0] + "\t" + stock_data[n][1] + "\t" + stock_data[n][2] + "\t"
                            + stock_data[n][3] + "\n");

                }

            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

}
