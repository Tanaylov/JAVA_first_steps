import java.util.Scanner;

public class second_part {
    public static void main(String[] args) {
    Scanner inputScanner = new Scanner(System.in);
    boolean isInt = inputScanner.hasNextInt();
    System.out.println(isInt);
    int num = inputScanner.nextInt();
    System.out.println(num);
    inputScanner.close();
    int a = 1, b = 2, c = 455;
    String text = String.format("%d, %d and %d \n", a, b, c);
    System.out.println(text);
    System.out.printf("%d or %d and %d \n", a, b, c);
    int a1 = 1, b1 = 2;
    int min = a1 > b1 ? b1 : a1; // тернарный оператор - возвращает в любом случае.   
    System.out.println(min);

    }
}
