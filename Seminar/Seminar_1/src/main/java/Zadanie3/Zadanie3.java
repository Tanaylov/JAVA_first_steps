package Zadanie3;

import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        changeHalfsOfString(text);
        //System.out.println("text = " + text);
    }

    /**
     * @apiNote Дана строка. Поменять местами ее половины.
     * @param text
     * @return возвращает изменённую строку, также выводит результат на печать.
     */
    private static String changeHalfsOfString(String text){
        String first_half = text.substring(0, text.length() / 2);
        String second_half;
        String result;
        if (text.length() % 2 == 0) {
            second_half = text.substring(text.length() / 2);
            result = second_half + first_half;
        } else {
            second_half = text.substring(text.length() / 2 + 1);
            result = second_half + text.charAt(text.length() / 2) + first_half;
        }
        System.out.println("first_half = " + first_half);
        System.out.println("second_half = " + second_half);
        System.out.println("result = " + result);
        return result;
    }
}
