package org.example.behavioural_patterns.observer_pattern;

import org.example.behavioural_patterns.observer_pattern.domain.Employee;

import java.util.ArrayList;
import java.util.List;

public class NotificationManager implements Subject{
    private List<Observer> observers = new ArrayList<>();
    private Employee employee;

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(employee, message);
        }
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
        notifyObservers("Employee has been set!");
    }
}
