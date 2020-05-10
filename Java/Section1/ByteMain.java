package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int myValue = 1000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer minimum value = " + myMinIntValue);
        System.out.println("Integer maximum value = "+ myMaxIntValue);

        byte myMinbyteValue = Byte.MIN_VALUE;
        byte myMaxbyteValue = Byte.MAX_VALUE;
        System.out.println("Byte Min = " + myMinbyteValue);
        System.out.println("Byte Max = " + myMaxbyteValue);

        long mylongValue = 100L;
        long myMinlongValue = Long.MIN_VALUE;
        long myMaxlongValue = Long.MAX_VALUE;
        System.out.println("Long Min = " + myMinlongValue);
        System.out.println("Long Max = " + myMaxlongValue);

        //Arithmetic
        int myTotal = (myMinIntValue/2);
        byte mybyte = (byte)(myMinbyteValue/2);


        System.out.println(myTotal);
        System.out.println(mybyte);


        byte  mybyte1= 122;
        short myshort = 2304;
        int myint =45094;
        long  mylong = ((mybyte1+myshort+myint)*10 + 50000);
        System.out.println(mylong);
    }
}
