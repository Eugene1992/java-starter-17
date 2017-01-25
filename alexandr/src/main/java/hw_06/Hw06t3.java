package hw_06;

/**
 * 9. Подсчитать одинаковые числа в одномерном массиве.
 * 10. Поменять минимальное и максимальное числа в массиве местами.
 * 11. Инвертировать массив.
 * 12. Вывести в консоль половину массива, среднеарифметическое которых является большим.
 */
public class Hw06t3 {
    public static void main(String[] args) {
        int[] array = {25, 45, 2, 9, 8, 100, 101, 2, 45};
        printArray(array);
        //System.out.println("Одинаковых значений в массиве " + countCopy(array) + " шт."); // 1.
        arrMax(array);
    }

    static void printArray (int [] array) {
        for (int i = 0; i <array.length ; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
    }

    static int countCopy(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length / 2; i++) {
            for (int j = 0; j < array.length; j++) {
                if ((array[i] == array[j]) && i != j) count++;
            }
        }
        return count;
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
        for (int i = 0; i <temp.length ; i++) {
            if (temp[i] == min) temp[i]=max;
            else if (temp[i] == max) temp[i] = max;
        }
        printArray(temp);
    }



}
