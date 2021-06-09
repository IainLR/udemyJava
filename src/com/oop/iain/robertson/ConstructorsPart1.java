package com.oop.iain.robertson;

public class ConstructorsPart1 {
    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public ConstructorsPart1() {
        // the use of "this" is calling our other constructor
        // this ensures defaults if empty constructor is called
        this(2345, 50.0, "Default name", "Default adress", "default phone");
    }

    public ConstructorsPart1(String customerName, String email, String phoneNumber) {
        this(1234, 50.0, customerName, email, phoneNumber);
    }

    public ConstructorsPart1(int accountNumber, double balance, String customerName, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(double amount) {
        if (amount < 0) {
            return;
        }
        this.balance += amount;
        System.out.println("updated balance: " + this.balance);

    }

    public void withdrawFunds(double amount) {
        if (this.balance - amount < 0) {
            System.out.println("Insufficient funds");
            return;
        }
        this.balance -= amount;
        System.out.println("updated balance: " + this.balance);

    }
}
