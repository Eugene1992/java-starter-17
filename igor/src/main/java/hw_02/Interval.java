package hw_02;

import java.util.Scanner;

/**
 * Created by ihor on 15.01.2017.
 * Программу определяет попадает ли введенное пользователем число
 * в числовие промежутоки [0 - 14) [15 - 35) [36 - 50) [50 - 100]
 */
public class Interval {
    public static void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi. This is Interval. \nEnter your number.");
        double number = scanner.nextDouble();
        if (number < 0 | number > 100) {
            System.out.println("The number is not in the interval");
        } else if (number >= 0 & number < 15) {
            System.out.println("Interval [0 - 14)");
        } else if (number >= 15 & number < 36) {
            System.out.println("Interval [15 - 36)");
        } else if (number >= 36 & number < 50) {
            System.out.println("Interval [36 - 50)");
        } else {
            System.out.println("Interval [50 - 100]");
        }
    }
}
