package arrays;

import java.util.Scanner;

/**
 * Created by ihor on 17.01.2017.
 * 1. Вывести в консоль все парные числа одномерного массива.
 * 2. Вывести все числа одномерного массива в обратном порядке.
 * 3. Вывести первую и вторую половину одномерного массива.
 * 4. Вывести первую и вторую половину одномерного массива в обратном порядке.
 */
public class Arrays_task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter size array.");
        // random. от -100 до 100 (включительно): int a = -101, b = 202;
        // random. от 0 до 100 [0-100):
        int a = 0, b = 10;
        int size = scanner.nextInt();
        byte[] array = new byte[size];
        for (int i = 0; i < size; i++) {
            array[i] = (byte) (a + (Math.random() * b));
        }
        //task 1
        System.out.println("task 1:");
        for (int i = 0; i < size; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
        //task 2
        System.out.println("\ntask 2:");
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        //task 3-4
        boolean flag;
        int half = size / 2;
        if (size % 2 != 0) {
            System.out.println("\nМассив не делется попалам. Сделайте выбор 1 - отбросить последний елемент, 2 - первая полавина < второй, 3 -вторая половина >");
            do {
                switch (scanner.nextInt()) {
                    case 1: {
                        half = (int) (size / 2);
                        size = size - 1;
                        flag = false;
                        break;
                    }
                    case 2: {
                        half = (int) (size / 2) + 1;
                        flag = false;
                        break;
                    }
                    case 3: {
                        half = (int) (size / 2);
                        flag = false;
                        break;
                    }
                    default: {
                        flag = true;
                        System.out.println("enter your choice (1, 2 or 3).");
                        break;
                    }
                }
            } while (flag);
        }
        System.out.println("\narray:");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\ntask 3");
        for (int i = 0; i < size; i++) {
            if (i == half) {
                System.out.println();
            }
            System.out.print(array[i] + " ");
        }
        System.out.println("\ntask 4");
        for (int i = half - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = size - 1; i >= half; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
