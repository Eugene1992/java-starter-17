package hw_06;

/**
 * 9. Подсчитать одинаковые числа в одномерном массиве.
 * 10. Поменять минимальное и максимальное числа в массиве местами.
 * 11. Инвертировать массив.
 * 12. Вывести в консоль половину массива, среднеарифметическое которых является большим.
 */
public class Hw06t3 {
    public static void main(String[] args) {
        int[] array = {150, 101, 5, 100, 2, 101};
        printArray(array);
        //countCopy(array); // 9.
        // arrMax(array); // 10.
        //sort(array); // Сортировка
        //invrtorArray(array); // 11.
        moreCouple(array);


    }

    static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
    }

    static void countCopy(int[] array) {
        printArray(array);
        int[] sortArray = sort(array);
        int temp = sortArray[0];
        int count = 1;
        for (int i = 1; i < sortArray.length; i++) {
            if (sortArray[i] == temp) {
                count++;
            } else {
                if (count > 1) System.out.print(temp + " повторяется " + count + " раз. \n");
                temp = sortArray[i];
                count = 1;
            }

        }

    }

    static int[] sort(int[] array) {        // сортировка массива
        int min, minPos;
        for (int i = 0; i < array.length; i++) {
            min = array[i];
            minPos = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minPos = j;
                }
            }
            array[minPos] = array[i];
            array[i] = min;
        }
        return array;


    }

    static void arrMax(int[] temp) {
        int max = temp[0], min = temp[1];

        for (int j = 0; j < temp.length; j++) {
            if (min > temp[j]) {
                min = temp[j];
            }
            if (max < temp[j]) {
                max = temp[j];
            }
        }
        System.out.println(max);
        System.out.println(min);
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] == min) temp[i] = max;
            else if (temp[i] == max) temp[i] = min;
        }
        printArray(temp);
    }

    static void invrtorArray(int[] array) {
        int longArray = array.length / 2;
        int temp1 = array.length - 1;
        for (int i = 0; i < longArray; i++, temp1--) {
            int tmp = array[i];      // С использованием 3-й переменной
            array[i] = array[temp1];
            array[temp1] = tmp;

            /*array[i]=array[i]+array[temp1]; // Без использования 3-й переменной
            array[temp1]=array[i]-array[temp1];
            array[i]=array[i]-array[temp1];*/

        }
        printArray(array);
    }

    // Вывести в консоль половину массива, среднеарифметическое которых является большим.

    static void moreCouple(int[] array) {
        int longArray = array.length - array.length / 2;
        int temp1 = array.length - 1;
        int temp2 = 0, temp3 = 0, start = 0;
        for (int i = 0; i < longArray; i++, temp1--) {
            temp2 += array[i];
            if (i != temp1) temp3 += array[temp1];
        }
        temp2 = temp2 / longArray;
        temp3 = temp3 / (array.length / 2);
        if (temp2 > temp3) {
            System.out.println("Первая часть больше = " + temp2);

        } else {
        longArray = array.length;
        if (temp3 > temp2) {
            start = array.length / 2;
            System.out.println("Вторая часть больше = " + temp3);
        } else System.out.println(temp2 + " = " + temp3);}

        for (int i = start; i < longArray; i++) {
            System.out.print(array[i] + " ");

        }
    }


}
