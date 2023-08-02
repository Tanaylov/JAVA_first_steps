package Calculator;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) throws Exception{
        /**В файле задано уравнение вида q + w = e (q, w, e >= 0). Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69.

         Восстановите выражение до верного равенства.

         Предложите хотя бы одно решение или сообщите, что его нет.

         Напишите класс Equation, содержащий метод getSolution, который будет считывать уравнение из файла и восстановит его до верного равенства.

         Выведите сначала строку формата "Given the equation: {выражение из файла}".

         А затем верните строку формата "Result: {цельное выражение}".

         Если выражение не имеет решений - верните строку "No solution".*/
//        FileWriter fw = new FileWriter("input.txt");
//        fw.write("2?2 + 2?5 = 497");
//        fw.flush();
        String file = "input.txt";
        BufferedReader br = new BufferedReader(new FileReader(file));
        String text = br.readLine();
        br.close();                                     //"2?2 + 2?5 = 498";
        System.out.println(solution(text));
    }

    private static String solution(String text) {
        String[] text_arr = text.split(" "); // {"2?", "+", "?5", "=", "69"}
        int size = text_arr.length;
        int result = Integer.parseInt(text_arr[size - 1]);
        int index1 = text_arr[0].indexOf('?') + 1;
        int index2 = text_arr[2].indexOf('?') + 1;
        int searchingDigit1 = (int) Math.pow(10, text_arr[0].length() - index1);
        int searchingDigit2 = (int) Math.pow(10, text_arr[2].length() - index2);
        int num1 = Integer.parseInt(text_arr[0].replace('?', '0'));
        int num2 = Integer.parseInt(text_arr[2].replace('?', '0'));
        boolean solution = false;
        if (num1 + num2 == result) solution = true;
        else {
            for (int i = 1; i < 10; i++) {
                num1 += searchingDigit1;
                int n2 = num2;
                for (int j = 0; j < 10; j++) {
                    if (num1 + n2 == result) {
                        solution = true;
                        num2 = n2;
                        break;
                    }
                    n2 += searchingDigit2;
                }
                if (solution) break;
            }
        }
        System.out.println("Given the equation: " + text);
        if (solution) {
            String res = String.format("%d %s %d %s %d \n", num1, text_arr[1], num2, text_arr[3], result);
            return "Result: " + res;
        }
        return "No solution";
    }
}
