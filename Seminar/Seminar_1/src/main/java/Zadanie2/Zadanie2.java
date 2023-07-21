package Zadanie2;

import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {
        countPosNum();
    }

    /**
     * @apiNote Дана последовательность N целых чисел.
     * Найти количество положительных чисел,
     * после которых следует отрицательное число.
     * @param -
     * @return Выводит в консоль количество положительных
     * элементов введёных пользователем
     * до ввода отрицательного числа
     */
    static public void countPosNum(){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        byte countPositiveNum = 0;
        while (n > 0){
            n = input.nextInt();
            countPositiveNum ++;
        }
        input.close();
        System.out.println("countPositiveNum = " + countPositiveNum);
    }
}
