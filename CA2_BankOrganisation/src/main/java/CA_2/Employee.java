/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CA_2;

/**
 *
 * @author HP
 */
public class Employee {

    private String firstName;
    private String lastName;
    private String managerType;
    private String department;

    // Constructor
    public Employee(String firstName, String lastName, String managerType, String department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.managerType = managerType;
        this.department = department;
    }

    // Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getManagerType() {
        return managerType;
    }

    public String getDepartment() {
        return department;
    }

    // Full name helper
    public String getFullName() {
        return firstName + " " + lastName;
    }

    // Display employee details
    @Override
    public String toString() {
        return "Name: " + getFullName()
                + " | Manager Type: " + managerType
                + " | Department: " + department;
    }
}