package finaltest.final3;

import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.*;

public class main_program extends JFrame implements ActionListener {

    private JFrame window;
    private JComboBox department_, month_, year_, day_;
    private JButton search, calculate;
    private JTextArea area;
    private JScrollPane subScroll;

    private int money;

    private String[] department_data = { "accounting department", "finance department", "marketing department",
            "sales department", "maintenance department", "administrative department" };
    private String[] month_data = { "January", "February", "March", "April", "May", "June", "July", "August",
            "September", "October", "November", "December" };
    private String[] day_data = { "1", "2", "3", "4", "5", "6", "7", "8",
            "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26",
            "27", "28", "29", "30" };
    private String[] year_data = { "2018", "2019", "2020", "2021", "2022" };

    public main_program() {
        super("attendance table");
        Container container = getContentPane();
        container.setLayout(new FlowLayout());

        container.add(new JLabel("The Round Family Co., Ltd."));
        container.add(new JLabel("                                  "));
        container.add(new JLabel("department"));

        department_ = new JComboBox(department_data);
        container.add(department_);

        container.add(new JLabel("Day month year                                                                "));

        day_ = new JComboBox(day_data);
        day_.getSelectedItem();
        container.add(day_);

        month_ = new JComboBox(month_data);
        container.add(month_);

        year_ = new JComboBox(year_data);
        container.add(year_);

        search = new JButton("Search");
        search.addActionListener(this);
        container.add(search);

        area = new JTextArea(20, 32);
        area.setEditable(false);
        subScroll = new JScrollPane(area);
        container.add(subScroll);

        calculate = new JButton("Salary Summary");
        calculate.addActionListener(this);
        container.add(calculate);
    }

    public void Countwork(String day, String month, String year, String workin, String workout, String department) {
        if (department == department) {

            try {
                FileWriter myWriter = new FileWriter("finaltest/final3/workin_out.txt", true);
                myWriter.append(day + "\t" + month + "\t" + year + "\n");
                myWriter.append(department + "\n");
                myWriter.append(workin + "\t" + workout);
                myWriter.close();
                System.out.println("Successfully wrote to the file.");
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }
    }

    public int Cal_late(int workin) {
        int money_tmp = this.money;
        if (workin > 9 || workin < 10.30) {
            for (int i = workin; i <= 9; i--) {
                money_tmp = -1;
            }
        } else if (workin > 10.30) {
            money_tmp = -300;
        }

        this.money = money_tmp;
        return this.money;
    }

    public int Cal_ot(int workout) {
        int money_tmp = this.money;
        int ot;
        if (workout > 16) {
            ot = workout - 16;
            money = ot * 60;
        }

        this.money = money_tmp;
        return this.money;
    }

    public static void main(String[] args) {
        main_program window = new main_program();
        window.setSize(350, 520);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String department_tmp = String.valueOf(department_.getSelectedItem());
        if (e.getSource() == search) {
            if (department_tmp.equals("accounting department")) {
                try {
                    FileReader reader = new FileReader("finaltest/final3/accounting.txt");
                    BufferedReader br = new BufferedReader(reader);
                    area.read(br, null);
                    br.close();
                    area.requestFocus();
                } catch (Exception e2) {
                }
            }
        }

    }
}
