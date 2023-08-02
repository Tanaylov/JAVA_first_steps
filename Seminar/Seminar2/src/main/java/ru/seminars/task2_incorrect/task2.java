package ru.seminars.task2_incorrect;

import java.util.Arrays;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of array:");
        int size = scanner.nextInt();
        System.out.println("Enter the elements of array:");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        //int[] array = {1, 3, 4, 32, 3, 1, 2, 5, 32, 6, 8, 13, 5, 7};
        System.out.println(Arrays.toString(arr));
        haveSum(arr);
    }

    /**
     * @apiNote Дана последовательность из N целых чисел. Найти сумму чисел, оканчивающююся на 5, перед которыми идет четное число.
     * @param array
     * Print result if it has. If not - print, there is no sequence with the given parameters.
     */
    private static void haveSum(int[] array) {
        int result = 0;
        boolean haveSum = false;
        for (int i = 0; i < array.length - 3; i++) {
            if (array[i] % 2 == 0){
                result = 0;
                for (int j = i + 1; j < array.length; j++) {
                    if (array[j] % 2 == 0){
                        if (result % 10 == 5 && result != array[j - 1]){
                            haveSum = true;
                        }
                        break;
                    } else if (j == array.length - 1) {
                        result += array[j];
                        if (result % 10 == 5 && result != array[j]){
                            haveSum = true;
                        }
                    } else if (result % 10 == 5 && result != array[j - 1]) {
                        haveSum = true;
                        break;
                    } else result += array[j];
                }
            }
            if (haveSum) break;
        }
        if (haveSum) System.out.println(result);
        else System.out.println("Такой последовательности нет");
    }
}
