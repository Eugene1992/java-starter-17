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

        //TODO 1.2
        /*11 Дано число от 0 до 127 в десятичной системе исчисления.
        Написать программу, которая переводит данное число в двоичную систему исчисления и выводит в консоль.
        Запрещается использовать циклы (for, while и т.д.) или условные операторы (if/esle/?:)
        */
        System.out.println();
        System.out.println("task 11:");
        int tempUserNumber;
        System.out.println("Enter the number. ");

        //не понятный участок кода
        Scanner scanner = new Scanner(System.in);
        byte userNumber = scanner.nextByte();
        System.out.println("The number is: " + userNumber);
        //но работает

        byte answer7, answer6, answer5, answer4, answer3, answer2, answer1, answer0;
        answer7 = (byte) (userNumber / Math.pow(2, 7));
        tempUserNumber = (byte) (userNumber - answer7 * Math.pow(2, 7));
        answer6 = (byte) (tempUserNumber / Math.pow(2, 6));
        tempUserNumber = (byte) (tempUserNumber - answer6 * Math.pow(2, 6));
        answer5 = (byte) (tempUserNumber / Math.pow(2, 5));
        tempUserNumber = (byte) (tempUserNumber - answer5 * Math.pow(2, 5));
        answer4 = (byte) (tempUserNumber / Math.pow(2, 4));
        tempUserNumber = (byte) (tempUserNumber - answer4 * Math.pow(2, 4));
        answer3 = (byte) (tempUserNumber / Math.pow(2, 3));
        tempUserNumber = (byte) (tempUserNumber - answer3 * Math.pow(2, 3));
        answer2 = (byte) (tempUserNumber / Math.pow(2, 2));
        tempUserNumber = (byte) (tempUserNumber - answer2 * Math.pow(2, 2));
        answer1 = (byte) (tempUserNumber / Math.pow(2, 1));
        answer0 = (byte) (userNumber % 2);
        System.out.println();
        System.out.println("answer: " + answer7 + answer6 + answer5 + answer4 + " " + answer3 + answer2 + answer1 + answer0);

        System.out.print("answer 2, using for: ");
        byte tempAnswer;
        for (int i = 7; i >= 0; i--) {
            tempAnswer = (byte) (userNumber / Math.pow(2, i));
            System.out.print(tempAnswer);
            userNumber = (byte) (userNumber - tempAnswer * Math.pow(2, i));
            if (i == 4) {
                System.out.print(" ");
            }
        }
    }
}