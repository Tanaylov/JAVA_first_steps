package Zadanie4;

import java.util.Scanner;

public class Zadanie4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr_num = getArrNum(scanner, n); // todo: возможно и так: int[] nums = {1, 2, 3, 4};
        checkSimmetric(n, arr_num);
        printArray(n, arr_num);
    }

    /**
     * @apiNote Print Array
     * @param n
     * @param arr_num
     */
    private static void printArray(int n, int[] arr_num) {
        for (int i = 0; i < n; i++) {
            System.out.printf("arr_num[%d] = %d; \n", i, arr_num[i]);
        }
    }

    /**
     * @apiNote Creat array using inputs
     * @param scanner
     * @param n
     * @return Array
     */
    private static int[] getArrNum(Scanner scanner, int n) {
        int[] arr_num = new int[n];
        for (int i = 0; i < n; i++) {
            arr_num[i] = scanner.nextInt();
        }
        return arr_num;
    }

    /**
     * @apiNote Check array of numbers for symmetrical
     * @param n
     * @param arr_num
     */
    private static void checkSimmetric(int n, int[] arr_num) {
        boolean flag = true;
        for (int i = 0; i < n / 2; i++) {
           if (arr_num[i] != arr_num[n - i - 1]) {
               flag = false;
               System.out.println("array isn't symmetrical");
               break;
           }
        }
        if (flag) System.out.println("symmetrical array");
    }
}
