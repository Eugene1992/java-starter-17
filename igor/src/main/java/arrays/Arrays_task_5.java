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
        //System.out.println("enter size array.");
        int length = 10; // scanner.nextInt();
        int a = -10, b = 20; //максимальное чисело а масиве
        int[] array = new int[length];
        array = CW_arr.randArr(array.length, a, b);
        //System.out.println(CW_arr.printArr(array));
        System.out.println("Select the job task 5, task 6, task 7, task 8, task 9, task 10, task 11 (5, 6, 7, 8, 9, 10 or 11)");
        int sum;
        double average;
        switch (scanner.nextInt()) {
            case 5: {
                sum = sumArr(array);
                System.out.println(sum);
                break;
            }
            case 6: {
                average = averageArr(array);
                System.out.println(average);
                break;
            }
            case 7: {
                System.out.println("max" + maxArr(array, true) + ", min" + minArr(array, true));
                break;
            }
            case 8: {
                System.out.println(CW_arr.printArr(noNegNumbArr(array)));
                break;
            }
            case 9: { //todo: task 9
                break;
            }
            case 10: {
                System.out.println(array = shiftMaxArr(array));
                break;
            }
            case 11: {
                System.out.println(CW_arr.printArr(array));
                int[] invArray = inversionArr(array);
                System.out.println(CW_arr.printArr(invArray));
                break;
            }
        }
    }

    static int maxArr(int[] array, boolean flag) {
        int spaceMax = 0, max = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
                spaceMax = i;
            }
        }
        if (flag) {
            return max;
        } else {
            return spaceMax;
        }
    }

    /**
     * @param array
     * @param flag  если true возвтар значения, иначе места в масиве
     * @return
     */
    static int minArr(int[] array, boolean flag) {
        int spaceMin = 0, min = 0;
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
                spaceMin = i;
            }
        }
        if (flag) {
            return min;
        } else {
            return spaceMin;
        }
    }

    static int[] shiftMaxArr(int[] array) {
        int spaceMin = minArr(array, false);
        int spaceMax = maxArr(array, false);
        System.out.println("before: " + array[spaceMin] + ", " + array[spaceMax]);
        array[spaceMin] = (byte) (array[spaceMin] ^ array[spaceMax]);
        array[spaceMax] = (byte) (array[spaceMin] ^ array[spaceMax]);
        array[spaceMin] = (byte) (array[spaceMin] ^ array[spaceMax]);
        System.out.print("now: " + array[spaceMin] + ", " + array[spaceMax]);
        System.out.println("\ntask 10: done.");
        return array;
    }

    static int sumArr(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    static double averageArr(int[] array) {
        array = noNegNumbArr(array);
        double average = 0;
        for (int i = 0; i < array.length; i++) {
            average += array[i];
        }
        return average / array.length;
    }

    static int[] noNegNumbArr(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                //System.out.print(array[i] + " ");
                array[i] = (byte) (~array[i] + 1);
                //System.out.print(array[i] + "\t");
            }
        }
        return array;
    }

    static int[] inversionArr (int[] array){
        int[] invArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            invArray[array.length-i-1] = array[i];
        }
        return invArray;
    }
}
