public class MethodAssignment1 {
    public static void main(String[] args) {
        displayHighScorePosition("Arnab",CalculatedScorePosition(1500));
        displayHighScorePosition("riyu",CalculatedScorePosition(400));
        System.out.println((CalculatedScorePosition(1200)));
        System.out.println(CalculatedScorePosition(100));
        System.out.println(CalculatedScorePosition(1500));
        System.out.println(CalculatedScorePosition(900));
        System.out.println(CalculatedScorePosition(400));
        System.out.println(CalculatedScorePosition(50));
    }
    public static void displayHighScorePosition(String name , int pos){
        System.out.println(name + " has managed to climb to the position "+ pos);
    }
    public static int CalculatedScorePosition(int score){/*
        if (score>1000){
            return 1;
        }else if (score>500){
            return 2;
        }else if(score>100){
            return 3;
        }else {
            return 4;
        }*/
        int position = 4; //Assuming position 4 will be return
        if (score>1000){
            position -=3;
        }else if (score>500){
            position -=2;
        }else if(score>100){
            position -=1;
        }
        return position;

    }
}
