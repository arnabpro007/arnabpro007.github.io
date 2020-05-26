package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int count = 1;
        while (count!=7){
            System.out.println(count);
            count ++;
        }
        do{
            System.out.println("Arnab is the best!");
            count ++;
        }while (count <8);

        int number = 4;
        int finish = 20;
        int m = 0;
        while (number<=finish){
            number ++;
            if(!isEven(number)){
                continue;
            }
            if (m<5){
            m = m+1;
            System.out.println("Even number "+ number);
        }else {

                break;
            }
        }
    }

    private static boolean isEven(int n){
        return  (n%2 == 0);
    }




}
