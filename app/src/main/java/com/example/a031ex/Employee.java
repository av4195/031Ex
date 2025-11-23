package com.example.a031ex;

public abstract class Employee {
    private final int employeeid;
    private String name;
    private double baseSalary;

    public Employee(int employeeid, String name, double baseSalary){
        this.employeeid = employeeid;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public int getEmployeedid(){
        return this.employeeid;
    }
    public String getName(){
        return this.name;
    }
    public double getBaseSalary(){
        return this.baseSalary;
    }

    public abstract double calculateMonthlySalary();

    @Override
    public String toString() {
        return "ID: " + employeeid + ", Name: " + name + ", Base Salary: " + baseSalary;
    }
}
