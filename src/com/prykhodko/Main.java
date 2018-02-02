package com.prykhodko;

public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank("RBC");

        bank.addBrunch("Montreal");
        bank.addCustomer("Montreal", "Emma", 45.00);
        bank.addCustomer("Montreal", "Ivan", 33.34);
        bank.addCustomer("Montreal", "Nick", 789.98);
        bank.addTransaction("Montreal", "Nick", 100.00);
        bank.addTransaction("Montreal", "Nick", 500.00);
        bank.addTransaction("Montreal", "Ivan", 100.00);

        bank.addBrunch("Quebec");
        bank.addCustomer("Quebec", "Daniel", 567.99);
        bank.addCustomer("Quebec", "Joe", 54.00);
        bank.addCustomer("Quebec", "Valery", 76.99);
        bank.addTransaction("Quebec", "Joe", 900.00);

        bank.printCustomers("Montreal", true);
        System.out.println("=========================");
        bank.printCustomers("Quebec", true);
        System.out.println("==========================");

        if(!bank.addCustomer("Toronto", "Helen", 5.45)){
            System.out.println("Error! Toronto branch does not exist.");
        }

        if(!bank.addCustomer("Montreal", "Helen", 5.45)){
            System.out.println("Error! Customer does not exist in this brunch.");
        }

        if(!bank.addBrunch("Montreal")){
            System.out.println("The branch already exists");
        }


    }
}
