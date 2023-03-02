package homework.student_grade;

import java.util.Arrays;
import java.util.Scanner;

public class stugrade {

    private int[] id_stu1;
    private double[] score_stu1;
    private int length = 5;
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        stugrade out = new stugrade();
        int[] id_stu;
        double[] score_stu;
        int length = 5;
        id_stu = new int[length];
        score_stu = new double[length];

        for (int i = 0; i < id_stu.length; i++) {

            System.out.println("Enter ID student [" + i + "]");
            id_stu[i] = scan.nextInt();
            System.out.println("Enter Grade student [" + i + "]");
            score_stu[i] = scan.nextInt();
        }

        out.setstu(id_stu, score_stu);
        out.average();
        out.min();
        out.max();
        scan.close();
    }

    public void setstu(int[] id, double[] score) {
        this.id_stu1 = new int[this.length];
        this.score_stu1 = new double[this.length];

        this.id_stu1 = id;
        this.score_stu1 = score;
    }

    public void average() {
        Arrays.sort(this.score_stu1);
        System.out.println("Value min to max = " + Arrays.toString(this.score_stu1));

        double sum = 0;
        for (int i = 0; i < score_stu1.length; i++) {

            sum += score_stu1[i];
        }
        sum = sum / score_stu1.length;

        System.out.println("Average value = " + sum);
    }

    public void min() {
        double min = this.score_stu1[0];
        int id = this.id_stu1[0];
        for (int i = 0; i < this.score_stu1.length; i++) {
            if (score_stu1[i] < min) {
                min = this.score_stu1[i];
                id = this.id_stu1[i];
            }
        }
        System.out.println("Student ID ["+ id +"] "+"Min value = " + min);
    }

    public void max() {
        double max = this.score_stu1[0];
        int id = this.id_stu1[0];
        for (int i = 0; i < this.score_stu1.length; i++) {
            if (score_stu1[i] > max) {
                max = this.score_stu1[i];
                id = this.id_stu1[i];
            }
        }
        System.out.println("Student ID ["+ id +"] "+"MAX value = " + max);
    }

}
