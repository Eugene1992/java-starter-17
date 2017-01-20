package hw_02;

import java.util.Scanner;

/**
 * Created by ihor on 20.01.2017.
 * method HW 2
 */
public class HW_02_Method {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("select task:");
            String[] strTask = {
                    "1 - t2 Проверяет и сообщает на экран, является ли введенное с консоли целое число, чётным либо нечётным.",
                    "2 - t3 Программа, выводящую на экран ближайшее к 10 из двух чисел, введенных с консоли.",
                    "3 - t4 Опредиление максимальным значением одной из трох переменных (значения всех переменных разные).",
                    "4 - t5 Вывод на экран вторую по величине переменную из 4 (значения всех переменных разные).",
                    "5 - t6 Программа находить и выводить на экран вещественные корни квадратного уравнения ax²+bx+c=0.",
                    "6 - t7 Calculator",
                    "7 - t8 Interval",
                    "0 - exit, coming soon"};
            for (int i = 0; i < 7; i++) {
                System.out.println(strTask[i]);
            }
            int selTask = scanner.nextInt();
            if (0 <= selTask & selTask <= 7) {
                flag = false;
            }
            switch (selTask) {
                case 0: {
                    System.out.println("exit, coming soon)");
                    break;
                }
                case 1: {
                    System.out.println("Enter number");
                    int number = scanner.nextInt();
                    if (task2(number))
                        System.out.println(number + ", an even");
                    else
                        System.out.println(number + ", do not even");
                    break;
                }
                case 2: {
                    System.out.println("Enter the number 1");
                    int number1 = scanner.nextInt();
                    System.out.println("Enter the number 2");
                    int number2 = scanner.nextInt();
                    if (task3(number1, number2))
                        System.out.println(number1 + " ближе к 10");
                    else
                        System.out.println(number2 + " ближе к 10");
                    break;
                }
                case 3: {
                    System.out.println("Enter you number1, number2, number3");
                    int max = maxOfThree(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
                    System.out.println(max + " maxi");
                    break;
                }
                case 4: {
                    System.out.println("Enter 4 variables.");
                    int number = max2Of4(scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
                    System.out.println("max2: " + number);
                    break;
                }
                case 5: {
                    System.out.println("ax^2+bx+c=0");
                    System.out.println("Enter a, b, c");
                    outResult(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());
                    break;
                }
                case 6: {
                    Calculator.start();
                    break;
                }
                case 7: {
                    Interval.start();
                    break;
                }
                default: {
                    flag = true;
                }
            }
        } while (flag);

    }

    static boolean task2(int number) {
        boolean flag;
        if (number % 2 == 0)
            flag = true;
        else
            flag = false;
        return flag;
    }

    static boolean task3(int number1, int number2) {
        final int TEN = 10;
        boolean flag = true;
        if (Math.abs(TEN - number1) == Math.abs(TEN - number2)) {
            System.out.println(number1 + " и " + number2 + " одинаково наближени к 10");
        } else {
            if (Math.abs(TEN - number1) < Math.abs(TEN - number2)) {
                flag = true;
            } else {
                flag = false;
            }
        }
        return flag;
    }

    static int maxOfThree(int temp1, int temp2, int temp3) {
        int max = temp3;
        if (temp1 > temp2 & temp1 > temp3) {
            max = temp1;
        } else if (temp2 > temp3) {
            max = temp2;
        }
        return max;
    }

    static int max2Of4(int temp1, int temp2, int temp3, int temp4) {
        int temp0, max2;
        if (temp1 < temp2) {
            temp0 = temp2;
            temp2 = temp1;
            temp1 = temp0;
        }
        if (temp1 < temp3) {
            temp0 = temp3;
            temp3 = temp1;
            temp1 = temp0;
        }
        if (temp1 < temp4) {
            temp0 = temp4;
            temp4 = temp1;
            temp1 = temp0;
        }
        return max2 = maxOfThree(temp2, temp3, temp4);
    }

    static void outResult(double a, double b, double c) {
        double x1, x2, D = Math.pow(b, 2) - 4 * a * c;
        if (a == 0) System.out.println("a == 0, linear equation");
        if (D < 0) {
            System.out.println("Discriminant < 0, ");
        } else {
            D = Math.sqrt(D);
            x1 = (-b + D) / (2 * a);
            x2 = (-b - D) / (2 * a);
            if (D > 0) {
                System.out.println("x1=" + x1 + " x2=" + x2);
            } else {
                System.out.println("x1=x2=" + x1);
            }
        }
    }
}
