package com.company;

import java.io.*;
import java.util.*;

// A Department class with –
//    Attributes – name, building, head of the department (can be a Medical or Non-Medical staff) and list of employees
//    Methods –
//        This class must implement a method that prints all department details including the list of employees. (How will you achieve this?).
//        Add appropriate checks before assigning a HOD.

public class Department {
    private String name;
    private Building building;
    private Employee HOD;
    private ArrayList<Employee> Employees;

    public Department (String name, Building building, ArrayList<Employee> employees) {
        this.name = name;
        this.building = building;
        this.Employees = employees;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Building getBuilding() {
        return building;
    }

    public void setBuilding(Building building) {
        this.building = building;
    }

    public Employee getHOD() {
        return HOD;
    }

    public void setHOD(Employee HOD) {
        this.HOD = HOD;
    }

    public ArrayList<Employee> getEmployees() {
        return Employees;
    }

    public void addEmployee (Employee employee) {
        this.Employees.add(employee);
    }

    public void printInfo() {
        System.out.println("Department Details:");
        System.out.println("Name: " + name);
        this.building.printValues();
        this.HOD.printInfo();
        for (int i =0; i < Employees.size(); i++) {
            Employees.get(i).printInfo();
        }
    }
}
