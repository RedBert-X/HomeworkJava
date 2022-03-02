package com.aca.Day19.Task2;

public class TaxAccounting extends Accounting{
    private int taxValue;

    public TaxAccounting() {
        super();
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