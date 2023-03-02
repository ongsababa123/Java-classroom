package homework.homework1;

import java.util.Scanner; 

public class hw1 {
    
    public static void main(String[] args) {         
        int tmp;
        double score;    
        Scanner scan = new Scanner(System.in);         
        hw1 out = new hw1();

        do {
            System.out.print("Enter Score: "); 
            score = scan.nextDouble();
        } while (score > 100 || score <= -1);

        do {
            System.out.println("Select number to Program grade"); 
            System.out.println("1. pass / not pass ");         
            System.out.println("2. 5 grade ");         
            System.out.println("3. 8 grade ");         
            System.out.print("Enter Select number to Program grade : "); 
            tmp = scan.nextInt();
        } while (tmp > 3 || tmp <= 0);
        
        
        if (tmp == 1) {
            System.out.println(out.grades1(score));
        }
        else if (tmp == 2) {
            System.out.println(out.grades2(score));
        }
        else if (tmp == 3) {
            System.out.println(grades3(score));
        }
        else {
            System.out.println(" FAILL ");
        }

        scan.close();
    }

    public String grades1(double score) {
        
        if (score >= 60) {
            return "Pass";   
        }
        else if (score <=59){
            return "Not Pass"; 
        }
        else {
            return null;
        }
    }

    public String grades2(double score) {
        
        if (score >= 80 || score == 100) {
            return "Grades 4";   
        }
        else if (score >= 60){
            return "Grades 3"; 
        }
        else if (score >= 40 ){
            return "Grades 2"; 
        }
        else if (score >= 10){
            return "Grades 2"; 
        }
        else if (score >= 0 ){
            return "Grades 0"; 
        }
        else {
            return null;
        }
        
    }

    static String grades3(double score) {
        
        if (score >= 80 || score == 100) {
            return "Grades A";   
        }
        else if (score >= 75){
            return "Grades B+"; 
        }
        else if (score >= 70 ){
            return "Grades B"; 
        }
        else if (score >= 65){
            return "Grades C+"; 
        }
        else if (score >= 60 ){
            return "Grades C"; 
        }
        else if (score >= 55 ){
            return "Grades D+"; 
        }
        else if (score >= 50 ){
            return "Grades D"; 
        }
        else if (score <= 49 ){
            return "Grades F"; 
        }
        else {
            return null;
        }   
    }
}

