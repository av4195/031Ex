package com.example.a031ex;

public class HourlyEmployee extends Employee{
    private double hoursWorked;
    private double hourlyRate;

    public HourlyEmployee(int employeeid, String name, double baseSalary, double hoursWorked, double hourlyRate){
        super(employeeid, name, baseSalary);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateMonthlySalary() {
        return hoursWorked * hourlyRate;
    }


}
