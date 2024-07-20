package com.assignment5;

public class EmployeeDemo {
    //1. Add getEmployeeDetails method to the class 'Employee' and extend it in subclasses representing
    // different types of employees such as HourlyEmployee and SalariedEmployee and overload getEmployeeDetails.
    // Demonstrate polymorphism by printing various types of Employees by using Parent Class reference.
    public static void main(String[] args) {
        Employee [] e=new Employee[]{new SalariedEmployee("Alex",101,200000),
                new HourlyEmployee("Jen",201,200)};
        for (Employee i:e){
            System.out.println(i.getEmployeeDetails());
            System.out.println();
        }
    }
}
