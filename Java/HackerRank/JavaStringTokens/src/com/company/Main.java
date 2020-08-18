package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        scanner.close();
        s = s.trim();

        if (s.length()>400000){
            return ;
        }else if (s.length()==0){
            System.out.println(0);
            return ;
        }else{
            String[] words = s.split("[!,?.*_'@\\ ]+");
            int count = words.length;
            System.out.println(count);
            for(String word : words){
                System.out.println(word);
            }


        }



    }

}
