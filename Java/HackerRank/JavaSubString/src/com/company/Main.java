package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        int start = scanner.nextInt();
        int end = scanner.nextInt();

        String subString = S.substring(start,end);
        System.out.println(subString);

    }
}
