package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int result = 1+2;
        System.out.println(result);
        result = (result-1)*result;
        System.out.println(result);

        result = result%3;
        System.out.println(result);

        //Abbreviate Operator
        result ++;
        System.out.println(result);
        result *=25;
        System.out.println(result);

        boolean isAlien = false;
        if(isAlien == false){
            System.out.println(
                    "It is not an alien"
            );
        }


        int topScore = 100;
        if(topScore == 100){
            System.out.println("You got the highest score!");
        }
        int secondTop = 97;
        if(topScore>secondTop && topScore<=100){
            System.out.println("Interesting");
        }

        boolean isCar = false;
        boolean wasCar = isCar?true:false ;//
        System.out.println(wasCar);

        //Challange:
        double num1 = 20.00;
        double num2 = 80.00;
        double num3 = (num1+num2)*100.00;
        double rem = num3%40;
        boolean x = rem==0?true:false;
        System.out.println(x);
        if (x!=true){
            System.out.println("Got some remainder!");
        }




    }
}
