package com.company;

import java.util.*;

public class Main {

    private static Scanner in;

    public static void main(String[] args) {

        Random rnd = new Random(System.currentTimeMillis());
        List<Integer> list = new ArrayList<Integer>();
        in = new Scanner(System.in);
        int number;

        System.out.println("Введите длину массива");
        testingInput();
        int lengthsArr = in.nextInt();

        for (int i = 0; i <= lengthsArr - 1; i++){
            // Заполнение
            number = 10 + rnd.nextInt(99 - 10 + 1);
            list.add(number);
        }

        for (int i = 0; i <= lengthsArr - 1; i++){
            // Вывод
            System.out.print(list.get(i) + " ");
        }

        list.sort(Comparator.comparing(Object::toString));

        System.out.println("Min: " +  list.get(0) + " Max: " + list.get(lengthsArr - 1));
    }

    private static void testingInput() {
        while(!in.hasNextLong()) {
            System.out.println("Ошибка ввода, надо вводить числа");
            in.next();
        }
    }

}
