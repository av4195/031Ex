package com.example.a031ex;

public class Manager extends Employee implements BonusEligible{
    private String departmant;
    private double managementBonusPercentage;

    public Manager(int employeeid, String name, double baseSalary, String departmant, double managementBonusPercentage){
        super(employeeid, name, baseSalary);
        this.departmant = departmant;
        this.managementBonusPercentage = managementBonusPercentage;
    }

    @Override
    public double calculateMonthlySalary() {
        return getBaseSalary();
    }

    public double calculateBonus() {
        return getBaseSalary()*managementBonusPercentage;
    }

    @Override
    public String toString() {
        return super.toString() + ", Department: " + departmant+ ", Bonus Percentage: " + managementBonusPercentage;
    }

}
