package homework.ROT_13;

import java.util.Scanner;

public class ROT_13 {
    private char[] input;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ROT_13 out = new ROT_13();
        String input = "";
        System.out.println("Enter text ");
        
        input = scan.nextLine();

        out.setInput(input);
        out.process(input);
        out.display(input);

        scan.close();
    }

    public void setInput(String input2) {
        this.input = new char[input2.length()];
        for (int i = 0; i < input2.length(); i++) {
            this.input[i] = input2.charAt(i);
        }
    }

    public void process(String input2) {
        for (int i = 0; i < input2.length(); i++) {

            if       (this.input[i] >= 'a' & this.input[i] <= 'm') this.input[i] += 13;
            else if  (this.input[i] >= 'A' & this.input[i] <= 'M') this.input[i] += 13;
            else if  (this.input[i] >= 'n' & this.input[i] <= 'z') this.input[i] -= 13;
            else if  (this.input[i] >= 'N' & this.input[i] <= 'Z') this.input[i] -= 13;
        }
    }

    public void display(String input2) {
        for (int i = 0; i < input2.length(); i++) {
            System.out.print(this.input[i]); 
        }
    }
}
