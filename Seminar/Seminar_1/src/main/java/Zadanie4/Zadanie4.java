package Zadanie4;

import java.util.Scanner;

public class Zadanie4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr_num = new int[n];
        for (int i = 0; i < n; i++) {
            arr_num[i] = scanner.nextInt();
        }
        boolean flag = true;
        for (int i = 0; i < n / 2; i++) {
           if (arr_num[i] != arr_num[n - i - 1]) {
               flag = false;
               System.out.println("array isn't symmetrical");
               break;
           }
        }
        if (flag) System.out.println("symmetrical array");
        for (int i = 0; i < n; i++) {
            System.out.printf("arr_num[%d] = %d; \n", i, arr_num[i]);
        }
    }
}
