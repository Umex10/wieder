package uml.course;

import java.util.List;

public class Course {

  private String name;
  private int sws;
  private Teacher teacher;
  private List<Student> students;

  public Course(String name, int sws, Teacher teacher, List<Student> students) {
    this.name = name;
    this.sws = sws;
    this.teacher = teacher; 
    this.students = students;
  } 

  public String getName()  {
    return this.name;
  }

  public int getSws() {
    return this.sws;
  }

  public Teacher getTeacher() {
    return this.teacher;
  }

  public List<Student> getStudents() {
    return this.students;
  }
}
