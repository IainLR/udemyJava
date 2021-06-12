package com.oop.iain.robertson;

public class Main {

    public static void main(String[] args) {
//        VipCustomer cus1 = new VipCustomer();
//        System.out.println(cus1.getName());
//
//        VipCustomer cus2 = new VipCustomer("Jack", "Jack@email.com");
//        System.out.println(cus2.getName());
        Animal animal = new Animal(1, 1, 5, 5, "Animal");

        Dog dog = new Dog(8, 20, "Yorkie", 2, 4, 1, 20, "long silky");
        dog.eat();
    }
}
