package ro.fasttrackit.curs12.homework.ex1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

        public class StudentMain {
            public static void main(String[] args) {
                Map<String, Integer> students = new HashMap<>();
                students.put("Ionel", 10);
                students.put("Costel", 8);
                students.put("Vasile", 7);
                students.put("George", 9);

                System.out.println(students);

                Student student = new Student(students);
                System.out.println(student.getMaxGrade(students));




            }
}
