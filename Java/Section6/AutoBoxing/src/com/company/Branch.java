package com.company;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customerArrayList = new ArrayList<Customer>();

    public Branch(ArrayList<Customer> customerArrayList) {
        this.customerArrayList = customerArrayList;
    }
    public Branch createBranch(ArrayList<Customer> newArray){
        this.customerArrayList = newArray;
        return new Branch(newArray);
    }
    public void AddTransaction(Customer customer, double value) {
        if (value < 0 || !findCustomer(customer)) {
            System.out.println("Invalid Transactions");
        } else {
            customer.getTransactions().add(value);
            System.out.println("Transaction Successful! ");

        }
    }

    private boolean findCustomer(Customer customer){
        for (int i = 0; i < customerArrayList.size(); i++) {
            if (customerArrayList.get(i) == customer){
                return true;
            }
        }
        return false;
    }

    public Branch() {
    }

    public ArrayList<Customer> getCustomerArrayList() {
        return customerArrayList;
    }
}
