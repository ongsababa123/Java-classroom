package lab11.oop.lab2;

import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Chap11_02 extends JFrame implements ActionListener {
    JTextField fileName;
    JTextArea displayText;
    JScrollPane scroll;

    public Chap11_02() {
        super("Program load data file to TextArea");
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        c.add(new JLabel("Enter file name : "));
        fileName = new JTextField(20);
        fileName.addActionListener(this);
        c.add(fileName);
        displayText = new JTextArea(20, 45);
        scroll = new JScrollPane(displayText);
        c.add(scroll);
        setSize(550, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        Chap11_02 window = new Chap11_02();
    }

    public void actionPerformed(ActionEvent e) {
        String fn = fileName.getText();
        if (fn.equals("") == false) {
            try {
                FileReader in = new FileReader(fn);
                BufferedReader inputfile = new BufferedReader(in);
                String s1;
                String s2 = "";
                while ((s1 = inputfile.readLine()) != null) {
                    s2 += s1 + "\n";
                }
                inputfile.close(); // close stream input
            } catch (IOException event) {
                event.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(null,
                    "Not input filename in text field");
            displayText.setText("");
        }
    }
}
