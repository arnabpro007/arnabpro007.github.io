package com.company;

import java.util.Scanner;

public class MinElementChallange {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Enter number of integers you want to input: ");
        int count = scanner.nextInt();
        int[] array = readIntegers(count);
        int min = findmin(array);
        System.out.println("Minimum element of the array is: " + min);
    }

    //ReadIntegers:
    private static int[] readIntegers(int count){

        System.out.println("Start Entering " + count + " numbers");
        int[] array = new int[count];
        for (int i = 0; i < count ; i++) {
            System.out.println("Enter #" + (i+1) + " : ");
            array[i] = scanner.nextInt();
        }
        return array;
    }

    //FindMin:
    private static int findmin(int[] array){
        int temp = array[0];
        int i = 0;
        while(i < array.length){
            if (array[i]<temp){
                temp = array[i];
            }
            i++;
        }
        return temp;
    }
}
