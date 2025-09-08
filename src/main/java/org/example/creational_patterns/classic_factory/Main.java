package org.example.creational_patterns.classic_factory;

public class Main {
/*
// =====================================================
// FACTORY PATTERN - CHALLENGE
// =====================================================

INSTRUKTION:
Den här koden fungerar, men den har flera problem:
- Samma if-else logik upprepas överallt
- Om du lägger till en ny produkttyp måste du ändra på många ställen
- Mycket duplicerad kod

PROBLEM:
- Samma if-else block kopierat två gånger
- Om vi lägger till "SUBSCRIPTION" produkttyp måste vi ändra varje if-else
- Svårt att testa och underhålla

UPPGIFT:
Implementera Factory-mönstret för att centralisera skapandet av Product-objekt.
*/
    public static void main(String[] args) {
        // Denna kod fungerar, men den är opraktisk och svår att underhålla

        PhysicalProduct physicalProduct = new PhysicalProduct();
        physicalProduct.deliver();

        DigitalProduct digitalProduct = new DigitalProduct();
        digitalProduct.deliver();

        // Om vi vill skapa fler produkter...
        PhysicalProduct anotherPhysical = new PhysicalProduct();
        anotherPhysical.deliver();

        DigitalProduct anotherDigital = new DigitalProduct();
        anotherDigital.deliver();
    }
}