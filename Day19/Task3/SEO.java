package com.aca.Day19.Task3;

public class SEO extends Marketing{
    private String ceo;

    public SEO(int countOfEmployees, String departmentName) {
        super(countOfEmployees, departmentName);
    }

    @Override
    public void marketing() {
        System.out.println("CEO: " + getCEO());
    }

    public String getCEO() {
        return ceo;
    }

    public void setCEO(String ceo) {
        this.ceo = ceo;
    }
}
