package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of integer you want to average: ");
        if (scanner.hasNextInt()){
            int number = scanner.nextInt();
            if (number>0) {
                double[] temporaryArray = new double[number];
                for (int i = 0; i < temporaryArray.length; i++) {
                    System.out.println("Enter the element - " + (i+1) + " : ");
                    if(scanner.hasNextDouble()){
                        temporaryArray[i] = scanner.nextDouble();
                    }else{
                        System.out.println("I am disappointed with you!");
                    }
                }
                double sum = Arrays.stream(temporaryArray).sum();
                System.out.println("Average is: " + (sum/number));
            }else{
                System.out.println("You are an advanced idiot who can't follow the rules.");
            }
        }else{
            System.out.println("You are an idiot who can't follow even the simplest of the rules.");
        }


    }

}
