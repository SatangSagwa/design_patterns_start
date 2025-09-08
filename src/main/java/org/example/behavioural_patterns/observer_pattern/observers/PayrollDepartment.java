package org.example.behavioural_patterns.observer_pattern.observers;

import org.example.behavioural_patterns.observer_pattern.domain.Employee;

public class PayrollDepartment {
    public void handleEmployeeChange(Employee emp, String message) {
        System.out.println("PAYROLL department notified...");
        System.out.println(message + ": " + emp.getName());
    }
}