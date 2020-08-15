package pers.fj.design_pattern.creator.prototype;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class CloneCourse implements Cloneable{
    private String name;
    private List<Student> students;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        CloneCourse course = new CloneCourse();
        course.setName("computer");
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student(1, new Date(1), "b1"));
        students.add(new Student(2, new Date(2), "b2"));
        course.setStudents(students);

        CloneCourse clone = (CloneCourse) course.clone();
        clone.getStudents().forEach(student -> {
            System.out.println(student);
        });

        System.out.println("Change student");
        for (Student student : students) {
            student.setAge(3);
            student.setDate(new Date());
            student.setName(null);
        }

        clone.getStudents().forEach(student -> {
            System.out.println(student);
        });
    }



}
