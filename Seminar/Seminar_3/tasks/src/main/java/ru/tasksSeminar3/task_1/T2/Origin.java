package ru.tasksSeminar3.task_1.T2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Origin {
    public static void main(String[] args) {
        Students student1 = new Students("Иванов", 5, 222, List.of(99, 55, 78));
        Students student2 = new Students("Иванова", 5, 302, List.of(91, 95, 87));
        Students student3 = new Students("Петрова", 7, 250, List.of(88, 69, 77));
        Students student4 = new Students("Сидоров", 7, 199, List.of(100, 59, 78));
        Students student5 = new Students("Аистова", 7, 299, List.of(99, 95, 88));
        List<Students> studentsList = new ArrayList<>(Arrays.asList(
                student1, student2, student3, student4, student5
        ));
//        studentsList.add(student1);
//        studentsList.add(student2);
//        studentsList.add(student3);
//        studentsList.add(student4);
//        studentsList.add(student5);
        List<Integer> grant = getListWithConditions(studentsList);
        System.out.println("grant = " + grant);
    }

    /**
     * @apiNote Возвращает список студентов, оканчивающихся на "ова" и имеющих чётную сумму баллов
     * @param studentsList
     * @return List<Integer>
     */
    private static List<Integer> getListWithConditions(List<Students> studentsList) {
        List<Integer> grant = new ArrayList<>();
        for (Students student : studentsList) {
            if (student.getName().endsWith("ова") && evenNum(student.getThreeSubScore())) grant.add(student.getGrant());
        }
        return grant;
    }

    /**
     * @apiNote Проверяет сумму элементов списка на чётность
     * @param score
     * @return False or True
     */
    private static boolean evenNum(List<Integer> score){
        int res = 0;
        for (Integer el : score) res += el;
        return res % 2 == 0;
    }
}
