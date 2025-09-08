package org.example.behavioural_patterns.observer_pattern.observers;

import org.example.behavioural_patterns.observer_pattern.Observer;
import org.example.behavioural_patterns.observer_pattern.domain.Employee;

public class HRDepartment implements Observer {
    public void handleEmployeeChange(Employee emp, String message) {
        System.out.println("HR department notified...");
        System.out.println(message + ": " + emp.getName());
    }

    @Override
    public void update(Employee employee, String message) {
        handleEmployeeChange(employee, message);
    }
}