package com.company;

import java.util.Date;

public class MedicalStaff extends Employee {

    private String specialization;
    private String registrationNumber;
    private float yearsOfMedicalExperience;
    private boolean isDoctor;
    private boolean isVisitingConsultant;

    public MedicalStaff(String name, String gender, Date dob, int employeeID, Department department, String designation, String email, String phone, double salary) {
        super(name, gender, dob, employeeID, department, designation, email, phone, salary, true);
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public float getYearsOfMedicalExperience() {
        return yearsOfMedicalExperience;
    }

    public void setYearsOfMedicalExperience(float yearsOfMedicalExperience) {
        this.yearsOfMedicalExperience = yearsOfMedicalExperience;
    }

    public boolean isDoctor() {
        return isDoctor;
    }

    public void setDoctor(boolean doctor) {
        isDoctor = doctor;
    }


    public void setVisitingConsultant(boolean visitingConsultant) {
        isVisitingConsultant = visitingConsultant;
    }

    public boolean isAMedicalStaff() {
        return  isMedicalStaff;
    }

    public boolean isVisitingConsultant() {
        if (isDoctor) {
            return isVisitingConsultant;
        } else {
            return false;
        }
    }

    public void printInfo() {
        System.out.println("Medical Staff Details: ");
        System.out.println("specialization: " + specialization);
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("yearsOfMedicalExperience: "+yearsOfMedicalExperience);
        if (isDoctor) {
            System.out.println("Is a Doctor");
        }
        if (isVisitingConsultant) {
            System.out.println("Is a isVisitingConsultant");
        }
    }
}
