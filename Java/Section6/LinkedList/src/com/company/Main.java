package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Customer customer = new Customer("Arnab" , 100);
        Customer anotherCustomer = customer;
        anotherCustomer.setBalance(35);
        System.out.println(customer.getBalance());

        ArrayList<Integer> integerArrayList = new ArrayList<Integer>();
        integerArrayList.add(5);
        integerArrayList.add(10);
        integerArrayList.add(15);

        for (int i = 0; i < integerArrayList.size(); i++) {
            System.out.println(i + " : " + integerArrayList.get(i));
        }

        integerArrayList.add(1,2);
        for (int i = 0; i < integerArrayList.size(); i++) {
            System.out.println(i + " : " + integerArrayList.get(i));
        }
    }
}
