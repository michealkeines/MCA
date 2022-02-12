package com.company;

import java.util.Date;

public class Person {
    protected String name;
    protected String gender;
    protected Date dob;

    protected Person(String name, String gender, Date dob) {
        this.name = name;
        this.gender = gender;
        this.dob = dob;
    }
}
