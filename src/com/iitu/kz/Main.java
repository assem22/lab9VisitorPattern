package com.iitu.kz;

public class Main {

    public static void main(String[] args) {
	    Employee employee1 = new Employee("Daniel", 1, 150000, 30);
        Employee employee2 = new Employee("Ann", 3, 300000, 34);

        Clerk clerk1 = new Clerk("John", 4, 300000, 34);
        Clerk clerk2 = new Clerk("Kate", 2, 180000, 30);

        IVisitor salaryVisitor = new SalaryVisitor();
        IVisitor vacationVisitor = new VacationVisitor();
        SorterVisitor sorterVisitor = new SorterVisitor();

        sorterVisitor.visitClerk(clerk1);
        sorterVisitor.visitClerk(clerk2);

        sorterVisitor.visitEmployee(employee1);
        sorterVisitor.visitEmployee(employee2);

        for (IEmployee employee: sorterVisitor.getEmployees()){
            employee.accept(salaryVisitor);
            employee.accept(vacationVisitor);
            System.out.println(employee);
        }

        for (IEmployee clerk: sorterVisitor.getClerks()){
            clerk.accept(salaryVisitor);
            clerk.accept(vacationVisitor);
            System.out.println(clerk);
        }
    }
}
