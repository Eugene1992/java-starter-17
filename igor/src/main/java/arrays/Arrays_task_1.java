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
        int length = scanner.nextInt();
        int[] array = new int[length];
        array = CW_arr.randArr(length, 10);
        System.out.println("Select the job task 1, task 2, task 3, task 4 (1, 2, 3 or 4)");
        switch (scanner.nextInt()) {
            case 1: {
                twonessArr(array);
                break;
            }
            case 2: {
                inversionArr(array);
                break;
            }
            case 3: {
                printHalfArr(array);
                break;
            }
            case 4: {
                printInvHalfArr(array);
                break;
            }
        }
    }

    static void printArr(int[] array) {
        System.out.println("Array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    static void twonessArr(int[] array) {
        System.out.println("task 1:");
        //printArr(array);
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
    }

    static void inversionArr(int[] array) {
        System.out.println("\ntask 2:");
        //printArr(array);
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }

    static void printHalfArr(int[] array) {
        int half = choise(array.length);
        //printArr(array);
        System.out.println("\ntask 3");
        for (int i = 0; i < array.length; i++) {
            if (i == half) {
                System.out.println();
            }
            System.out.print(array[i] + " ");
        }
    }

    static void printInvHalfArr(int[] array) {
        int half = choise(array.length);
        //printArr(array);
        System.out.println("\ntask 4");
        for (int i = half - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = array.length - 1; i >= half; i--) {
            System.out.print(array[i] + " ");
        }
    }

    static int choise(int size) {
        Scanner scanner = new Scanner(System.in);
        boolean flag;
        int half = size / 2;
        if (size % 2 != 0) {
            System.out.println("\nМассив не делется попалам. Сделайте выбор 1 - первая полавина < второй, 2 -вторая половина >");
            do {
                switch (scanner.nextInt()) {
                    case 1: {
                        half = (int) (size / 2) + 1;
                        flag = false;
                        break;
                    }
                    case 2: {
                        half = (int) (size / 2);
                        flag = false;
                        break;
                    }
                    default: {
                        flag = true;
                        System.out.println("enter your choice (1 or 2).");
                        break;
                    }
                }
            } while (flag);
        }
        return half;
    }
}
