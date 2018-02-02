package com.prykhodko;

import java.util.ArrayList;

public class Branch {
    private String branchName;
    private ArrayList<Customer> customers;

    public Branch(String branchName) {
        this.branchName = branchName;
        this.customers = new ArrayList<Customer>();
    }

    public String getBranchName() {
        return branchName;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean addCustomer(String customerName, double initialAmount){
        if(findCustomer(customerName) == null){
            this.customers.add(new Customer(customerName, initialAmount));
            return true;
        }
        return false;
    }

    public boolean addTransaction(String customerName, double amountToAdd){
        Customer customer = findCustomer(customerName);
        if(customer != null){
            customer.addTransaction(amountToAdd);
            return true;
        }

        return false;
    }

    private Customer findCustomer(String customerName){

        for(int i = 0; i < customers.size(); i++){
            Customer findCustomer = customers.get(i);
            if(findCustomer.getName() == customerName){
                return findCustomer;
            }
        }
        return null;

    }
}
