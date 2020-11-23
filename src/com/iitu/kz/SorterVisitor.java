package com.iitu.kz;

import java.util.ArrayList;
import java.util.List;

public class SorterVisitor implements IVisitor{

    private final List<Employee> employees;
    private final List<Clerk> clerks;

    public SorterVisitor() {
        employees = new ArrayList<>();
        clerks = new ArrayList<>();
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public List<Clerk> getClerks() {
        return clerks;
    }

    @Override
    public void visitEmployee(Employee employee) {
        employees.add(employee);
    }

    @Override
    public void visitClerk(Clerk clerk) {
        clerks.add(clerk);
    }

    @Override
    public String toString() {
        return "SorterVisitor{" +
                "employees=" + employees +
                ", clerks=" + clerks +
                '}';
    }
}
