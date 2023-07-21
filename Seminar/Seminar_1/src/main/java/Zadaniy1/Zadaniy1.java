package Zadaniy1;

import java.util.Scanner;

public class Zadaniy1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = zadanieOneMethod(n);
        System.out.println("result = " + result);
    }

    /**
     * @apiNote https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/description/
     * @param n входящее число
     * @return произведение разрядов минус их сумма
     */
    private static int zadanieOneMethod(int n) {
        int sum_n = 0;
        int product_n = 1;
        while (n != 0){
            sum_n += n % 10;
            product_n *= n % 10;
            n /= 10;
        }
        return product_n - sum_n;
    }
}