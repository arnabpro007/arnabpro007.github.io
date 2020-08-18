package com.company;


import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();
        scanner.close();
        boolean ret = isAnagram(a,b);
        System.out.println((ret)? "Anagrams": "Not Anagrams");
    }
    /*public static boolean isAnagram(String a , String b){

        return true;
    }*/
    public static boolean isAnagram(String a , String b){
        a = a.toUpperCase();
        b = b.toUpperCase();
        int n1 = a.length();
        int n2 = b.length();
        char StringA[] = a.toCharArray();
        char StringB[] = b.toCharArray();

        if (n1!=n2){
            return false;
        }

        Arrays.sort(StringA);
        Arrays.sort(StringB);

        for (int i = 0; i < n1 ; i++) {
            if (StringA[i] != StringB[i]){
                return false;
            }
        }

        return true;
    }
}
