package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int k = scanner.nextInt();
        scanner.close();
        System.out.println(getSmallestAndLargest(s,k));
    }
    public static String getSmallestAndLargest(String s , int k){

        int lengthOfs = s.length();
        String smallest = s.substring(0,k);
        String largest = "";
        for (int i = 0; i < lengthOfs-k+1 ; i++) {
            String temp = s.substring(i,(i+k));

            if (temp.compareTo(smallest)<0){
                smallest = temp;
            }

            if (temp.compareTo(largest)>0){
                largest = temp;
            }
        }
        return smallest + "\n" + largest;
    }
}
