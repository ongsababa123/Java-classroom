package midterm.midterm2;
import java.util.Scanner; 

public class one {
    private String text = "";

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        one output = new one();
        String text = "";
        System.out.print("Please Enter Singular Nouns ");
        text = scan.nextLine();

        output.Checknouns(text);
        scan.close();

    }

    public static String Checknouns(String text1) {
      
        char[] text2 = text1.toCharArray();
        

      
        
         for (int i = 0; i < text2.length; i++){
            System.out.print(text2[i]);
            System.out.print(text2.length);

        }
        
        return text1;

    }
}
