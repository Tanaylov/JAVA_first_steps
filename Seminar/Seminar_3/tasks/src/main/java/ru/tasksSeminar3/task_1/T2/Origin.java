package ru.tasksSeminar3.task_1.T2;

import java.util.ArrayList;
import java.util.List;

public class Origin {
    public static void main(String[] args) {
        Students student1 = new Students("Иванов", 5, 222, 99);
        Students student2 = new Students("Иванова", 5, 302, 98);
        Students student3 = new Students("Петрова", 7, 250, 97);
        Students student4 = new Students("Сидоров", 7, 199, 89);
        Students student5 = new Students("Аистова", 7, 299, 90);
        List<Students> studentsList = new ArrayList<>();
        studentsList.add(student1);
        studentsList.add(student2);
        studentsList.add(student3);
        studentsList.add(student4);
        studentsList.add(student5);
        List<Integer> grant = new ArrayList<>();
        for (Students student : studentsList) {
            if (student.getName().endsWith("ова") && student.getThreeSubScore() % 2 == 0) grant.add(student.getGrant());
        }
        System.out.println("grant = " + grant);
    }
}
