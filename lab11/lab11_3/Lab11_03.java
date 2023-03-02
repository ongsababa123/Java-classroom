package lab11.lab11_3;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.Timer;

public class Lab11_03 extends JFrame implements ActionListener {
    Timer swTimer;
    int num = 0;

    public Lab11_03() {
        super("Program Using Timer");
        swTimer = new Timer(1000, this);
        swTimer.start();
    }

    public void paint(Graphics g) {

        super.paint(g);
        int x = 20 + (int) (Math.random() * 450);
        int y = 20 + (int) (Math.random() * 270);
        int Red = (int) (Math.random() * 256);
        int Green = (int) (Math.random() * 256);
        int Blue = (int) (Math.random() * 256);
        g.setColor(new Color(Red, Green, Blue));
        num++;
        if (num == 1) {
            g.drawOval(x, y, 20, 20);
            g.fillOval(x, y, 20, 20);
        }

        else if (num == 2) {
            g.drawRect(x, y, 50, 50);
            g.fillRect(x, y, 50, 50);
        }

        else if (num == 3) {
            int[] a = { 150, 150, 225, 75 };
            int[] b = { 50, 200, 125, 125 };
            g.drawPolygon(a, b, 4);
            g.fillPolygon(a, b, 4);
        } else {
            g.fillArc(x, y, 200, 200, 50, 50);
            num = 0;
        }

    }

    public void actionPerformed(ActionEvent event) {
        repaint();
    }

    public static void main(String[] args) {
        Lab11_03 test = new Lab11_03();
        test.setSize(480, 300);
        test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        test.setVisible(true);
    }
}
