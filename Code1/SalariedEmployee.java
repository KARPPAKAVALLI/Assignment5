package com.assignment5;

public class SalariedEmployee extends Employee{
    //1. Add getEmployeeDetails method to the class 'Employee' and extend it in subclasses representing
    // different types of employees such as HourlyEmployee and SalariedEmployee and overload getEmployeeDetails.
    // Demonstrate polymorphism by printing various types of Employees by using Parent Class reference.
    String name;
    int id;
    double salary;
    SalariedEmployee(String name,int id,double salary){
        super(name,id);
        this.salary=salary;
    }
    public String getEmployeeDetails(){
        return super.getEmployeeDetails()+"\n"+"Salary: "+salary;

    }
}
