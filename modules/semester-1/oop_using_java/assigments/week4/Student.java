import java.util.Random;
import java.lang.Math;

class Student {
    int id;
    Student() {
        System.out.println("Student class default constructor.");
        Random tmp = new Random();
        this.id = Math.abs(tmp.nextInt() % 100);
    }

    Student(int id) {
        System.out.println("Student class with one pararmter(id).");
        this.id = id;
    }
}
