package arrays;

import java.util.Scanner;

/**
 * Created by ihor on 17.01.2017.
 * 12. Вывести в консоль половину массива, среднеарифметическое которых является большим.
 * 13. Найти сумму отрицательных чисел в одномерном массиве.
 * 14. Дан массив чисел, среди которых имеется один ноль. Вывести на печать все числа до нуля включительно.
 * 15. Написать программу, меняющую местами два наибольших элемента одномерного массива с первым и последним.
 * 16. Написать программу, которая выводит на экран элементы одномерного массива, которые расположены до минимального элемента всего массива.
 * 17. Найти сумму всех чисел находящихся между минимальным и максимальным числом в массиве.
 * 18. Вывести в консоль половину массива в которой находиться наименьшее число массива.
 * 19. Написать программу, которая перемещает в конец массива все элементы, значения которых находится в отрезке [a,b].
 */
public class Arrays_task_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter size array.");
        // random. от -100 до 100 (включительно): int a = -101, b = 202;
        // random. от 0 до 100 [0-100):
        int a = 0, b = 10;
        int size = scanner.nextInt();
        if (size % 2 != 0) {
            size += 1;
        }
        byte[] array = new byte[size];
        for (int i = 0; i < size; i++) {
            array[i] = (byte) (a + (Math.random() * b));
        }
    }
}