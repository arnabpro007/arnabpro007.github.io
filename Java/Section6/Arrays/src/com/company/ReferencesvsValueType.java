package com.company;

import java.util.Arrays;

public class ReferencesvsValueType {
    public static void main(String[] args) {
        int myintValue = 10;
        int anotherintValue = myintValue;
        System.out.println("myintValue = " + myintValue);
        System.out.println("anotherintValue = "+ anotherintValue);
        anotherintValue ++;
        System.out.println("myintValue = " + myintValue);
        System.out.println("anotherintValue = "+ anotherintValue);

        int[] myIntArray = new int[5];
        int[] anotherIntArray = myIntArray;
        for (int i = 0; i < myIntArray.length; i++) {
            myIntArray[i] = i*10;
        }
        /*System.out.println("myIntArray: ");
        printArray(myIntArray);
        System.out.println("anotherIntArray: ");
        printArray(anotherIntArray);*/
        System.out.println("myIntArray: " + Arrays.toString(myIntArray));

        //printArray(myIntArray);
        System.out.println("anotherIntArray: " + Arrays.toString(anotherIntArray));

        anotherIntArray[4] = -40;
        System.out.println("Updated 5-th element to be -40");
        System.out.println("myIntArray: " + Arrays.toString(myIntArray));

        //printArray(myIntArray);
        System.out.println("anotherIntArray: " + Arrays.toString(anotherIntArray));
        //printArray(anotherIntArray);
        System.out.println("Using modify Array: ");
        modifyArray(myIntArray);
        System.out.println("myIntArray: " + Arrays.toString(myIntArray));

        //printArray(myIntArray);
        System.out.println("anotherIntArray: " + Arrays.toString(anotherIntArray));


    }
    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " of the array is: " + array[i]);
        }
    }
    private static void modifyArray(int[] array){
        array[0] = 2;
        array = new int[] {1,2,3,4,5};
    }

}
