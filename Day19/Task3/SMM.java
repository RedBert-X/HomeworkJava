package com.aca.Day19.Task3;

public class SMM extends Marketing{
        private String smm;

    public SMM(int countOfEmployees, String departmentName) {
        super(countOfEmployees, departmentName);
    }

    @Override
    public void marketing() {
        System.out.println("Count of employees: " + getCountOfEmployees());
        System.out.println("Department name: " + getDepartmentName());
        System.out.println("Marketing: " + getSMM());
    }

        public String getSMM() {
            return smm;
        }

        public void setSMM(String smm) {
            this.smm = smm;
        }
}
