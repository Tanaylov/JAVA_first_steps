package ru.seminars.task4;

public class task4 {
    public static void main(String[] args) {
        Vector_task4 vector1 = new Vector_task4(1, 2, 3);
        Vector_task4 vector2 = new Vector_task4(1, 0, -5);
        System.out.println("vector1.getX() = " + vector1.getX());
        System.out.println("vector1 = " + vector1);
        System.out.println("vector2 = " + vector2);
        vector1.setZ(9);
        System.out.println("vector1 = " + vector1);
        System.out.println("vector1.length() = " + vector1.length());
        System.out.println("vector1.scalar(vector2) = " + vector1.scalar(vector2));
        Vector_task4 v3 = vector1.vectorProduct(vector2);
        System.out.println("v3 = " + v3);
        System.out.println("vector1.cos(vector2) = " + vector1.cos(vector2));
        // TODO: Доделать задание: методы для суммы и разости.
    }
}
