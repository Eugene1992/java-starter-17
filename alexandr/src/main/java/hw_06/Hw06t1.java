package hw_06;

/**
 * 1. Вывести в консоль все парные числа одномерного массива.
 * 2. Вывести все числа одномерного массива в обратном порядке.
 * 3. Вывести первую и вторую половину одномерного массива.
 * 4. Вывести первую и вторую половину одномерного массива в обратном порядке.
 */
public class Hw06t1 {
    public static void main(String[] args) {
        int[] array = {25, 45, 2, 9, 8, 100, 101};
        //couple(array); //1.
        //backArray(array); // 2.
        //firstSecondCouple(array); // 3.
        //reversCouple(array); // 4.
    }

    static void couple(int[] temp) {
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] > 9) System.out.println(temp[i]);
        }
    }

    static void backArray(int[] temp) {
        for (int i = temp.length - 1; i >= 0; i--) {
            System.out.println(temp[i]);
        }
    }

    static void firstSecondCouple(int[] temp) {
        int number = temp.length / 2;
        for (int i = 0; i < number; i++) {
            System.out.print(temp[i] + " ");
        }
        System.out.println("");
        for (int i = number; i < temp.length; i++) {
            System.out.print(temp[i] + " ");
        }
    }

    static void reversCouple(int[] temp) {
        int number = temp.length / 2;

        for (int i = number - 1; i >= 0; i--) {
            System.out.print(temp[i] + " ");
        }
        System.out.println("");
        for (int i = temp.length - 1; i >= number; i--) {
            System.out.print(temp[i] + " ");
        }
    }
}
