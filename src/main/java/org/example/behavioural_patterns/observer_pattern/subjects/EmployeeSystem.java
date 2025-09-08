package org.example.behavioural_patterns.observer_pattern.subjects;

import org.example.behavioural_patterns.observer_pattern.NotificationManager;
import org.example.behavioural_patterns.observer_pattern.domain.Employee;
import org.example.behavioural_patterns.observer_pattern.domain.EmployeeDAO;

import java.util.List;

public class EmployeeSystem {
    private List<Employee> employees;
    private EmployeeDAO employeeDAO;
    private NotificationManager notificationManager;

    public EmployeeSystem() {
        notificationManager = new NotificationManager();
        employeeDAO = new EmployeeDAO();
        employees = employeeDAO.generateEmployees();
    }

    public void hireEmployee(Employee emp) {
        employeeDAO.addEmployee(emp);
        System.out.println("Employee hired: " + emp.getName());
        // Här borde alla prenumeranter automatiskt meddelas!
        notificationManager.notifyObservers("Employee hired");
    }

    public void changeEmployeeName(Employee emp, String newName) {
        emp.setName(newName);
        System.out.println("Employee name changed to: " + newName);
        // Här borde alla prenumeranter automatiskt meddelas!
        notificationManager.notifyObservers("Employee name changed");
    }

    public void modifyEmployeeName(int id, String newName) {
        for (Employee emp : employees) {
            if (id == emp.employeeID) {
                emp.setName(newName);
                System.out.println("Employee name changed to: " + newName);
                // Här borde alla prenumeranter automatiskt meddelas!
                notificationManager.notifyObservers("Employee name modified");
                break;
            }
        }
    }
}
