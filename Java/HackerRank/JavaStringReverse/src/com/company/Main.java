package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        String A = scanner.next();
        if (A.compareTo(StringReverse(A))==0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
    public static String StringReverse(String string){
        String finalString = "";
        for (int i = 0; i < string.length() ; i++) {
            String temp = string.substring(string.length() - i - 1,string.length()-i);
            finalString = finalString + temp;
        }


        return finalString;
    }
}
