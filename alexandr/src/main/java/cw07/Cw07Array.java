package cw07;

import java.util.Scanner;

/**
 * 1. Написать метод который принимает масив и выводит его сумму
 * 2. Метод подсчета максимального и минимального числа в массиве.
 */
public class Cw07Array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int array[] = {
                scan.nextInt(),
                scan.nextInt(),
                scan.nextInt(),
                scan.nextInt()};
        //System.out.println(arr(array));
        // arr(array);          // 1. Написать метод который принимает масив и выводит его сумму
        System.out.println("Max digit = " + arrMax(array)[0] + " Min digital = " + arrMax(array)[1]); // 2. Метод подсчета максимального и минимального числа в массиве.
    }

    static void arr(int[] temp) {

        System.out.print("[");
        for (int i = 0; i < temp.length; i++) {
            if (i == temp.length - 1) System.out.print(temp[i]);
            else System.out.print(temp[i] + ", ");
        }
        System.out.print("]");
    }

    // todo : Найти максимальное и минимальное число в массиве. !!!!!
    static int[] arrMax(int[] temp) {
        int max = temp[0], min = temp[1];

        for (int j = 0; j < temp.length; j++) {
            if (min > temp[j]) {
                min = temp[j];
            }
            if (max < temp[j]) {
                max = temp[j];
            }
        }
        int[] maxMin = new int[2];
        maxMin[0] = max;
        maxMin[1] = min;
        return maxMin;
    }
}
