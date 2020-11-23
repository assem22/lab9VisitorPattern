package com.iitu.kz;

public class Clerk implements IEmployee{
    private String name;
    private int yearsOfExperience;
    private double salary;
    private int vacationDays;

    public Clerk(String name, int yearsOfExperience, double salary, int vacationDays) {
        this.name = name;
        this.yearsOfExperience = yearsOfExperience;
        this.salary = salary;
        this.vacationDays = vacationDays;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getVacationDays() {
        return vacationDays;
    }

    public void setVacationDays(int vacationDays) {
        this.vacationDays = vacationDays;
    }

    @Override
    public String toString() {
        return "Clerk{" +
                "name='" + name + '\'' +
                ", yearsOfExperience=" + yearsOfExperience +
                ", salary=" + salary +
                ", vacationDays=" + vacationDays +
                '}';
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visitClerk(this);
    }
}
