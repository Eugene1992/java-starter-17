package hw_03;

/**
 * Created by ihor on 16.01.2017.
 * 1 Создайте программу, выводящую на экран
 * все четырёхзначные числа последовательности 1000 1003 1006 1009 1012 1015 ….
 * 2 Создайте программу, выводящую на экран
 * первые 55 элементов последовательности 1 3 5 7 9 11 13 15 17 ….
 * 3 Создайте программу, выводящую на экран
 * все неотрицательные элементы последовательности 90 85 80 75 70 65 60 ….
 * 4 Создайте программу, выводящую на экран
 * первые 20 элементов последовательности 2 4 8 16 32 64 128 ….
 */
public class Hw_03_t1 {
    public static void main(String[] args) {
        //task 1
        int number = 1000;
        while (number < 10000) {
            System.out.print(number + " ");
            number += 3;
        }

        //task 2
        System.out.println();
        number = 1;
        for (int i = 0; i < 55; i++) {
            System.out.print(number + " ");
            number += 2;
        }

        //task 3
        System.out.println();
        number = 90;
        while (number > 0) {
            System.out.print(number + " ");
            number -= 5;
        }

        //task 4
        System.out.println();
        number = 2;
        for (int i = 1; i < 21; i++) {
            System.out.print((int) Math.pow(number, i) + " ");
        }
    }
}
