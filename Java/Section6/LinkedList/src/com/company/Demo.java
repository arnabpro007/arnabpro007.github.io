package com.company;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Creating a LinkedList");
        LinkedList<String> PlacestoVisit = new LinkedList<String>();
        addInOrder(PlacestoVisit,"Kolkata");
        addInOrder(PlacestoVisit,"Kolkata");
        addInOrder(PlacestoVisit,"Delhi");
        addInOrder(PlacestoVisit,"Mumbai");
        addInOrder(PlacestoVisit,"Kashmir");

        printList(PlacestoVisit);

        addInOrder(PlacestoVisit,"Siliguri");
        System.out.println("Inserted new record");
        printList(PlacestoVisit);

        System.out.println("Removing a record");
        PlacestoVisit.remove("Mumbai");
        printList(PlacestoVisit);

        System.out.println("Adding already existing");
        addInOrder(PlacestoVisit,"Kolkata");
        System.out.println("=====Iterative Visit=====");
        visit(PlacestoVisit);
    }

    private static void printList(LinkedList<String> linkedList){
        Iterator<String> i = linkedList.iterator();
        while (i.hasNext()){
            System.out.println("Now visiting: " + i.next());

        }
        System.out.println("======================");
    }
    private static boolean addInOrder(LinkedList<String> linkedList , String newCity){
        ListIterator<String> stringListIterator = linkedList.listIterator();
        while(stringListIterator.hasNext()){
            int comparison = stringListIterator.next().compareTo(newCity);
            if (comparison == 0){
                //equal, do not add
                System.out.println(newCity + " is already included as a destination");
                return false;
            }else if(comparison>0){
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            }else if(comparison < 0){

            }
        }
        stringListIterator.add(newCity);
        return true;
    }

    public static void visit(LinkedList cities) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<String> listIterator = cities.listIterator();

        if (cities.isEmpty()){
            System.out.println("No cities in the list");
            return;
        }else{
            System.out.println("Now visiting " + listIterator.next());
            printMenu();
        }

        while(!quit){
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action){
                case 0:
                    System.out.println("Vacation Over!");
                    quit = true;
                    break;
                case 1:
                    if(!goingForward){
                        if (listIterator.hasNext()){
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if (listIterator.hasNext()){
                        System.out.println("Now visiting " + listIterator.next());
                    }else{
                        System.out.println("Reached the end of the list");
                        goingForward = false;
                    }
                    break;
                case 2:
                    if (goingForward){
                        if (listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if (listIterator.hasPrevious()){
                        System.out.println("Now visiting " + listIterator.previous());
                    }else{
                        System.out.println("We are at the start of the list!");
                        goingForward = true;
                    }
                    break;
                case 3:
                    printMenu();
                    break;
            }
        }
    }

    private static void printMenu(){
        System.out.println("Available actions: ");
        System.out.println("Press 0 to quit");
        System.out.println("Press 1 to go to next city");
        System.out.println("Press 2 to go to previous city");
        System.out.println("Press 3 to print menu");
    }
}
