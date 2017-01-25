package hw_06;

/**
 * 5. Найти сумму всех элементов в массиве.
 * 6. Найти среднеарифметическое всех чисел массива.
 * 7. Найти минимальное и максимальное число в массиве.
 * 8. Заменить все отрицательные числа в массиве на 0.
 */
public class Hw06t2 {
    public static void main(String[] args) {
        int[] array = {25, 45, 2, 9, 8, 100, 101};

        //System.out.println(sum(array));  // 5.
        //System.out.println((double)(sum(array))/array.length);  // 6.
        //System.out.println("Max digit = " + arrMax(array)[0] + " Min digital = " + arrMax(array)[1]); // 7.
        notMinnus(array); // 8.

    }

    static int sum(int[] temp) {
        int sum = 0;
        for (int i = 0; i < temp.length; i++) {
            sum += temp[i];
        }
        return sum;
    }

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

    static void notMinnus(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) array[i] = 0;
            System.out.print(array[i] + " ");

        }

    }
}
