package design.pattern.creator.prototype;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class DeepCloneCourse implements Cloneable{
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

    @Override
    protected Object clone() throws CloneNotSupportedException {
        DeepCloneCourse clone = (DeepCloneCourse) super.clone();
        if (students != null) {
            clone.students = this.students.stream().map(s -> {
                try {
                    return (Student)s.clone();
                } catch (CloneNotSupportedException e) {
                    throw new RuntimeException(e);
                }
            }).collect(Collectors.toList());
        }
        return clone;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        DeepCloneCourse course = new DeepCloneCourse();
        course.setName("computer");
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student(1, new Date(1), "a1"));
        students.add(new Student(2, new Date(2), "a2"));
        course.setStudents(students);

        DeepCloneCourse clone = (DeepCloneCourse) course.clone();
        clone.getStudents().forEach(student -> {
            System.out.println(student);
        });

        System.out.println("Change student");
        for (Student student : students) {
            student.setAge(3);
            student.setDate(new Date(3));
            student.setName(null);
        }

        clone.getStudents().forEach(student -> {
            System.out.println(student);
        });
    }



}
