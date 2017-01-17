package hw_02;

import java.util.Scanner;

/**
 * Используя IntelliJ IDEA, создайте класс Interval.
 * Напишите программу определения, попадает ли введенное пользователем число от 0 до 100 в числовой
 * промежуток [0 - 14) [15 - 35) [36 - 50) [50 - 100]. Если да, то укажите, в какой именно промежуток.
 * Если пользователь указывает число не входящее ни в один из имеющихся числовых промежутков, то
 * выводится соответствующее сообщение.
 */
public class Interval {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int temp1 = scan.nextInt();
        int temp2 = 0 <= temp1 && temp1 <= 14 ? 1 : 15 <= temp1 && temp1 <= 35 ? 2 : 36 <= temp1 && temp1 <= 50 ? 3 : 51 <= temp1 && temp1 <= 100 ? 4 : 5;

        switch (temp2) {
            case 1:
                System.out.println("Interval 1 (0-14)");
                break;
            case 2:
                System.out.println("Interval 2 (15-35)");
                break;
            case 3:
                System.out.println("Interval 3 (36-50)");
                break;
            case 4:
                System.out.println("Interval 4 (50-100)");
                break;
            case 5:
                System.out.println("Have't interval");
        }
    }
}
