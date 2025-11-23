package com.example.a031ex;

public class Salesperson extends Employee implements BonusEligible{
    private  double salesCommission;
    private double totalSales;

    public Salesperson(int employeeid, String name, double baseSalary, double saleCommission, double totalSales){
        super(employeeid, name, baseSalary);
        this.salesCommission = saleCommission;
        this.totalSales = totalSales;
    }

    @Override
    public double calculateMonthlySalary(){
        return getBaseSalary() + ( totalSales * salesCommission);
    }

    @Override
    public double calculateBonus(){
        return (0.05*totalSales);
    }

    @Override
    public String toString(){
        return super.toString() + " Sales Commission: " + salesCommission + ", Total Sales: " + totalSales + ", Monthly Salary: " + calculateMonthlySalary();
    }
}
