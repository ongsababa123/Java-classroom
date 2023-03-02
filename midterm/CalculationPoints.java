package midterm;

import java.util.Scanner; 

public class CalculationPoints {
    
    private int point = 0;
    private int date = 0;
    public static void main(String[] args){
    CalculationPoints output = new CalculationPoints();
    Scanner scan = new Scanner(System.in);
    String sDate;
    int Date = 0;
    int price = 0;
    int point = 0;

    System.out.print("Enter Date : ");
    sDate = scan.nextLine();
    Date = Integer.parseInt(sDate);

    System.out.print("Enter Price here : ");
    price = scan.nextInt();

    point = price / 20;
    
    output.calPoints(Date, point);

    scan.close();
    }

    public void calPoints(int date, int point){
        this.date = date;
        if (this.date == 3 || this.date == 15 || this.date == 26) {
            this.point = point *10;
            System.out.print("Point = "+this.point);
        }
        //คี่
        else if ( this.date % 2 != 0 && this.date <= 31){
            this.point = point *3;
            System.out.print("Point = "+this.point);
        }
        //คู่
        else if ( this.date % 2 == 0 && this.date <= 31){
            this.point = point *5;
            System.out.print("Point = "+this.point);
        }
        else if ( this.date > 26 && this.date <= 31){
            this.point = point;
            System.out.print("Point = "+this.point);
        }
        else if ( this.date  >= 32 || this.date <= 0){
            System.out.print("Date error, No points calculate.");
        }
    }
}
