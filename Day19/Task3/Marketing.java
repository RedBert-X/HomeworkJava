package com.aca.Day19.Task3;

public class Marketing extends ITCompany {
    private String marketing;

    public Marketing(int countOfEmployees, String departmentName) {
        super(countOfEmployees, departmentName);
    }

    public void marketing() {
        System.out.println("Count of employees: " + getCountOfEmployees());
        System.out.println("Department name: " + getDepartmentName());
        System.out.println("Marketing: " + getMarketing());
    }

    public String getMarketing() {
        return marketing;
    }

    public void setMarketing(String marketing) {
        this.marketing = marketing;
    }
}
