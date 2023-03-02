import java.util.stream.IntStream;

import javax.swing.*;

public class test {
    int MAXARRAYSIZE = 5;
    private String StudentName[] = new String[MAXARRAYSIZE];
    private int studentScore[] = new int[MAXARRAYSIZE];

    public static void main(String[] args) {
        String input = "";
        JTextArea textArea = new JTextArea(12, 25);
        test obj = new test();
        do {
            input = JOptionPane.showInputDialog("Main menu" + "\n" +
                    "=============================" + "\n" +
                    "1.Set new score" + "\n" +
                    "2.Show Average Score" + "\n" +
                    "3.Show Minimum Score" + "\n" +
                    "4.Show Maximum Score" + "\n" +
                    "5.Show All student Score" + "\n" +
                    "6.Exit");
            if (input.equals("1")) {
                obj.setscore();

            } else if (input.equals("2")) {
                obj.getAverage();
            } else if (input.equals("3")) {
                obj.getMin();
            } else if (input.equals("4")) {
                obj.getMax();
            } else if (input.equals("5")) {
                obj.Display(textArea);
            }
        } while (input.equals("6") == false);
    }

    public void setscore() {
        int j = 1;
        for (int i = 0; i < StudentName.length; i++) {

            String name = JOptionPane.showInputDialog("Enter name student" + j);
            this.StudentName[i] = name;
            String score = JOptionPane.showInputDialog("Enter Score student" + j);
            this.studentScore[i] = Integer.parseInt(score);
            j++;
        }
    };

    public void Display(JTextArea textArea) {
        String output = "";
        output += "Student Score total" + "\n";
        for (int i = 0; i < StudentName.length; i++) {
            output += this.StudentName[i] + "        " + this.studentScore[i] + "\n";

        }
        JOptionPane.showMessageDialog(null, output, "Student Score",
                JOptionPane.INFORMATION_MESSAGE);
    };

    public void getAverage() {
        int sum = 0;
        for (int n = 0; n < this.studentScore.length; n++) {
            sum += this.studentScore[n];
        }
        int avg = sum / this.studentScore.length;
        String output = "Average is = " + avg;
        JOptionPane.showMessageDialog(null, output, "Average",
                JOptionPane.INFORMATION_MESSAGE);
    }

    public void getMin() {
        int min = IntStream.of(this.studentScore).min().orElse(Integer.MAX_VALUE);
        String output = "Min Score is" + min + "\n";

        // String output = "Min Score is = "+ min;
        for (int i = 0; i < this.studentScore.length; i++) {

            if (this.studentScore[i] == min) {
                output += this.StudentName[i] + "     " + this.studentScore[i] + "\n";
            }
        }
        JOptionPane.showMessageDialog(null, output, "Min Score",
                JOptionPane.INFORMATION_MESSAGE);
    }

    public void getMax() {
        int max = IntStream.of(this.studentScore).max().orElse(Integer.MAX_VALUE);
        String output = "Max Score is" + max + "\n";

        for (int i = 0; i < this.studentScore.length; i++) {

            if (this.studentScore[i] == max) {
                output += this.StudentName[i] + "     " + this.studentScore[i] + "\n";
            }
        }
        JOptionPane.showMessageDialog(null, output, "max Score",
                JOptionPane.INFORMATION_MESSAGE);
    }

}
