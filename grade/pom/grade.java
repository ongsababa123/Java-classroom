package grade.pom;

import java.util.*;

class grade{
    private String stuName = "";
    private String stuId   = "";
    private int    stuScoreHomework = 0;
    private int    stuScoreTest     = 0;
    private int    stuScoreMidterm  = 0;
    private int    stuScoreFinal    = 0;
    private int    stuScoreTotal    = 0;
    private char   Grade;
    
    public grade(){
        
    }

    public  char getGrade(){
        if(this.stuScoreTotal >= 80 && this.stuScoreTotal <= 100) this.Grade = 'A';
        else if(this.stuScoreTotal >= 70 && this.stuScoreTotal <= 79) this.Grade = 'B';
        else if(this.stuScoreTotal >= 60 && this.stuScoreTotal <= 69) this.Grade = 'C';
        else if(this.stuScoreTotal >= 50 && this.stuScoreTotal <= 59) this.Grade = 'D';
        else this.Grade = 'F';
        return this.Grade;
    }

    public  int getScoretotal(){
        this.stuScoreTotal = this.stuScoreHomework + this.stuScoreTest+ this.stuScoreMidterm + this.stuScoreFinal;
        return this.stuScoreTotal;
    }

    public  void setName(String stuName){
        this.stuName = stuName;
     }

    public  void setId(String stuId){
        this.stuId = stuId;
    }

    public  void setScoreHomework(int stuScoreHomework){
       this.stuScoreHomework = stuScoreHomework;
    }

    public  void setScoreTest(int stuScoreTest){
        this.stuScoreTest = stuScoreTest;
    }

    public  void setScoreMidterm(int stuScoreMidterm){
        this.stuScoreMidterm = stuScoreMidterm;
    }

    public  void setScoreFinal(int stuScoreFinal){
        this.stuScoreFinal = stuScoreFinal;
    }

    

    public static void main(String[] args) {
        String stuName = "";
        String stuId   = "";
        int stuScoreHomework = 0;
        int stuScoreTest     = 0;
        int stuScoreMidterm  = 0;
        int stuScoreFinal    = 0;
        int stuScoreTotal    = 0;
        char Grade;   
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Student ID : ");
        stuId = input.next();
        System.out.print("Enter Student name : ");
        stuName = input.next();
        System.out.print("Enter Homework score : ");
        stuScoreHomework = input.nextInt();
        System.out.print("Enter Test score : ");
        stuScoreTest = input.nextInt();
        System.out.print("Enter Midturm score : ");
        stuScoreMidterm = input.nextInt();
        System.out.print("Enter final score : ");
        stuScoreFinal = input.nextInt();
        stuScoreTotal = stuScoreHomework+stuScoreTest+stuScoreMidterm+stuScoreFinal;
        grade std1 = new grade();
        std1.setId(stuId);
        std1.setName(stuName);
        std1.setScoreHomework(stuScoreHomework);
        std1.setScoreTest(stuScoreTest);
        std1.setScoreMidterm(stuScoreMidterm);
        std1.setScoreFinal(stuScoreFinal);
        stuScoreTotal = std1.getScoretotal();
        System.out.print("Your total score : ");
        System.out.println(stuScoreTotal + " point");
        Grade = std1.getGrade();
        System.out.print("Your grade : ");
        System.out.println(Grade);
    }

}