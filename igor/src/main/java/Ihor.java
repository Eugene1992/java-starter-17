import java.io.IOException;

/*TODO 1.1
1 Создать четыре целочисленные переменные типов byte, short, int, long.
2 Инициализировать переменную типа byte результатом суммы двух любых чисел.
3 Инициализировать переменную типа short результатом вычитания двух любых чисел.
4 Инициализировать переменную типа int результатом деления двух любых чисел.
5 Инициализировать переменную типа long результатом умножения двух любых чисел.
6 Передать переменной типа byte результат суммы двух переменных типа byte.
7 Передать переменной типа byte результат суммы двух переменных типа short, деленных на третью переменную типа byte.
8 Переменной типа int передать результат деления двух short, умноженных на результат деления двух byte.
9 Поменять значения двух целочисленных переменных используя третью.
10 Поменять значения двух переменных без использования третей.
 */
import java.util.Scanner;

public class Ihor {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //task 1-5
        byte tempByte = 5 + 7;
        short tempShort = 5 - 10;
        int tempInt = 13 / 7;
        long tempLong = 2 * 3;
        System.out.println(tempByte + " " + tempShort + " " + tempInt + " " + tempLong);
        //task 6
        byte task6_0, task6_1 = 125, task6_2 = 10;
        task6_0 = (byte) (task6_1 + task6_2);
        System.out.println(task6_0);
        //task 7
        byte task7_0, task7_1 = 7;
        short task7_2 = 10, task7_3 = 5;
        task7_0 = (byte) ((task7_2 + task7_3) / task7_1);
        System.out.println(task7_0);
        //task 8
        int task8 = (task7_2 * task7_3) / (task7_0 * task7_1);
        System.out.println(task8);
        //task9
        byte a = 2, b = 3, c;
        c = a;
        a = b;
        b = c;
        System.out.println("task9: " + a + " " + b);
        //task10
        byte a1 = 2, b1 = 3;
        a1 = (byte) (a1 + b1);
        b1 = (byte) (a1 - b1);
        a1 = (byte) (a1 - b1);
        System.out.println("task10: " + a1 + " " + b1);


    }
}