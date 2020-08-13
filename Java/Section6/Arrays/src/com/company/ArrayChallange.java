package com.company;

import java.util.Arrays;
import java.util.Scanner;


public class ArrayChallange {
    public static void main(String[] args) {
        int[] mylist = getIntegers();
        System.out.println("Printing the unsorted array:");
        printArray(mylist);
        System.out.println("Printing sorted array");
        int[] mylistSorted = sortIntegers(mylist);
        printArray(mylistSorted);

    }
    public static int[] sortIntegers(int[] array){
        Arrays.sort(array);
        return array;

    }
    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " of the array is: " + array[i]);
        }
    }

    public static int[] getIntegers(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of integers you want to input: ");
        int numberofInteger = scanner.nextInt();
        int[] inputArray = new int[numberofInteger];
        for (int i = 0; i < numberofInteger; i++) {
            System.out.println("Enter the element - " + (i+1) + "  : ");
            inputArray[i] = scanner.nextInt();
        }
        return inputArray;
    }
}
