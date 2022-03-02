package com.aca.Day19.Task2;

public class FinancialAccount extends TaxAccounting {
    private int salaryOfEmployees;

    public FinancialAccount() {
        super();
    }

    public void account() {
        System.out.println("Count of employees: " + getCountOfEmployees());
        System.out.println("Department name: " + getDepartmentName());
        System.out.println("Salary of employees: " + getSalaryOfEmployees());
    }

    public int getSalaryOfEmployees() {
        return salaryOfEmployees;
    }

    public void setSalaryOfEmployees(int salaryOfEmployees) {
        this.salaryOfEmployees = salaryOfEmployees;
    }

}