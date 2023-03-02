package homework.class_move.tanny;

public class check {
    public  String ck_gpax(int id_std1,int id_std2 ,float gpax_std1, float gpax_std2) {
        if(gpax_std1 == gpax_std2){
            return "=";
        }
        else if (gpax_std1 > gpax_std2) {
            String id1 = String.valueOf(id_std1);
            return id1;
        } else {
            String id2 = String.valueOf(id_std2);
            return id2;
        }
    }

    public  int ck_comp_and_cal(int id_std1,int id_std2 ,String com_std1,String com_std2 ,String cal1_std1,String cal1_std2,String cal2_std1,String cal2_std2) {
        //Com Student1

        if(com_std1.equals("A") || com_std1.equals("a")){
        //Com Student2
            if(com_std2.equals("A")|| com_std2.equals("a")){
                if((cal1_std1.equals("D")|| cal1_std1.equals("d")) || (cal1_std1.equals("F") || cal1_std1.equals("f"))){
                    return id_std2;
                }
                if((cal2_std1.equals("D") || cal2_std1.equals("d")) || (cal2_std1.equals("F")||cal2_std1.equals("f"))){
                    return id_std2;
                }
                if((cal1_std2.equals("D") || cal1_std2.equals("d")) || (cal1_std2.equals("F") || cal1_std2.equals("f"))){
                    return id_std1;
                }
                if((cal2_std2.equals("D") || cal2_std2.equals("d")) || (cal2_std2.equals("F") || cal2_std2.equals("f"))){
                    return id_std1;
                }
                return 1; //true
            } else {
                return id_std1;
            }
        } else if(com_std2.equals("A")|| com_std2.equals("a")){
            return id_std2;
        } else {
            return 2; //None
        }
    }

    public String ck_score(int id_std1,int id_std2,String std1,String std2) {
        int std1_score = 0 , std2_score = 0;
        switch(std1){
            case "A" : std1_score = 5; break;
            case "a" : std1_score = 5; break;
            case "B" : std1_score = 4; break;
            case "b" : std1_score = 4; break;
            case "C" : std1_score = 3; break;
            case "c" : std1_score = 3; break;
            case "D" : std1_score = 2; break;
            case "d" : std1_score = 2; break;
            case "F" : std1_score = 1; break;
            case "f" : std1_score = 1; break;
        }

        switch(std2){
            case "A" : std2_score = 5; break;
            case "a" : std2_score = 5; break;
            case "B" : std2_score = 4; break;
            case "b" : std2_score = 4; break;
            case "C" : std2_score = 3; break;
            case "c" : std2_score = 3; break;
            case "D" : std2_score = 2; break;
            case "d" : std2_score = 2; break;
            case "F" : std2_score = 1; break;
            case "f" : std2_score = 1; break;
        }
        if(std1_score == std2_score){
            return "=";
        }
        else if(std1_score > std2_score){
            String id1 = String.valueOf(id_std1);
            return id1;
        } else {
            String id2 = String.valueOf(id_std2);
            return id2;
        }
    }

}
