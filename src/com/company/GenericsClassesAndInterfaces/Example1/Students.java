package com.company.GenericsClassesAndInterfaces.Example1;

import java.util.ArrayList;
import java.util.List;

public class Students {
    public int age;
    public int averageGrade;

    public Students() {

    }

    public Students(int age, int averageGrade) {
        this.age = age;
        this.averageGrade = averageGrade;
    }

    public List<Students> getAllStudents() {
        List<Students> studentList = new ArrayList<>();
        studentList.add(new Students(14, 10));
        studentList.add(new Students(15, 9));
        studentList.add(new Students(15, 10));
        return studentList;
    }
}
