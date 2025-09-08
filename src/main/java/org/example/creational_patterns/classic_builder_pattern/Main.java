package org.example.creational_patterns.classic_builder_pattern;

public class Main {
/*
// =====================================================
// BUILDER PATTERN - CHALLENGE
// =====================================================

INSTRUKTION:
Den här koden fungerar, men den har flera problem:
- Du måste komma ihåg ordningen på parametrarna
- Många null-värden när alla fält inte behövs
- Svårt att läsa vad parametrarna betyder

PROBLEM:
- new Product("Laptop", 1200.0, null, null) - vad betyder null?
- Lätt att blanda ihop price och name
- Om du vill lägga till fler fält blir konstruktorn enorm

UPPGIFT:
Implementera Builder-mönstret så att koden blir läsbar och flexibel.
*/
    public static void main(String[] args) {
        // Denna kod fungerar, men den är opraktisk
        Product laptop = new Product("Laptop", 1200.0, null, null);
        Product phone = new Product("Phone", 900.0, "Smart phone", "Electronics");

        System.out.println(laptop);
        System.out.println(phone);
    }
}