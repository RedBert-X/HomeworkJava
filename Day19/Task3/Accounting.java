package com.aca.Day19.Task3;

public class Accounting extends ITCompany {
    private int countOfEmployees;
    private String departmentName;

    public Accounting(int countOfEmployees, String departmentName) {
        super(countOfEmployees, departmentName);
    }

    public void account() {
        System.out.println("Count of employees: " + getCountOfEmployees());
        System.out.println("Department name: " + getDepartmentName());
    }

    @Override
    public int getCountOfEmployees() {
        return countOfEmployees;
    }

    @Override
    public void setCountOfEmployees(int countOfEmployees) {
        this.countOfEmployees = countOfEmployees;
    }

    @Override
    public String getDepartmentName() {
        return departmentName;
    }

    @Override
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}

