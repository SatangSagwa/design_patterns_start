package org.example.behavioural_patterns.observer_pattern.subjects;

import org.example.behavioural_patterns.observer_pattern.domain.Employee;
import org.example.behavioural_patterns.observer_pattern.domain.EmployeeDAO;

import java.util.List;

public class EmployeeSystem {
    private List<Employee> employees;
    private EmployeeDAO employeeDAO;

    public EmployeeSystem() {
        employeeDAO = new EmployeeDAO();
        employees = employeeDAO.generateEmployees();
    }

    public void hireEmployee(Employee emp) {
        employeeDAO.addEmployee(emp);
        System.out.println("Employee hired: " + emp.getName());
        // Här borde alla prenumeranter automatiskt meddelas!
    }

    public void changeEmployeeName(Employee emp, String newName) {
        emp.setName(newName);
        System.out.println("Employee name changed to: " + newName);
        // Här borde alla prenumeranter automatiskt meddelas!
    }

    public void modifyEmployeeName(int id, String newName) {
        for (Employee emp : employees) {
            if (id == emp.employeeID) {
                emp.setName(newName);
                System.out.println("Employee name changed to: " + newName);
                // Här borde alla prenumeranter automatiskt meddelas!
                break;
            }
        }
    }
}
