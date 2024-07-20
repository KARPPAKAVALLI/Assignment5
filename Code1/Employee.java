package com.assignment5;

public class Employee {
    //1. Add getEmployeeDetails method to the class 'Employee' and extend it in subclasses representing
    // different types of employees such as HourlyEmployee and SalariedEmployee and overload getEmployeeDetails.
    // Demonstrate polymorphism by printing various types of Employees by using Parent Class reference.
    String name;
    int id;
    Employee(String name,int id){
        this.name=name;
        this.id=id;
    }

    public String getEmployeeDetails(){
        return "Employee Name: "+name+"\n"+"ID: "+id;
    }

}
