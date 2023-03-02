package finaltest.final1;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;

import javax.swing.*;

public class GAME_6406021421171 extends JFrame implements ActionListener {
    JFrame window;
    static JLabel text;
    JLabel score;
    JLabel score_total;
    JTextField input;
    JButton check;
    static String array[] = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r",
            "s", "t", "u", "v", "w", "x", "y", "z" };
    String answer;
    int score_ = 5;

    public GAME_6406021421171() {
        Container container = getContentPane();
        container.setLayout(new FlowLayout());

        container.add(new JLabel("Game Alphabetbet guessing A-Z"));
        container.add(new JLabel("            please enter characters a-z:"));
        container.add(new JLabel("  "));

        input = new JTextField(3);
        input.setEditable(true);
        container.add(input);

        check = new JButton("Check");
        check.addActionListener(this);
        container.add(check);

        for (int i = 0; i < array.length; i++) {
            text = new JLabel(array[i]);
            container.add(text);
        }

        container.add(new JLabel("    Score = "));

        score = new JLabel(score_number(0));
        container.add(score);

        score_total = new JLabel("                          Score Total =");
        container.add(score_total);

        score_total = new JLabel(score_number_total(0));
        container.add(score_total);

        container.add(new JLabel(random()));

    }

    public String random() {
        Random rnd = new Random();
        char c = (char) ('a' + rnd.nextInt(26));
        answer = String.valueOf(c);
        return answer;
    }

    public String score_number(int check) {
        if (check == 1) {
            score_ = score_ - 1;
        }
        if (check == 2) {
            score_number_total(1);

        }

        if (score_ == 0) {
            JOptionPane.showMessageDialog(this, "GAME OVER", "Infomation",
                    JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
        String score = String.valueOf(score_);
        return score;
    }

    public String score_number_total(int tmp) {
        int number = 0;

        if (tmp == 1) {
            number = score_;
        }
        String score = String.valueOf(number);
        return score;
    }

    public static void show(String tmp) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(tmp)) {
                array[i] = " ";
            } else {
                array[i] = " ";
            }
        }
        return;
    }

    public void actionPerformed(ActionEvent e) {
        String tmp = input.getText();

        if (tmp.equals(answer)) {
            JOptionPane.showMessageDialog(this, "YOU PASS", "Infomation",
                    JOptionPane.INFORMATION_MESSAGE);

            score_number(2);
            score_total.setText(score_number_total(1));
        } else {
            JOptionPane.showMessageDialog(this, "NOT PASS", "Infomation",
                    JOptionPane.INFORMATION_MESSAGE);

            score_number(1);
            score.setText(score_number(0));
            show(tmp);
            for (int i = 0; i < array.length; i++) {
                text.setText(array[i]);
            }

        }
    }

    public static void main(String[] args) {
        GAME_6406021421171 window = new GAME_6406021421171();
        window.setSize(350, 350);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }
}
