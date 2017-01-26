package hw_06;

/**
 * 13. Найти сумму отрицательных чисел в одномерном массиве.
 * 14. Дан массив чисел, среди которых имеется один ноль. Вывести на печать все числа до нуля включительно.
 * 15. Написать программу, меняющую местами два наибольших элемента одномерного массива с первым и последним.
 * 16. Написать программу, которая выводит на экран элементы одномерного массива, которые расположены
 * до минимального элемента всего массива.
 */
public class Hw06t4 {
    public static void main(String[] args) {
        int[] array = {150, 101, 200, 3500, -2, -101};
        printArray(array);
        // sumNegativeDigitsInArray(array);  // 13.
        //prinAllToZirro(array);      // 14.
        changePlace(array); // 15.
        //printAllToMinDigit(array);  // 16.

    }

    static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
    }

    static void sumNegativeDigitsInArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                sum += array[i];
            }
        }
        System.out.println("Сумма отрицательных значений в массиве = " + sum);
    }

    static void prinAllToZirro(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                System.out.println(array[i] + " ");
                break;
            }
            System.out.print(array[i] + " ");
        }
    }

    static void printAllToMinDigit(int[] array) {
        int min = array[0];
        int minPos = 0;
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
                minPos = i;
            }
        }
        for (int i = 0; i < minPos; i++) {
            System.out.print(array[i] + " ");
        }
    }

    static void changePlace(int[] array) {
        int max = array[0], maxPos = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[j] > max) {
                    max = array[j];
                    maxPos = j;
                }
            }
            if (i == 0) {
                array[maxPos] = array[i];
                array[i] = max;
            } else {
                array[maxPos] = array[array.length - 1];
                array[array.length - 1] = max;
            }
            max = array[array.length - 1];
            maxPos = array.length - 1;
        }
        printArray(array);
    }
}
