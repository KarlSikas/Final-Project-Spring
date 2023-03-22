package com.example.finalprojectspr.models;

/**
 * @author Karl-Erik Sirkas
 * @ Date 22.03.2023
 */
public class Employee {

    private String name;

    private String position;

    private String branchLocation;

    public Employee(String name, String position, String branchLocation) {
        this.name = name;
        this.position = position;
        this.branchLocation = branchLocation;
    }
}