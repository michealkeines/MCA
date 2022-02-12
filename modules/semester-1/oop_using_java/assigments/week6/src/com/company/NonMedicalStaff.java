package com.company;

import java.util.Date;

public class NonMedicalStaff extends Employee{
    private boolean isAdministrativeStuff;
    private boolean isManager;

    protected NonMedicalStaff(String name, String gender, Date dob, int employeeID, Department department, String designation, String email, String phone, double salary) {
        super(name, gender, dob, employeeID, department, designation, email, phone, salary, false);

    }

    public boolean isAdministrativeStuff() {
        return isAdministrativeStuff;
    }

    public void setAdministrativeStuff(boolean administrativeStuff) {
        isAdministrativeStuff = administrativeStuff;
    }

    public boolean isManager() {
        return isManager;
    }

    public void setManager(boolean manager) {
        isManager = manager;
    }

    public boolean isAMedicalStaff() {
        return  isMedicalStaff;
    }

    public void printInfo() {
        System.out.println("Non Medical Staff:");
        System.out.println("Name: " + name);
        System.out.println("employeeID: " + EmployeeID);
        System.out.println("Department: " + department.getName());
        if (isAdministrativeStuff) {
            System.out.println("Is a Administrative Staff");
        }
        if (isManager) {
            System.out.println("Is a Manager");
        }
    }
}
