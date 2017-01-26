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
        //System.out.println("enter size array.");
        int length = 20; // scanner.nextInt();
        int a = 0, b = 10; //максимальное чисело а масиве
        int[] array = new int[length];
        array = CW_arr.randArr(array.length, a, b);
        //System.out.println(CW_arr.printArr(array));
        System.out.println("Select the job task 12, task 13, task 14, task 15, task 16, task 17, task 18, task 19 \n(12, 13, 14, 15, 16, 17, 18 or 19)");
        int sumNeg, sumInt;
        switch (scanner.nextInt()) {
            case 12: {
                halfMaxArr(array);
                break;
            }
            case 13: {
                sumNeg = sumNegArr(array);
                System.out.println(sumNeg);
                break;
            }
            case 14: {
                System.out.println(CW_arr.printArr(array));
                printArrToZero(array);
                break;
            }
            case 15: {
                //System.out.println(CW_arr.printArr(array));
                array = task15(array);
                System.out.println(CW_arr.printArr(array));
                break;
            }
            case 16: {
                //System.out.println(CW_arr.printArr(array));
                System.out.println(CW_arr.printArr(cloneArray(array, 0, Arrays_task_5.minArr(array, false))));
                break;
            }
            case 17: {
                //System.out.println(CW_arr.printArr(array));
                int spaceStart = Arrays_task_5.maxArr(array, false);
                int spaceSpot = Arrays_task_5.minArr(array, false);
                if (spaceStart > spaceSpot) {
                    spaceSpot++;
                } else {
                    spaceStart++;
                }
                sumInt = Arrays_task_5.sumArr(array, spaceSpot, spaceStart);
                System.out.println(sumInt);
                break;
            }
            case 18: {
                //System.out.println(CW_arr.printArr(array));
                if (array.length / 2 > Arrays_task_5.minArr(array, false)) {
                    System.out.println(CW_arr.printArr(cloneArray(array, 0, array.length / 2)));
                } else {
                    System.out.println(CW_arr.printArr(cloneArray(array, array.length / 2, array.length)));
                }
                break;
            }
            case 19: {
                System.out.println(CW_arr.printArr(array));
                System.out.println(CW_arr.printArr(task19(array)));
                break;
            }
        }
    }

    static void halfMaxArr(int[] array) {
        int[] firstArr = cloneArray(array, 0, array.length / 2);
        int[] secondArr = cloneArray(array, array.length / 2, array.length);
        if (Arrays_task_5.averageArr(firstArr) > Arrays_task_5.averageArr(secondArr)) {
            System.out.println(CW_arr.printArr(firstArr));
        } else {
            System.out.println(CW_arr.printArr(secondArr));
        }
    }

    static int[] cloneArray(int[] array, int start, int stop) {
        int[] cloneArr = new int[stop - start];
        for (int i = 0; i < cloneArr.length; i++) {
            cloneArr[i] = array[start + i];
        }
        return cloneArr;
    }

    static int sumNegArr(int[] array) {
        int sum;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                array[i] = 0;
            }
        }
        sum = Arrays_task_5.sumArr(array);
        return sum;
    }

    static void printArrToZero(int[] array) {
        System.out.println("Array:");
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                System.out.print(array[i] + ", ");
            } else break;
        }
    }

    static int[] task15(int[] array) {
        array = maxToStartArr(array, 2);
        return array;
    }

    static int[] maxToStartArr(int[] array, int counter) {
        for (int i = 0; i < counter; i++) {
            array = Arrays_task_5.shiftToCellArr(array, i, Arrays_task_5.maxArr(array, i, array.length, false));
        }
        return array;
    }

    static int[] task19(int[] array) {
        int a = 3, b = 5;
        int[] arrSpace = arrSpaceNumInt(array, a, b);
        if (arrSpace[arrSpace.length - 1] != 0) {
            int[] arrNumber = arrNumInt(array, a, b, arrSpace[arrSpace.length - 1]);
            int[] arrMinusNumber = arrMinNumb(array, a, b, array.length - arrSpace[arrSpace.length - 1]);
            array = addTwoArr(arrMinusNumber, arrNumber);
        }
        return array;
    }

    static int[] arrSpaceNumInt(int[] array, int a, int b) {
        int[] arrSpace = new int[array.length + 1];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (a <= array[i] && array[i] <= b) {
                arrSpace[count] = i;
                count++;
            }
        }

        arrSpace[arrSpace.length - 1] = count;

        return arrSpace;
    }

    static int[] arrNumInt(int[] array, int a, int b, int length) {
        int[] arr = new int[length];
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (a <= array[i] && array[i] <= b) {
                arr[counter] = array[i];
                counter++;
            }
        }
        return arr;
    }

    static int[] arrMinNumb(int[] array, int a, int b, int length) {
        int[] arr = new int[length];
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (a > array[i] || array[i] > b) {
                arr[counter] = array[i];
                counter++;
            }
        }
        return arr;
    }

    static int[] addTwoArr(int[] arr1, int[] arr2) {
        int[] arr = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            arr[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr[arr1.length + i] = arr2[i];
        }
        return arr;
    }
}
