package lab3.ex.ex3;

public class degit {
    private int number = 0;
    private int[] tmp;

    public degit(int number){
        this.number = number;
    }

    public void makeString(){
        String temp = Integer.toString(this.number);
        //int[] num = new int[3];
        tmp = new int[4];
        for(int i = 0;i < tmp.length;i++){
            tmp[i] = temp.charAt(i) - '0';
        }


    }
    public void show(){
        System.out.print(tmp[0] + " ");
        System.out.print(tmp[1]+ " ");
        System.out.print(tmp[2]+ " ");
        System.out.print(tmp[3]);
    }
}
