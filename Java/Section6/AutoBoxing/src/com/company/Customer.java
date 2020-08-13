package com.company;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions = new ArrayList<Double>();

    public Customer(String name, ArrayList<Double> transactions) {
        this.name = name;
        this.transactions = transactions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public void setTransactions(ArrayList<Double> transactions) {
        this.transactions = transactions;
    }
}
