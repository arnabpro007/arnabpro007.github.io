package com.company;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branchArrayList = new ArrayList<Branch>();

    public Bank(ArrayList<Branch> branchArrayList) {
        this.branchArrayList = branchArrayList;
    }

    public Bank createBank(ArrayList<Branch> branchlist){
        return new Bank(branchlist);
    }

    public void CustomerList(Branch branch){
        for (int i = 0; i < branch.getCustomerArrayList().size(); i++) {
            System.out.println("Customer: " + branch.getCustomerArrayList().get(i).getName());
        }
    }
}
