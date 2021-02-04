package design.pattern.creator.prototype;

import java.util.Date;

public class Student implements Cloneable {
    private int age;
    private Date date;
    private String name;

    public Student() {
    }

    public Student(int age, Date date, String name) {
        this.age = age;
        this.date = date;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Student o = (Student) super.clone();
        if (date != null) {
            o.date = (Date) date.clone();
        }
        return o;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", date=" + date +
                ", name='" + name + '\'' +
                '}';
    }
}
