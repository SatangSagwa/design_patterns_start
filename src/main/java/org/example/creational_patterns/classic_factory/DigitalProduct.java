package org.example.creational_patterns.classic_factory;

public class DigitalProduct implements Product {
    @Override
    public void deliver() {
        System.out.println("Delivering product by email!");
    }
}