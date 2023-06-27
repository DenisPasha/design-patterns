package org.example.comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();

        Student student1 = new Student("Aleks" , "Pasha" , 19);
        Student student2 = new Student("Denis" , "Boldwin" , 12);
        Student student3 = new Student("Petko" , "Merk" , 29);
        Student student4 = new Student("Sasho" , "Sheen" , 11);
        Student student5 = new Student("Georgi" , "Rowswell" , 19);
        Student student6 = new Student("Mitko" , "Simons" , 59);

        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);
        studentList.add(student6);

        studentList.forEach(student -> System.out.println(student.toString()));
        System.out.println();

        StudentComp sc = new StudentComp();
        Collections.sort(studentList,sc);

        studentList.forEach(student -> System.out.println(student.toString()));
    }
}
