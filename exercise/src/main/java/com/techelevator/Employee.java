package com.techelevator;

public class Employee {

    private final static double defaultSalary = 60000;

    private long employeeID;
    private String firstName;
    private String lastName;
    private String email;
    private double salary;
    private Department department;
    private String hireDate;

    public Employee(long employeeID, String firstName, String lastName, String email, Department department, String hireDate) {
        this.employeeID = employeeID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.department = department;
        this.hireDate = hireDate;
    }
}
