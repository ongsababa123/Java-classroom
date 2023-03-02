package homework.anagram;

import java.util.Arrays;
import java.util.Scanner;

public class anagram {

    private String text1 = "";
    private String text2 = "";
    private boolean status = true;

    public static void main(String args[]) {
        anagram output = new anagram();
        Scanner scan = new Scanner(System.in);
        String text1 = "";
        String text2 = "";
        System.out.println("Enter text [1]");
        text1 = scan.nextLine();

        System.out.println("Enter text [2]");
        text2 = scan.nextLine();

        output.settext(text1, text2);
        output.setanagram();
        output.display();

        scan.close();
    }

    public void settext(String text1, String text2) {
        this.text1 = text1.replaceAll("\\s", "");
        
        this.text2 = text2.replaceAll("\\s", "");
    
    }

    public void setanagram() {

        if (this.text1.length() != this.text2.length()) {
            this.status = false;
        } else {

            char[] arrayS1 = this.text1.toLowerCase().toCharArray();

            char[] arrayS2 = this.text2.toLowerCase().toCharArray();
            Arrays.sort(arrayS1);
            Arrays.sort(arrayS2);
            this.status = Arrays.equals(arrayS1, arrayS2);
        }
    }

    public void display(){
        if (this.status) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
