package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(CalculateScore2(100,10));
        System.out.println(CalculateScore2(75,7));
        System.out.println(CalculateScore2(200,25));
        System.out.println(CalculateScore2(350,'A'));
        int highscore = CalculateScore2(100,34);
        highscore = highscore*2;
        System.out.println(highscore);
    }
    public static void CalculateScore(int score,int level){

        if(level>7){
            System.out.println(score);
        }else {
            System.out.println("Game Over!");
        }
    }
    public static int CalculateScore2(int score, int level){
        return(score+10*level);
    }
    public static int CalculateScore2(int score, char name){
        return (score);
    }


}
