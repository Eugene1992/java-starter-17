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
        int length = 20; // scanner.nextInt();
        int a = 1, b = 6; //максимальное чисело а масиве
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
            case 9: {
                System.out.println(CW_arr.printArr(array));
                int[][] arr = task9(array);
                System.out.println("");
                System.out.println("что     :" + CW_arr.printArr(arr[0]));
                System.out.println("сколько :" + CW_arr.printArr(arr[1]));
                break;
            }
            case 10: {
                System.out.println(CW_arr.printArr(array));
                System.out.println(CW_arr.printArr(shiftToCellArr(array, minArr(array, false), maxArr(array, false))));
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
        int spaceMax = 0, max = array[0];
        for (int i = 1; i < array.length; i++) {
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

    static int maxArr(int[] array, int start, int stop, boolean flag) {
        int spaceMax = 0, max = array[start];
        for (int i = start + 1; i < stop; i++) {
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
        int spaceMin = 0, min = array[0];
        for (int i = 1; i < array.length; i++) {
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

    public static int[] shiftToCellArr(int[] array, int space1, int space2) {
        //System.out.println("before: " + array[space1] + ", " + array[space2]);
        int temp;
        temp = array[space1];
        array[space1] = array[space2];
        array[space2] = temp;
        //System.out.print("now: " + array[space1] + ", " + array[space2]);
        //System.out.println("\ntask 10: done.");
        return array;
    }

    static int sumArr(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    static int sumArr(int[] array, int start, int stop) {
        int sum = 0;
        if (start > stop) {
            int temp = start;
            start = stop;
            stop = temp;
        }
        for (int i = start; i < stop; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static double averageArr(int[] array) {
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

    static int[] inversionArr(int[] array) {
        int[] invArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            invArray[array.length - i - 1] = array[i];
        }
        return invArray;
    }

    static int[][] task9(int[] array) {
        int count1 = 0, count2 = 0;
        int[][] arr = new int[2][array.length];
        for (int i = 0; i < array.length; i++) {
            boolean flag = false;
            for (int j = 1 + i; j < array.length; j++) {
                if ((array[i] == array[j]) && (array[j] != 0)) {
                    arr[0][count1] = array[i];
                    arr[1][count1]++;
                    array[j] = 0;
                    flag = true;
                }
            }
            if (flag) {
                count1++;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (0 < arr[1][i]) {
                count2++;
            }
        }
        arr[0] = Arrays_task_12.cloneArray(arr[0], 0, count2);
        arr[1] = Arrays_task_12.cloneArray(arr[1], 0, count2);
        return arr;
    }
}
