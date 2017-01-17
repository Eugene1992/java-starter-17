package arrays;

import java.util.Scanner;

/**
 * Created by ihor on 17.01.2017.
 * 5. Найти сумму всех элементов в массиве.
 * 6. Найти среднеарифметическое всех чисел массива.
 * 7. Найти минимальное и максимальное число в массиве.
 * 8. Заменить все отрицательные числа в массиве на 0.
 * 9. Подсчитать одинаковые числа в одномерном массиве.
 * 10. Поменять минимальное и максимальное числа в массиве местами.
 * 11. Инвертировать массив.
 */
public class Arrays_task_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter size array.");
        // random. от -99 до 99 (включительно):
        int a = -100, b = 200;
        // random. от 0 до 100 [0-100): int a = 0, b = 10;
        int size = scanner.nextInt();
        byte[] array = new byte[size];
        for (int i = 0; i < size; i++) {
            array[i] = (byte) (a + (Math.random() * b));
        }

        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += array[i];
        }
        System.out.print("\ntask 5: sum= " + sum);
        double mediumArrSum = 0;
        for (int i = 0; i < size; i++) {
            mediumArrSum += array[i];
        }
        System.out.print("\ntask 6: mediumArrSum= " + mediumArrSum / size);
        int min = 0, spaceMin = 0, max = 0, spaceMax = 0;
        for (int i = 0; i < size; i++) {
            if (min > array[i]) {
                min = array[i];
                spaceMin = i;
            }
            if (max < array[i]) {
                max = array[i];
                spaceMax = i;
            }
        }
        System.out.print("\ntask 7: max=" + max + ", min=" + min);
        System.out.println("\ntask 8:");
        for (int i = 0; i < size; i++) {
            if (array[i] < 0) {
                //System.out.print(array[i] + " ");
                array[i] = (byte) (~array[i] + 1);
                //System.out.print(array[i] + "\t");
            }
        }
        System.out.println("done.");
        // todo task 9
        System.out.println("\ntask 9: NOT done.");

        // x = x^y; // x == 2
        // y = x^y; // y == 5
        // x = x^y; // x == 7
        System.out.println("before: " + array[spaceMin]+ ", " + array[spaceMax]);
        array[spaceMin] = (byte) (array[spaceMin] ^ array[spaceMax]);
        array[spaceMax] = (byte) (array[spaceMin] ^ array[spaceMax]);
        array[spaceMin] = (byte) (array[spaceMin] ^ array[spaceMax]);
        System.out.print("now: " + array[spaceMin] + ", " + array[spaceMax]);
        System.out.println("\ntask 10: done.");

        for (int i = 0; i < size; i++) {
            array[i] = (byte) (~array[i] + 1);
            //System.out.print(array[i] + " ");
        }
        System.out.println("\ntask 11: done.");
    }
}
