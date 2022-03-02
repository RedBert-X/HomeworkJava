package com.aca.Day19.Task2;

public class Accounting {
    private int countOfEmployees;
    private String departmentName;

    public void account() {
        System.out.println("Count of employees: " + getCountOfEmployees());
        System.out.println("Department name: " + getDepartmentName());
    }

    public Accounting() {
        this.countOfEmployees = countOfEmployees;
        this.departmentName = departmentName;
    }

    public int getCountOfEmployees() {
        return countOfEmployees;
    }

    public void setCountOfEmployees(int countOfEmployees) {
        this.countOfEmployees = countOfEmployees;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}