package com.iitu.kz;

public class VacationVisitor implements IVisitor{
    @Override
    public void visitEmployee(Employee employee) {
        boolean experience = employee.getYearsOfExperience() > 2;
        if (experience){
            int increasedVacationDays = employee.getVacationDays() + 4;
            employee.setVacationDays(increasedVacationDays);
        }
    }

    @Override
    public void visitClerk(Clerk clerk) {
        boolean experience = clerk.getYearsOfExperience() > 2;
        if (experience){
            int increasedVacationDays = clerk.getVacationDays() + 2;
            clerk.setVacationDays(increasedVacationDays);
        }
    }
}
