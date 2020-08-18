package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        String A = scanner.next();
        String B = scanner.next();
        System.out.println(sumOfString(A,B));
        if (isLarger(A,B)){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
        CapitalizePrint(A,B);

    }

    public static int sumOfString(String A , String B){
        int lengthOfStringA = A.length();
        int lengthOfStringB = B.length();
        return lengthOfStringA+lengthOfStringB ;
    }

    public static boolean isLarger(String A , String B){
        int comparisonValue = A.compareTo(B);
        return comparisonValue > 0;
    }

    public static void CapitalizePrint(String A , String B){
        String A_updated = capitalize(A);
        String B_updated = capitalize(B);
        System.out.println(A_updated + " "+ B_updated);
    }

    public static String capitalize(String str)
    {
        if(str == null) return str;
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }
}
