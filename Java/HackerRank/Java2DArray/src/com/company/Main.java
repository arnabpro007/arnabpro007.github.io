package com.company;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
	// write your code here
        int[][] arr = new int[6][6];
        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int j = 0; j < 6; j++) {
            int arrItem = Integer.parseInt(arrRowItems[j]);
            arr[i][j] = arrItem;
            }
        }
        System.out.println("here");
        scanner.close();

        int m = 0;
        int n = 0;
        int sum = -100;
        while(n<=3) {
            while (m <= 3) {
                int temp = arr[m][n] + arr[m][n + 1] + arr[m][n + 2] + arr[m + 1][n + 1] + arr[m + 2][n] + arr[m + 2][n + 1] + arr[m + 2][n + 2];
                if (temp > sum) {
                    sum = temp;
                }
                m++;


            }
            n++;
        }
        System.out.println(sum);
    }
}
