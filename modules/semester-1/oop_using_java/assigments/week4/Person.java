import java.util.Random;
import java.lang.Math;

class Person {
    private int id;
    private String name;
    private String dob;

    Person(String name, String dob) {
        System.out.println("Person class constuctor without id.");
        Random tmp = new Random();
        this.id = Math.abs(tmp.nextInt() % 100);
        this.name = name;
        this.dob = dob;
    }
    Person(int id, String name, String dob) {
        System.out.println("Person class constuctor with all parameters.");
        this.id = id;
        this.name = name;
        this.dob = dob;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDOB() {
        return this.dob;
    }

    public void setDOB(String dob) {
        this.dob = dob;
    }

    public void printPerson() {
        System.out.println("Person Details\nID: "+this.id+"\n"+"Name: "+this.name+"\n"+"DOB: "+this.dob);
    }
}
