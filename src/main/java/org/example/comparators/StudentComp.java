package org.example.comparators;

import java.util.Comparator;

public class StudentComp implements Comparator<Student> {
    @Override
    public int compare(Student first, Student second) {
        if (first.getAge() > second.getAge()){
            return 1;
        } else if (first.getAge() < second.getAge()) {
            return -1;
        }else {
            if (first.getName().compareTo(second.getName()) > 0){
                return 1;
            } else if (first.getName().compareTo(second.getName()) < 0) {
                return -1;
            }else {
                if (first.getLastName().compareTo(second.getLastName()) > 0){
                    return 1;
                }else {
                    return -1;
                }
            }
        }
    }
}
