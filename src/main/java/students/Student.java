package students;

public class Student {
  /*
  represent a student with name, grade (double gpa),
  courseS currently being taken : STRING!!!
   */
  private String name;
  private Double gpa;
  private String[] courses;

  public Student(String name, Double gpa, String[] courses) {
    this.name = name;
    this.gpa = gpa;
    this.courses = courses;
  }

  public String getName() {
    return this.name;
  }

  public Double getGPA() {
    return this.gpa;
  }

  public String[] getCourses() {
    return this.courses;
  }
}
