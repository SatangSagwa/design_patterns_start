package org.example.behavioural_patterns.observer_pattern;

import org.example.behavioural_patterns.observer_pattern.domain.Employee;
import org.example.behavioural_patterns.observer_pattern.observers.HRDepartment;
import org.example.behavioural_patterns.observer_pattern.observers.PayrollDepartment;
import org.example.behavioural_patterns.observer_pattern.subjects.EmployeeSystem;

import java.util.Date;


public class App {
// =====================================================
// OBSERVER PATTERN - CHALLENGE
// =====================================================

    /*
    INSTRUKTION:
    Den här koden fungerar, men den följer inte Observer-mönstret.
    Ni måste manuellt meddela alla avdelningar när något händer med en anställd.

    PROBLEM:
    - Om du glömmer att meddela en avdelning får den inga uppdateringar
    - Om du lägger till en ny avdelning måste du komma ihåg att meddela den överallt
    - Mycket kod-duplication i main()

    UPPGIFT:
    Implementera Observer-mönstret så att avdelningar automatiskt får meddelanden
    när något händer, utan manuell koppling.

    HINT:
    Tänk på hur tidningsprenumeration fungerar - prenumeranter får automatiskt alla nya nummer.
    */
    public static void main(String[] args) {
        // Skapar alla avdelningar manuellt
        PayrollDepartment payroll = new PayrollDepartment();
        HRDepartment hr = new HRDepartment();

        // Denna "EmployeeSystem" vet inte om avdelningarna
        EmployeeSystem empSystem = new EmployeeSystem();

        Employee bob = new Employee("Bob", new Date(), 35000, true);

        // PROBLEM: Vi måste manuellt meddela alla avdelningar!
        System.out.println("=== Anställer Bob ===");
        empSystem.hireEmployee(bob);

        // Manuell meddelande - detta är dåligt design!
        payroll.handleEmployeeChange(bob, "New hire!");
        hr.handleEmployeeChange(bob, "New hire!");

        System.out.println("\n=== Ändrar Bobs namn ===");
        empSystem.changeEmployeeName(bob, "Bengt");

        // Mer manuell meddelande - vad händer om vi glömmer en avdelning?
        payroll.handleEmployeeChange(bob, "Employee name changed.");
        hr.handleEmployeeChange(bob, "Employee name changed.");

        // Vad händer om vi vill lägga till en SecurityDepartment?
    }
}