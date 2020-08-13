package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static MobilePhone myMobile = new MobilePhone("7278107091");
    public static void main(String[] args) {
	// write your code here

        boolean Assess = false;
        printList();
        int count = 0;
        //scanner.nextLine();
        while (Assess == false){
            System.out.print("Enter your Choice: ");
            count = scanner.nextInt();
            switch (count){
                case 0:
                    printList();
                    break;
                case 1:
                    printContactList();
                    break;
                case 2:
                    AddNewContact();
                    break;
                case 3:
                    ModifyContact();
                    break;
                case 4:
                    RemoveContact();
                    break;
                case 5:
                    FindAContact();
                    break;
                case 6:
                    Assess = true;
            }
        }

    }

    private static void FindAContact(){
        System.out.println("Enter the name of the contact you want to search");

        String name = scanner.nextLine();
        System.out.println("Enter contact number: ");

        String number = scanner.nextLine();
        Contacts contact = Contacts.createContact(name,number);
        myMobile.queryContact(contact);

    }

    private static void RemoveContact(){
        System.out.println("Enter the name of the contact you want to remove: ");
        scanner.nextLine();
        String name = scanner.nextLine();
        String number = scanner.nextLine();
        Contacts contactNew = Contacts.createContact(name,number);
        myMobile.removeContact(contactNew);

    }

    private static void ModifyContact(){
        System.out.println("Enter the name of the contact you want to modify: ");
        scanner.nextLine();
        String nameOld = scanner.nextLine();
        System.out.println("Enter contact number: ");
        String numberOld = scanner.nextLine();
        Contacts contact = Contacts.createContact(nameOld,numberOld);
        System.out.println("Enter the new contact name: ");

        String name = scanner.nextLine();
        System.out.println("Enter contact number: ");

        String number = scanner.nextLine();
        Contacts contactNew = Contacts.createContact(name,number);
        myMobile.updateContact(contact,contactNew);

    }

    private static void AddNewContact(){
        System.out.println("Enter contact name: ");
        scanner.nextLine();
        String name = scanner.nextLine();
        System.out.println("Enter contact number: ");

        String number = scanner.nextLine();
        Contacts contact = Contacts.createContact(name,number);
        myMobile.StoreContact(contact);
    }

    private static void printContactList(){
        for (int i = 0; i < myMobile.getContactList().size(); i++) {
            System.out.println("Contact #"+(i+1) + " : Name: " + myMobile.getContactList().get(i).getName() + "       Contact Number: " +myMobile.getContactList().get(i).getPhoneNumber() );
        }
    }


    private static void printList(){
        System.out.println("Press: ");
        System.out.println(" 0 to get the options menu");
        System.out.println(" 1 to get the full contact list");
        System.out.println(" 2 to add a new contact");
        System.out.println(" 3 to modify a contact");
        System.out.println(" 4 to remove a contact");
        System.out.println(" 5 to find a contact");
        System.out.println(" 6 to escape");
    }
}
