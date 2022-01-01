package ro.fasttrackit.curs12.homework.ex1;

import java.util.*;

public class Student {
    private final Map<String, Integer> students;

    public Student(Map<String, Integer> students) {
        this.students = students;
    }

    public Map.Entry<String, Integer> getMaxGrade (Map<String, Integer> students) {
        List<Map.Entry<String, Integer>> student = new ArrayList<>(students.entrySet());
        Map.Entry<String, Integer> maxGrade = null;
        for (Map.Entry<String, Integer> stud : student) {
            if (maxGrade == null || stud.getValue() > maxGrade.getValue()) {
                maxGrade = stud;
            }
        }
        return maxGrade;
    }
}


