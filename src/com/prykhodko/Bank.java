package com.prykhodko;

import java.util.ArrayList;

public class Bank {
    private String branchName;
    private ArrayList<Branch> branches;


    public Bank(String name) {
        this.branchName = name;
        this.branches = new ArrayList<Branch>();
    }

    public String getBranchName() {
        return branchName;
    }

    public ArrayList<Branch> getBranshes() {
        return branches;
    }

    public boolean addBrunch(String branchName){
        if(findBrunch(branchName) == null){
            this.branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialAmount){
        Branch branch = findBrunch(branchName);
        if(branch != null){
            branch.addCustomer(customerName, initialAmount);
            return true;
        }
        return false;
    }

    public boolean addTransaction(String branchName, String customerName, double amountToAdd){
        Branch branch = findBrunch(branchName);
        if(branch != null){
            branch.addTransaction(customerName, amountToAdd);
            return true;
        }
        return false;
    }


    private Branch findBrunch(String branchName){

        for(int i = 0; i < branches.size(); i++){
            Branch findBrunch = branches.get(i);
            if(findBrunch.getBranchName() == branchName){
                return findBrunch;
            }
        }
        return null;
    }


    public void printCustomers(String branchName, boolean showTransactions){
        Branch branch = findBrunch(branchName);
        if(branch != null){
            System.out.println("Branch name: " + branch.getBranchName());
            ArrayList<Customer> branchCustomers = branch.getCustomers();

            for(int i=0; i<branchCustomers.size(); i++){
                Customer branchCustomer = branchCustomers.get(i);
                System.out.println("Customer: " + branchCustomer.getName());

                if(showTransactions){
                    System.out.println("Transactions: ");
                    ArrayList<Double> transactions = branchCustomer.getTransactions();
                    transactions.forEach( item -> {
                        System.out.println("Amount: " + item.intValue());
//                    for(int j=0; j<branchCustomers.size(); j++){
//                        System.out.println("Amount: " + branchCustomers.get(i).getTransactions());
                    });
//                }
            }
            }

        }
    }


}
