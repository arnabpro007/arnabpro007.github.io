package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your name: ");
        String name = scanner.nextLine();
        System.out.println("What is your birth year?");
        boolean hasNextInt = scanner.hasNextInt();

        if (hasNextInt == true){
            int year = scanner.nextInt();
            scanner.close();
        int age = 2020-year;
        if (age>=0 && age<=100 ) {
            System.out.println("Yo " + name + " you are " + (2020 - year) + " years old");
        }else{
            System.out.println("ERROR!!!!");
        }
        }else {
            System.out.println("ERROR!!! of type 1");
        }
    }
}
