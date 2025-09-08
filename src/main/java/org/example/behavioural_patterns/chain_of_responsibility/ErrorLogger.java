package org.example.behavioural_patterns.chain_of_responsibility;

public class ErrorLogger {
    public void log(String message) {
        System.out.println("ERROR: " + message);
    }
}