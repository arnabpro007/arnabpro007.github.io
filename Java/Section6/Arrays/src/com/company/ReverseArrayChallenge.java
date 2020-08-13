package com.company;

import java.util.Arrays;

public class ReverseArrayChallenge {
    public static void main(String[] args) {
        System.out.println("Taking an array as input:");
        int[] array = new int[] {5,6,7,8,9,11,7};
        System.out.println("Array: " + Arrays.toString(array));
        System.out.println("Reversing the array");
        reverse(array);
        System.out.println("Array: " + Arrays.toString(array));



    }
    private static void reverse(int[] array){
        int[] temporaryArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            temporaryArray[i] = array[array.length-1-i];
        }
        for (int i = 0; i < temporaryArray.length; i++) {
            array[i] = temporaryArray[i];
        }
    }
}
