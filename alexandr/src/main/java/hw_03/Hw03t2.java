package hw_03;

/**
 * Выведите на экран первые 20 членов последовательности Фибоначчи.
 */
public class Hw03t2 {
    public static void main(String[] args) {
        for (int temp1 = 1, temp2 = 0, temp3, i = 1; i < 21; i++) {
            temp3 = temp1 + temp2;
            System.out.println(i + ". " + temp3);
            temp1 = temp2;
            temp2 = temp3;
        }
    }
}
