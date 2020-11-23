package com.iitu.kz;

public class SalaryVisitor implements IVisitor{
    @Override
    public void visitEmployee(Employee employee) {
        boolean experience = employee.getYearsOfExperience() > 2;
        if (experience){
            double increasedSalary = employee.getSalary() * 1.15;
            employee.setSalary(increasedSalary);
        }
    }

    @Override
    public void visitClerk(Clerk clerk) {
        boolean experience = clerk.getYearsOfExperience() > 2;
        if (experience){
            double increasedSalary = (clerk.getSalary() * 1.1);
            clerk.setSalary(increasedSalary);
        }
    }
}
