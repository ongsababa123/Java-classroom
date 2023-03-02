package lab7.lab7_1.ex;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JScrollPane;  

public class lab7_1 extends JFrame{

    JLabel numberLabel,numberLabel2, resultLabel;
    JTextField numberField,numberField2;
    JTextArea resultArea;
    JScrollPane scrollableTextArea;
    public lab7_1() {
        // title bar in window
        super("Program display value n");
        // obtain content pane and set its layout to FlowLayout
        Container container = getContentPane();
        container.setLayout(new FlowLayout());
        // create numberLabel and attach it to content pane
        numberLabel = new JLabel("Enter an integer and press Enter");
        container.add(numberLabel);

        numberField = new JTextField(10);
        container.add(numberField);
        
        numberLabel2 = new JLabel("Enter integer number of blank");
        container.add(numberLabel2);
        
        numberField2 = new JTextField(10);
        container.add(numberField2);
        // register this applet as numberField’s ActionListener
        numberField2.addActionListener(
                // create inner class
                new ActionListener() {
                    public void actionPerformed(ActionEvent event) {
                        int number,number2, sumValue;
                        String blank5 = " ";
                        number = Integer.parseInt(numberField.getText());
                        number2 = Integer.parseInt(numberField2.getText());
                        // clear value in TextArea
                        resultArea.setText("");
                        // add data in textareas
                        for (int n = 1; n <= number; n++) {
                            resultArea.append(Integer.toString(n));
                            for (int i = 0; i <= number2; i++) {
                                resultArea.append(blank5);
                            }
                            if (n % 3 == 0)
                                resultArea.append("\n");
                        }
                        // clear value in numberField
                        numberField.setText("");
                    } // end method actionPerformed
                });
        // create display
        resultArea = new JTextArea(10, 30);
        scrollableTextArea = new JScrollPane(resultArea); 
    
        
        resultArea.setEditable(false);
        // container.add(resultArea);

        scrollableTextArea.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);  
        scrollableTextArea.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);  

        container.add(scrollableTextArea);  
    }

    public static void main(String[] args) { 
        lab7_1 window = new lab7_1(); 
        
        window.setSize( 360,500); 
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        window.setVisible(true);


        } 
}
