package ru.seminars.task2;

import java.util.Scanner;

public class task2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of sequence:");
        int n = scanner.nextInt();
        System.out.println("Enter the elements of sequence:");
        System.out.println(sumEndFiveNumbers(scanner, n));

    }

    /**
     * @apiNote Дана последовательность из N целых чисел. Найти сумму чисел, оканчивающихся на 5, перед которыми идет четное число.
     * @param scanner
     * @param n
     * @return Возвращает сумму чисел, удовлетворяющих условию, если такая есть, если - нет, возвращает -1.
     */
    private static int sumEndFiveNumbers(Scanner scanner, int n) {
        int elPrevious = scanner.nextInt();
        int res = 0;
        int count = 0;
        for (int i = 1; i < n; i++) {
            int elCurrent = scanner.nextInt();
            if (elPrevious % 2 == 0 && elCurrent % 10 == 5){
                res += elCurrent;
                count += 1;
            }
            elPrevious = elCurrent;
        }
        if (count > 1) return res;
        return -1;
    }
}
