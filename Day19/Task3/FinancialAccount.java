package com.aca.Day19.Task3;

public class FinancialAccount extends Accounting{
    protected int salaryOfEmployees;

    public FinancialAccount(int countOfEmployees, String departmentName) {
        super(countOfEmployees, departmentName);
    }

    @Override
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
