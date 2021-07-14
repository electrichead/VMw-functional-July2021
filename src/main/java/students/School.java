package students;

import java.util.Arrays;

public class School {
  /*
  create several students...
  - print all the students
  - print all the "smart" students
   */

  private Student[] students = {
    new Student("Frodo", 3.4, new String[] {"Geography", "History"}),
    new Student("Bilbo", 1.5, new String[] {"English", "History"})
  };

  public School(Student[] students) {
    this.students = students;
  }

  private void printStudents() {
    Arrays.stream(this.students).forEach(s -> System.out.println(s.getName()));
  }

  private void printSmartStudents() {
    Arrays.stream(this.students)
        .filter(s -> s.getGPA() > 3)
        .forEach(s -> System.out.println(s.getName()));
  }
}
