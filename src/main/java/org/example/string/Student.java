package org.example.string;

import java.util.List;
import java.util.Objects;

public class Student {
    private String name;
    private Integer age;
    private String klass;
    private List<Integer> grade;

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = Objects.requireNonNull(name, ()->"This can not be null");
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getKlass() {
        return klass;
    }

    public void setKlass(String klass) {
        this.klass = klass;
    }

    public List<Integer> getGrade() {
        return grade;
    }

    public void setGrade(List<Integer> grade) {
        this.grade = grade;
    }

    public Student(String name, Integer age, String klass, List<Integer> grade) {
        this.name = name;
        this.age = age;
        this.klass = klass;
        this.grade = grade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) && Objects.equals(age, student.age) && Objects.equals(klass, student.klass) && Objects.equals(grade, student.grade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, klass, grade);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", klass='" + klass + '\'' +
                ", grade=" + grade +
                '}';
    }
}
