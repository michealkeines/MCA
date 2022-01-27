import java.util.Random;
import java.lang.Math;

class Course {
    private int course_code;
    private String course_title;
    private Student[] students = new Student[10]; // 10 students per course
    private String[] programs = new String[]{"program1", "program2", "program3"}; // three programs per course
    private String program;
    private int count = 0;

    Course(int course_code, String course_title, Student student, int program_code) {
        this.course_code = course_code;
        this.course_title = course_title;
        if ((this.count + 1) <= 10) {
            this.count = this.count + 1;
            this.students[this.count] = student;
        }
        if (program_code <= 3)  {
            this.program = programs[program_code];
        }
    }

    Course(int course_code, String course_title, Student student) {
        this.course_code = course_code;
        this.course_title = course_title;
        if ((this.count + 1) <= 10) {
            this.count = this.count + 1;
            this.students[this.count] = student;
        }
        System.out.println("Choosing a random program...");
        Random tmp = new Random();
        int program_code = Math.abs(tmp.nextInt() % 3);
        if (program_code <= 3)  {
            this.program = programs[program_code];
        }
    }

    public int getCoursecode() {
        return this.course_code;
    }
    public void setCoursecode(int coursecode) {
        this.course_code = coursecode;
    }

    public String getCoursetitle() {
        return this.course_title;
    }

    public void setCoursetitle(String coursetitle) {
        this.course_title = coursetitle;
    }

    public String getProgram() {
        return this.program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public void addStudent(Student student) {
        if ((this.count + 1) <= 10) {
            this.count = this.count + 1;
            this.students[this.count] = student;
        }
    }

    public void getStudentsInfo() {
        for(int i = 1; i <= count; i++) {
            Student tmp = students[i];
            System.out.println("Student id: "+tmp.id);
        }
    }

    public void getProgramInfo() {
        System.out.println(programs[0]);
        System.out.println(programs[1]);
        System.out.println(programs[2]);
    }

    public void printCourseDetails() {
        System.out.println("Course Details");
        System.out.println("Course Title: "+this.course_title);
        System.out.println("Course Code: "+this.course_code);
        
    }
    
}
