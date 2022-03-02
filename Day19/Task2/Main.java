package com.aca.Day19.Task2;

public class Main {
    public static void main(String[] args) {

    }

    public static void accountingMain() {
        Accounting account = new Accounting();
        account.setCountOfEmployees(5);
        account.setDepartmentName("Default department name :)");
        account.account();
    }

    public static void taxAccountingMain() {
        TaxAccounting taxAccount = new TaxAccounting();
        taxAccount.setCountOfEmployees(900);
        taxAccount.setDepartmentName("Not default department name :)");
        taxAccount.setTaxValue(2);
        taxAccount.account();
    }

    public static void financialAccountingMain() {
        FinancialAccount t = new FinancialAccount();
        t.setCountOfEmployees(3);
        t.setDepartmentName("Super default department name :)");
        t.setTaxValue(7);
        t.setSalaryOfEmployees(1000);
        t.account();
    }
}
