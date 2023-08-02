package ru.seminars.task3;

import java.util.Arrays;

public class task3 {
    public static void main(String[] args) {
        int[] arr = {2, 1, 0, 4, 2, 15, 8, 4, 2};
        int[] arrRunning = new int[arr.length];
        arrRunning[0] = arr[0]; // Task from first seminar;
        for (int i = 1; i < arr.length; i++) {
            arrRunning[i] = arrRunning[i - 1] + arr[i];
        }
        System.out.println(Arrays.toString(arrRunning));
        int count = getCount(arr);
        System.out.println("count = " + count);
    }

    /**
     * @apiNote  Дан массив целых чисел. Найти количество пар соседних элементов, где первый элемент вдвое больше второго.
     * @param arr - entering array;
     * @return number of pairs in the array satisfying the task requirement;
     */
    private static int getCount(int[] arr) {
        int count = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] == arr[i] * 2) count ++;
        }
        return count;
    }
}
