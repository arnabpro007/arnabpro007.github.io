package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int value = 5;
        if(value ==1){
            System.out.println(
                    "Value = 1"
            );
        }else if (value == 2){
            System.out.println("Value = 2");
        }else {
            System.out.println("Neither");
        }
        int swichValue = 1;
        switch (swichValue){
            case 1:
                System.out.println("Value = 1");
                break;
            case 2:
                System.out.println("Value = 2");
                break;
            default:
                System.out.println("Neither!");

        }

        char var = 'F';
        switch (var){
            case 'A': case 'B': case 'C': case 'D': case 'E':
                System.out.println("Entered "+var);
                break;
            default:
                System.out.println("None of the A/B/C/D/E was found");
                break;
        }


    }
}
