package ru.Seminar_4.Task_2;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        LinkedList<Integer> myLL = new LinkedList<>();
        int size = scanner.nextInt();
        System.out.println("Enter the value of elements: ");
        for (int i = 0; i < size; i++) {
            myLL.add(scanner.nextInt());
        }
        scanner.close();
        System.out.println("myLL = " + myLL);
        int summEvenNum = 0;
        for (Integer el : myLL) {
            if (el % 2 == 0) summEvenNum += el;
        }
        System.out.println("summa of even numbers = " + summEvenNum);
        myLL = solutionTask3(myLL);
        System.out.println("myLL = " + myLL);
        LinkedList<Integer> newLinkedL = solutionTask4(myLL);
        System.out.println("newLinkedL = " + newLinkedL);

    }

    /**
     * Заменяет все элементы в списке некратные трём на сумму нечётных чисел этого же списка.
     * @param linkedList
     * @return modify LinkedList.
     */
    private static LinkedList<Integer> solutionTask3 (LinkedList<Integer> linkedList){
        int sumOddNum = 0;
        for (Integer el : linkedList) {
            if (el % 2 != 0) sumOddNum += el;
        }
        int size = linkedList.size();
        for (int i = 0; i < size; i++){
            if (linkedList.get(i) % 3 != 0){
                linkedList.remove(i);   //Collections.replaceAll(linkedList, linkedList.get(i), sumOddNum);
                linkedList.add(i, sumOddNum);
            }
        }
        return linkedList;
    }

    private static LinkedList<Integer> solutionTask4 (LinkedList<Integer> linkedList){
        LinkedList<Integer> linkedListWithoutNegNum = new LinkedList<>();
        for (Integer el : linkedList) {
            if (el > 0) linkedListWithoutNegNum.addLast(el);
        }
        return linkedListWithoutNegNum;
    }
}
