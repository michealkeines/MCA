package com.company;

import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
	    Building buildingObj = new Building("building1","100A","LA",12,40000.45);

        buildingObj.printValues();

        Date testdate = new Date();

        ArrayList<Employee> emplist = new ArrayList<>();

        // creating a department
        Department csdep = new Department("CS",buildingObj,emplist);

        Employee emp1 = new MedicalStaff("Test1","male",testdate, 1001, csdep,"hod","test1@tes.com","1234",12345.34);
        Employee emp2 = new MedicalStaff("Test2","female",testdate, 1002, csdep,"assit","test2@tes.com","123d4",123345.34);
        Employee emp3 = new NonMedicalStaff("Test3","female",testdate, 1003, csdep,"assit","test3@tes.com","123s4",1233245.34);
        Employee emp4 = new NonMedicalStaff("Test4","male",testdate, 1004, csdep,"letc","test4@tes.com","12s34",123245.34);
        Employee emp5 = new MedicalStaff("Test5","male",testdate, 1005, csdep,"hod","test5@tes.com","12s34",123245.34);

        // Adding employees to the list
        emplist.add(emp1);
        emplist.add(emp2);
        emplist.add(emp3);
        emplist.add(emp4);
        emplist.add(emp5);

        // setting hod for the cs department
        csdep.setHOD(emp1);

        ArrayList<Department> deplist = new ArrayList<>();

        Department ecdep = new Department("EC",buildingObj,emplist);
        Department eeedep = new Department("EEE",buildingObj,emplist);
        Department biodep = new Department("Bio",buildingObj,emplist);

        ecdep.setHOD(emp2);
        eeedep.setHOD(emp1);
        biodep.setHOD(emp1);
        // added the departments to the list
        deplist.add(eeedep);
        deplist.add(ecdep);
        deplist.add(biodep);
        deplist.add(csdep);

        // Creating a hospital object
        Hospital testhospital = new Hospital("Test hospital", "nearby",deplist);

        testhospital.printInfo();



    }
}
