package ro.fasttrackit.curs12.homework.ex1;

import java.util.*;

public class Student {
    private final Map<String, Integer> students;

    public Student(Map<String, Integer> students) {
        this.students = students;
    }

    public Map.Entry<String, Integer> getMaxGrade (Map<String, Integer> students) {
        Map.Entry<String, Integer> maxGrade = null;
        for (Map.Entry<String, Integer> stud : students.entrySet()) {
            if (maxGrade == null || stud.getValue().compareTo(maxGrade.getValue()) > 0) {
                maxGrade = stud;
            }
        }
        return maxGrade;
    }
}


