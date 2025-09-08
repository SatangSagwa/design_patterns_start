package org.example.structural_patterns.adapter_pattern;

public class PaymentApi {
    // Ett externt API som vi inte får ändra
    // Tar belopp i öre (int) och returnerar true/false
    public boolean makePayment(int amountInCents) {
        System.out.println("[PaymentApi] Processing " + amountInCents + " cents");
        return amountInCents > 0;
    }
}