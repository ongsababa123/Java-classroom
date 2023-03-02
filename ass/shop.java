package ass;

import java.io.*;
import java.util.Scanner;

public class shop {

  public static void main(String[] args) {
    String name;
    String id_;
    shop object = new shop();
    Scanner scan = new Scanner(System.in);
    int n = 0;

    do {

      System.out.println("\t \t Menu");
      System.out.println("\t Select number menu");
      System.out.println("1. Shopping");
      System.out.println("2. Add item");
      System.out.println("3. Wallet");
      System.out.println("4. check");
      System.out.println("5. delete");
      n = scan.nextInt();
      if (n == 1) {// shopping
        object.showitem();
      } else if (n == 2) {// add item
        object.additem();
      } else if (n == 3) {// wallet

      } else if (n == 4) {// check

        object.check();
      } else if (n == 5) {// delete
        object.delete();
      }

    } while (n <= 0 || n >= 6);
    // object.readfile();
    scan.close();
  }

  public void showitem() {
    try {
      File myObj = new File("ass/product.txt");
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        System.out.println(data);
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }

  public void additem() {
    Scanner scan = new Scanner(System.in);
    String id, name;
    int price, stock, count = 0;

    try (FileWriter f = new FileWriter("ass/product.txt", true);
        BufferedWriter b = new BufferedWriter(f);
        PrintWriter p = new PrintWriter(b);) {
      File myObj = new File("ass/product.txt");
      Scanner myReader = new Scanner(myObj);

      do {
        System.out.println("Enter id item");
        id = scan.nextLine();
        while (myReader.hasNextLine()) {
          String data = myReader.nextLine();
          String s = String.valueOf(id);
          if (s.equals(data)) {
            System.out.println("Duplicate");
            count++;
          }
        }
      } while (count > 1);

      do {
        System.out.println("Enter name item");
        name = scan.nextLine();
        if (name.length() >= 10) {
          System.out.println("e kuyman kern e ha");
        }
      } while (name.length() >= 10);

      char[] tmp = new char[name.length()];

      System.out.println("Enter price item");
      price = scan.nextInt();

      System.out.println("Enter Stock item");
      stock = scan.nextInt();
      p.print(id + "\t" + name);
      int cha = 10 - name.length();
      for (int i = 0; i < cha; i++) {
        p.print(" ");
      }
      p.println("\t" + price + "\t\t" + stock);
    } catch (IOException i) {
      i.printStackTrace();
    }
  }

  public void check() {
    String id = "01";
    String name = "salmon";

    try {
      File myObj = new File("ass/product.txt");
      Scanner myReader = new Scanner(myObj);

      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        String[] check = data.split("\t");
        System.out.println(check[0]);
        System.out.println(check[1]);

        if (id.equals(check[0])) {
          System.out.println("kuy");
        }

        if (name.equals(check[1])) {
          System.out.println("nahee");
        }
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }

  public void delete() {
    String id = "01";
    String name = "salmon";
    try {
      File myObj = new File("ass/product.txt");
      Scanner myReader = new Scanner(myObj);

      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        String[] check = data.split("\t");
        // System.out.println(check[0]);

        if (id.equals(check[0]) && name.equals(check[1])) {
          System.out.println("kuy");
        }
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}
