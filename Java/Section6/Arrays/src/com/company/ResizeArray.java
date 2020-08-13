package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class ResizeArray {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("We will resize array here (we will be increasing the size only not decreasing): ");
        System.out.println("Enter your base array size: ");
        int baseCount = scanner.nextInt();
        int[] baseArray = getIntegers(baseCount);
        System.out.println("Original Array: " + Arrays.toString(baseArray));
        System.out.println("Enter the resized array length: ");
        int resizedlength = scanner.nextInt();
        int[] resizedArray = new int[resizedlength];
        for (int i = 0; i < baseArray.length; i++) {
            resizedArray[i] = baseArray[i];
        }
        for (int i = baseArray.length; i < resizedArray.length; i++) {
            System.out.println("Enter element - " + (i+1) + " : ");
            resizedArray[i] = scanner.nextInt();
        }
        baseArray = new int[resizedlength];
        for (int i = 0; i < resizedArray.length; i++) {
            baseArray[i] = resizedArray[i];
        }
        System.out.println("Updated Array: " + Arrays.toString(baseArray));
    }

    private static int[] getIntegers(int numberofInteger){

        System.out.println("Enter the number of integers you want to input: ");

        int[] inputArray = new int[numberofInteger];
        for (int i = 0; i < numberofInteger; i++) {
            System.out.println("Enter the element - " + (i+1) + "  : ");
            inputArray[i] = scanner.nextInt();
        }
        return inputArray;
    }
}
