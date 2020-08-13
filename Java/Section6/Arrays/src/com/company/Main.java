package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();
    public static void main(String[] args) {

    boolean quit = false;
    int choice = 0;
    printInstructions();
    while(quit == false){
        System.out.println("Enter your choice: ");
        choice = scanner.nextInt();
        scanner.nextLine();
        switch (choice){
            case 0:
                printInstructions();
                break;
            case 1:
                groceryList.printGrocerylist();
                break;
            case 2:
                System.out.println("Enter the item you want to add: ");
                String item = scanner.nextLine();
                groceryList.addGroceryItem(item);
                break;
            case 3:
                System.out.println("Enter the item you want to modify: ");
                String oldItem = scanner.nextLine();
                System.out.println("Enter the new item: ");
                String newItem = scanner.nextLine();
                groceryList.modifyGroceryItem(newItem,oldItem);
                break;
            case 4:
                System.out.println("Enter the item you want to remove: ");
                item = scanner.nextLine();
                groceryList.removeGroceryItem(item);
                break;
            case 5:
                System.out.println("Enter the item you want to search: ");
                item = scanner.nextLine();
                System.out.println(groceryList.findItem(item));
                break;
            case 6:
                quit = true;
                break;


        }
    }



    }

    public static void printInstructions(){
        System.out.println("Press: ");
        System.out.println("0 - to print choice options.");
        System.out.println("1 - to print all the items");
        System.out.println("2 - to add a new item.");
        System.out.println("3 - to modify a position");

        System.out.println("4 - to remove an item from a particular position");
        System.out.println("5 - to search for an item in the list.");
        System.out.println("6 - to quit application.");
    }
    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + ", value is "+ array[i]);
        }
    }
}
