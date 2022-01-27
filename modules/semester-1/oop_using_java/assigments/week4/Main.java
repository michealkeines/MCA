class Main {
    public static void main(String[] args) {
      System.out.println("Inside Main Class");
  
      // class 1
      MyClass myclassobj = new MyClass();
      myclassobj.printMessage();
  
      System.out.println("----------------------\n");
      // class 2
      Student studentobj1 = new Student();
      System.out.println("Student ID: " + studentobj1.id);
  
      Student studentobj2 = new Student(12);
      System.out.println("Student ID: " + studentobj2.id);
  
      System.out.println("----------------------\n");
      // class 3
      Person personobj1 = new Person("kaines", "1-12-21");
      personobj1.printPerson();
  
      personobj1.setId(2);
      personobj1.setName("kaines mik");
  
      System.out.println("DOB stays the same: " + personobj1.getDOB());
  
      personobj1.printPerson();
  
      Person personobj2 = new Person(2, "mike", "3-3-12");
      personobj2.printPerson();
  
      System.out.println("name stays the same: " + personobj2.getName());
  
      personobj2.setDOB("6-2-13");
      personobj2.setId(4);
  
      personobj2.printPerson();
  
  
      Student studentobj3 = new Student(15);
      Student studentobj4 = new Student(13);
      Student studentobj5 = new Student(14);
  
      System.out.println("----------------------\n");
  
      // class 4
      Course courseobj1 = new Course(1,"course title1",studentobj1,2);
      courseobj1.printCourseDetails();
  
      courseobj1.addStudent(studentobj2);
      courseobj1.addStudent(studentobj3);
      courseobj1.addStudent(studentobj4);
      courseobj1.addStudent(studentobj5);
  
      System.out.println("\nStudent Info");
      courseobj1.getStudentsInfo(); 
      System.out.println("\nPrograms Info");
      courseobj1.getProgramInfo();
    }
  }
