package homework.file;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class test extends JFrame implements ActionListener {
    private JButton submit;
    private JTextField id, name, lastName, subject, Department, group;
    private JTextArea subTextArea;
    private JScrollPane subScroll;

    public test() {
        super("Program kuy");
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        c.add(new JLabel("Enter ID : "));
        id = new JTextField(20);
        id.setColumns(45);
        c.add(id);

        c.add(new JLabel("Enter name : "));
        name = new JTextField(20);
        name.setColumns(45);
        c.add(name);

        c.add(new JLabel("Enter lastName : "));
        lastName = new JTextField(20);
        lastName.setColumns(45);
        c.add(lastName);

        c.add(new JLabel("Enter subject : "));
        subject = new JTextField(20);
        subject.setColumns(45);
        c.add(subject);

        c.add(new JLabel("Enter Department : "));
        Department = new JTextField(20);
        Department.setColumns(45);
        c.add(Department);

        c.add(new JLabel("Enter group : "));
        group = new JTextField(20);
        group.setColumns(45);
        c.add(group);

        submit = new JButton("Submit");
        submit.addActionListener(this);
        c.add(submit);

        subTextArea = new JTextArea(20, 45);
        subTextArea.setEditable(false);
        subScroll = new JScrollPane(subTextArea);
        c.add(subScroll);

    }

    public void actionPerformed(ActionEvent event) {
        String[][] data_;
        int n = 0, b = 6;
        data_ = new String[100][100];
        String str_id = id.getText();
        String str_name = name.getText();
        String str_lastname = lastName.getText();
        String str_subject = subject.getText();
        String str_department = Department.getText();
        String str_group = group.getText();

        data_[n][0] = str_id;
        data_[n][1] = str_name;
        data_[n][2] = str_lastname;
        data_[n][3] = str_subject;
        data_[n][4] = str_department;
        data_[n][5] = str_group;

        try {
            FileWriter myWriter = new FileWriter("homework/file/data.txt", true);
            myWriter.append(data_[n][0] + "\t" + data_[n][1] + "\t" + data_[n][2] + "\t" + data_[n][3] + "\t"
                    + data_[n][4] + "\t" + data_[n][5] + "\n");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        try {
            FileReader reader = new FileReader("homework/file/data.txt");
            BufferedReader br = new BufferedReader(reader);
            subTextArea.read(br, null);
            br.close();
            subTextArea.requestFocus();
        } catch (Exception e2) {
        }
    }

    public static void main(String[] args) {
        test test = new test();
        test.setSize(500, 700);
        test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        test.setVisible(true);
    }
}
