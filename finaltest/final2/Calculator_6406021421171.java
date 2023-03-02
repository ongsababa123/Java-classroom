package finaltest.final2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator_6406021421171 implements ActionListener {
    JLabel labelNumber1, labelResult, show1;
    JTextField number1Field, number2Field, resultField, show;
    JButton btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnSum, btnSub, btnDiv, btnMod, btnMult, btnEq,
            btnclr, btnsave, btndot, btnshow;
    JFrame windows;
    private boolean flg = true;
    private String tmp = "";
    private float result;

    public Calculator_6406021421171() {
        windows = new JFrame("Calculator");
        Container container = windows.getContentPane();
        container.setLayout(new FlowLayout());

        labelNumber1 = new JLabel("Enter number : ");
        container.add(labelNumber1);
        number1Field = new JTextField(10);
        container.add(number1Field);

        resultField = new JTextField(25);
        resultField.setEditable(false);
        container.add(resultField);

        btnsave = new JButton("  Save  ");
        btnsave.addActionListener(this);
        container.add(btnsave);

        btnclr = new JButton("  Clear  ");
        btnclr.addActionListener(this);
        container.add(btnclr);

        btnshow = new JButton("  Show  ");
        btnshow.addActionListener(this);
        container.add(btnshow);

        btn7 = new JButton("  7  ");
        btn7.addActionListener(this);
        container.add(btn7);

        btn8 = new JButton("  8  ");
        btn8.addActionListener(this);
        container.add(btn8);

        btn9 = new JButton("  9  ");
        btn9.addActionListener(this);
        container.add(btn9);

        btnMult = new JButton("  *  ");
        btnMult.addActionListener(this);
        container.add(btnMult);

        btn4 = new JButton("  4  ");
        btn4.addActionListener(this);
        container.add(btn4);

        btn5 = new JButton("  5  ");
        btn5.addActionListener(this);
        container.add(btn5);

        btn6 = new JButton("  6  ");
        btn6.addActionListener(this);
        container.add(btn6);

        btnDiv = new JButton("  /  ");
        btnDiv.addActionListener(this);
        container.add(btnDiv);

        btn1 = new JButton("  1  ");
        btn1.addActionListener(this);
        container.add(btn1);

        btn2 = new JButton("  2  ");
        btn2.addActionListener(this);
        container.add(btn2);

        btn3 = new JButton("  3  ");
        btn3.addActionListener(this);
        container.add(btn3);

        btnSub = new JButton("  -  ");
        btnSub.addActionListener(this);
        container.add(btnSub);

        btn0 = new JButton("  0  ");
        btn0.addActionListener(this);
        container.add(btn0);

        btnEq = new JButton("  =  ");
        btnEq.addActionListener(this);
        container.add(btnEq);

        btnSum = new JButton("  +  ");
        btnSum.addActionListener(this);
        container.add(btnSum);

        windows.setSize(300, 430);
        windows.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        windows.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String str = number1Field.getText();
        String str1 = number2Field.getText();

        if (flg == true) {
            number2Field.setEditable(false);
            if (e.getSource() == btn0) {
                str += "0";
                number1Field.setText(str);
            }
            if (e.getSource() == btn1) {
                str += "1";
                number1Field.setText(str);
            }
            if (e.getSource() == btn2) {
                str += "2";
                number1Field.setText(str);
            }
            if (e.getSource() == btn3) {
                str += "3";
                number1Field.setText(str);
            }
            if (e.getSource() == btn4) {
                str += "4";
                number1Field.setText(str);
            }
            if (e.getSource() == btn5) {
                str += "5";
                number1Field.setText(str);
            }
            if (e.getSource() == btn6) {
                str += "6";
                number1Field.setText(str);
            }
            if (e.getSource() == btn7) {
                str += "7";
                number1Field.setText(str);
            }
            if (e.getSource() == btn8) {
                str += "8";
                number1Field.setText(str);
            }
            if (e.getSource() == btn9) {
                str += "9";
                number1Field.setText(str);
            }

            if (e.getSource() == btndot) {
                str += ".";
                number1Field.setText(str);
            }

            if (e.getSource() == btnSum) {
                this.tmp = "+";
                this.flg = false;
                number2Field.setEditable(true);
            }
            if (e.getSource() == btnSub) {
                this.tmp = "-";
                this.flg = false;
                number2Field.setEditable(true);
            }
            if (e.getSource() == btnDiv) {
                this.tmp = "/";
                this.flg = false;
                number2Field.setEditable(true);
            }
            if (e.getSource() == btnMod) {
                this.tmp = "%";
                this.flg = false;
                number2Field.setEditable(true);
            }
            if (e.getSource() == btnMult) {
                this.tmp = "*";
                this.flg = false;
                number2Field.setEditable(true);
            }
            show.setText(this.tmp);
        } else if (flg == false) {
            number2Field.setEditable(true);

            if (e.getSource() == btnSum) {
                this.tmp = "+";
                this.flg = false;
            }
            if (e.getSource() == btnSub) {
                this.tmp = "-";
                this.flg = false;
            }
            if (e.getSource() == btnDiv) {
                this.tmp = "/";
                this.flg = false;
            }
            if (e.getSource() == btnMod) {
                this.tmp = "%";
                this.flg = false;
            }
            if (e.getSource() == btnMult) {
                this.tmp = "*";
                this.flg = false;
            }
            show.setText(this.tmp);
            if (e.getSource() == btn0) {
                str1 += "0";
                number2Field.setText(str1);
            }
            if (e.getSource() == btn1) {
                str1 += "1";
                number2Field.setText(str1);
            }
            if (e.getSource() == btn2) {
                str1 += "2";
                number2Field.setText(str1);
            }
            if (e.getSource() == btn3) {
                str1 += "3";
                number2Field.setText(str1);
            }
            if (e.getSource() == btn4) {
                str1 += "4";
                number2Field.setText(str1);
            }
            if (e.getSource() == btn5) {
                str1 += "5";
                number2Field.setText(str1);
            }
            if (e.getSource() == btn6) {
                str1 += "6";
                number2Field.setText(str1);
            }
            if (e.getSource() == btn7) {
                str1 += "7";
                number2Field.setText(str1);
            }
            if (e.getSource() == btn8) {
                str1 += "8";
                number2Field.setText(str1);
            }
            if (e.getSource() == btn9) {
                str1 += "9";
                number2Field.setText(str1);
            }

            if (e.getSource() == btndot) {
                str1 += ".";
                number2Field.setText(str1);
            }

        }
        if (e.getSource() == btnshow) {
            float snum = Float.valueOf(str);
            float snum1 = Float.valueOf(str1);

            if (this.tmp.equals("+")) {
                this.result = snum + snum1;
                String sres = String.valueOf(result);
                resultField.setText(sres);
            } else if (this.tmp.equals("-")) {
                this.result = snum - snum1;
                String sres = String.valueOf(result);
                resultField.setText(sres);
            } else if (this.tmp.equals("*")) {
                this.result = snum * snum1;
                String sres = String.valueOf(result);
                resultField.setText(sres);
            } else if (this.tmp.equals("/")) {
                this.result = snum / snum1;
                String sres = String.valueOf(result);
                resultField.setText(sres);
            } else if (this.tmp.equals("%")) {
                this.result = snum % snum1;
                String sres = String.valueOf(result);
                resultField.setText(sres);
            }

        }
        if (e.getSource() == btnclr) {
            flg = true;
            number1Field.setText("");
            number2Field.setText("");
            resultField.setText("");
            number2Field.setEditable(false);
        }

    }

    public static void main(String[] args) {
        Calculator_6406021421171 calculator = new Calculator_6406021421171();
    }

}