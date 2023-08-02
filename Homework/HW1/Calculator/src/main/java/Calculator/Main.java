package Calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        char c = ')';
        int result = calculate(c, a, b);
        System.out.println("result = " + result);
    }
    private static int calculate(char op, int a, int b) {
        // Введите свое решение ниже
        switch (op) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                return a / b;
            default:
                System.out.println("Некорректный оператор: " + op);
                return -1;
        }
    }
}