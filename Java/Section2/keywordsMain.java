package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int highscore = 50; //This is an assignment expression
        if (highscore == 50) { //This is an controlflow expression
            System.out.println("This is high score!");
        }
        int myVariable = 50;

        System.out.println(
                myVariable
        );
        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonnus = 100;
        if (score==5000 && bonnus <100){
            System.out.println("Your score was 5000");
        }else {
            System.out.println("First else!!");
        }
        if (gameOver==true){

            int finalScore = score + (levelCompleted+bonnus);
            System.out.println(finalScore);
        }
        if (gameOver == true){
            score = 1000;
            levelCompleted = 0;
            bonnus = 200;
            int finalScore = score + (levelCompleted+bonnus);
            System.out.println(finalScore);
        }

    }
}
