package com.prykhodko;

import java.util.ArrayList;

public class Customer {
    private String customerName;
    private ArrayList <Double> transactions;

    public Customer(String name, double initialAmount) {
        this.customerName = name;
        this.transactions = new ArrayList<Double>();
        addTransaction(initialAmount);
    }

    public void addTransaction(double amountToAdd){
        transactions.add(amountToAdd);
    }


    public String getName() {
        return customerName;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

}
