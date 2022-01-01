package ro.fasttrackit.curs12.homework.ex1;

import java.util.*;

public class StudentMain {
            public static void main(String[] args) {
                Map<String, Integer> students = new HashMap<>();

                students.put("Ionel", 10);
                students.put("Costel", 8);
                students.put("Vasile", 7);
                students.put("George", 9);

                System.out.println(students);

                List<Map.Entry<String, Integer>> student = new ArrayList<>(students.entrySet());
                Map.Entry<String, Integer> maxGrade = null;
                for (Map.Entry<String, Integer> stud : student) {
                    if (maxGrade == null || stud.getValue() > maxGrade.getValue()) {
                       maxGrade = stud;
                    }
                }
                System.out.println(maxGrade);
            }
}
