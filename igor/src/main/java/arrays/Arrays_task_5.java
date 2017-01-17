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
        // random. от -100 до 100 (включительно): int a = -101, b = 202;
        // random. от 0 до 100 [0-100):
        int a = 0, b = 10;
        int size = scanner.nextInt();
        byte[] array = new byte[size];
        for (int i = 0; i < size; i++) {
            array[i] = (byte) (a + (Math.random() * b));
        }


    }
}
