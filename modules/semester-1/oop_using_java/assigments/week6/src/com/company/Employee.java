package com.company;

import java.util.Date;

public class Employee extends Person{
    protected int EmployeeID;
    protected Department department;
    protected String designation;
    protected String email;
    protected String phone;
    protected double salary;
    protected boolean isMedicalStaff;

    protected Employee(String name, String gender, Date dob, int employeeID, Department department, String designation, String email,
                        String phone, double salary, boolean isMedicalStaff)
    {
        super(name, gender, dob);
        this.department = department;
        this.EmployeeID =employeeID;
        this.email = email;
        this.designation = designation;
        this.phone = phone;
        this.salary = salary;
        this.isMedicalStaff = isMedicalStaff;
    }

    protected boolean isAMedicalStaff() {
        System.out.println("This function wil be overridden by the child classes");
        return false;
    }

    protected void printInfo() {
        System.out.println("This wiill be overriden by the child classes");
    }
}
