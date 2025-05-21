package com.tka.ipl;

public class Test {
    public static void main(String[] args) {
        // Book
        Book book = new Book("Atomic Habits", "James Clear", "123456789", 499.0);
        System.out.println(book);

        // Bank
        Bank bank = new Bank("State Bank", "SB123", "Pune", 100);
        System.out.println(bank);

        // Employee
        Employee emp = new Employee("Shubham Gund", "E101", "IT", 75000);
        System.out.println(emp);

        // House
        House house = new House("Kothrud, Pune", 3, 1200.5, true);
        System.out.println(house);

        // ECommerce
        ECommerce ecommerce = new ECommerce("Flipkart", 5000, 250000, 1_50_00_000);
        System.out.println(ecommerce);
    }
}

