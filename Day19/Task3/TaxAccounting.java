package com.aca.Day19.Task3;

public class TaxAccounting extends Accounting{
    private int taxValue;

    public TaxAccounting(int countOfEmployees, String departmentName) {
        super(countOfEmployees, departmentName);
    }


    @Override
    public void account() {
        System.out.println("Count of employees: " + getCountOfEmployees());
        System.out.println("Department name: " + getDepartmentName());
        System.out.println("Tax of company: " + getTaxValue());
    }

    public int getTaxValue() {
        return taxValue;
    }

    public void setTaxValue(int taxValue) {
        this.taxValue = taxValue;
    }
}