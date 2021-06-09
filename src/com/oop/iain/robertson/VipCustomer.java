package com.oop.iain.robertson;

public class VipCustomer {

    private String name;
    private String email;
    private double creditLimit;

    public VipCustomer(String name, String email, double creditLimit) {
        this.name = name;
        this.email = email;
        this.creditLimit = creditLimit;
    }

    public VipCustomer() {
        this("default name", "default@email.com", 400.0);
        System.out.println("no input constructor");
    }

    public VipCustomer(String name, String email) {
        this(name, email, 400.0);
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

}
