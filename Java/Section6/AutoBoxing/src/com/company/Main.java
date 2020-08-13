package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Double> transaction1 = new ArrayList<Double>();
        ArrayList<Double> transaction2 = new ArrayList<Double>();
        ArrayList<Double> transaction3 = new ArrayList<Double>();
        transaction1.add(332.89);
        transaction1.add(789.21);
        transaction1.add(796.32);
        transaction2.add(332.89);
        transaction2.add(789.21);
        transaction2.add(796.32);
        transaction3.add(332.89);
        transaction3.add(789.21);
        transaction3.add(796.32);

        Customer rick = new Customer("Rick", transaction1);
        Customer riya = new Customer("Riya", transaction2);
        Customer bhuto = new Customer("Bhuto", transaction3);
        ArrayList<Customer> CustomerList1 = new ArrayList<Customer>();
        CustomerList1.add(rick);
        CustomerList1.add(riya);
        ArrayList<Customer> CustomerList2= new ArrayList<Customer>();
        CustomerList2.add(bhuto);
        
        Branch Kolkata = new Branch();
        Branch KolkataNew = Kolkata.createBranch(CustomerList1);
        Branch Delhi = new Branch();
        Branch DelhiNew = Delhi.createBranch(CustomerList2);
        System.out.println("Adding new transaction: ");
        KolkataNew.AddTransaction(rick,786);
        KolkataNew.AddTransaction(bhuto,-985);
        ArrayList<Branch> branchArrayList = new ArrayList<Branch>();
        branchArrayList.add(KolkataNew);
        branchArrayList.add(DelhiNew);
        Bank SBI = new Bank(branchArrayList);

        System.out.println("Customer List");
        SBI.CustomerList(KolkataNew);
        SBI.CustomerList(DelhiNew);
        
        
    }
}
