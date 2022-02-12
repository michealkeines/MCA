package com.company;

import java.util.ArrayList;

public class Hospital {
    // Attributes – name, location, list of departments
    private String name;
    private String location;
    private ArrayList<Department> Departments;

    public Hospital(String name, String location, ArrayList<Department> departments) {
        this.name = name;
        this.location = location;
        this.Departments = departments;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public ArrayList<Department> getDepartments() {
        return Departments;
    }

    public void addDepartments(Department department) {
        Departments.add(department);
    }

    //Methods –
    //        This class must implement a method that prints all details. (How will you achieve this?).
    //        When you print details of a hospital, details of all departments and details of each employee in that department should be printed.

    public void printInfo() {
        System.out.println("Hospital Information");
        System.out.println("Name: " + name);
        System.out.println("Location: " + location);
        int i;
        for (i = 0; i < Departments.size(); i++ ) {
            Department current = Departments.get(i);
            current.printInfo();
        }
    }

}
