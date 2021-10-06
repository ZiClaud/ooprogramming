package org.nbicocchi.objectoriented.onlineshop;

public class Customer {
    String name;
    String surname;
    String ID;

    public Customer(String name, String surname, String ID) {
        this.name = name;
        this.surname = surname;
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", ID='" + ID + '\'' +
                '}';
    }
}