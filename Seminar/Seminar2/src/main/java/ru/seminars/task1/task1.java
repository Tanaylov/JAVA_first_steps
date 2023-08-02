package ru.seminars.task1;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float number = getNumberDegree(input);
        System.out.println("number = " + number);
    }

    /**
     * Считает степень числа (число и степень вводятся последовательно в терминал)
     * @param input
     * @return Число в степени.
     */
    private static float getNumberDegree(Scanner input) {
        float number = input.nextFloat();
        int degree = input.nextInt();
        input.close();
        if (degree == 0) return 1;
        if (degree < 0){
            number = 1 / number;
            degree *= -1;
        }
        float res = number;
        for (int i = 1; i < degree; i++) {
            res *= number;
        }
        return res;
    }
}