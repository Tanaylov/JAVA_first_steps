package ru.Seminar_4.Task_1;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        for (int i = 0; i < size; i++) {
            numbers.add(scanner.nextInt());
        }
        scanner.close();
        System.out.println("numbers.peek() = " + numbers.peek());
        System.out.println("numbers = " + numbers);
        System.out.println("numbers.pop() = " + numbers.pop());
        System.out.println("numbers = " + numbers);
        numbers.addFirst(7);
        numbers.addLast(999);
        System.out.println("numbers = " + numbers);
        numbers.add(numbers.size() / 2, 457);
        System.out.println("numbers = " + numbers);
        numbers.remove(2); // delete by index;
        numbers.remove((Integer) 89); // delete by value;
        System.out.println("numbers = " + numbers);
        System.out.println("numbers.indexOf(7) = " + numbers.indexOf(7));
        System.out.println("numbers.contains(7) = " + numbers.contains(7));
        int index = 0;
        int numbersSize = numbers.size();
        while (index < numbersSize){
            if (numbers.contains(7)){
                //int del = numbers.indexOf(7);
                numbers.remove((Integer) 7);
                //numbersSize--;
            }else break;
            //index++;
        }
        System.out.println("numbers = " + numbers);
        int pop = numbers.pop();
        System.out.println("pop = " + pop);
        int poll = numbers.poll(); // тоже что и "рор", только при пустом списки возвращает значение 'null', а рор - Exception
        System.out.println("poll = " + poll);
        System.out.println("numbers = " + numbers);
        LinkedList<Integer> reverseNumbers = new LinkedList<>();
        while (numbers.size() != 0){
            int popEl = numbers.poll();
            reverseNumbers.addFirst(popEl);
        }
        System.out.println("reverseNumbers = " + reverseNumbers);
    }
}
