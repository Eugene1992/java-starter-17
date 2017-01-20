package hw_03;

import sun.applet.Main;

import java.util.Scanner;

/**
 * Created by ihor on 20.01.2017.
 * HM refactoring to method
 */
public class HW_03_Method {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("select task:");
            String[] strTask = {
                    "1 - t1 sequence (review HW)",
                    "2 - t2 Fibonacci.",
                    "3 - t3 scaleNumber",
                    "4 - t4 Factorial",
                    "5 - t5 Выведите на экран все положительные делители натурального числа, введенного пользователем.",
                    "0 - exit, coming soon"};
            for (int i = 0; i < 6; i++) {
                System.out.println(strTask[i]);
            }
            int selTask = scanner.nextInt();
            if (0 <= selTask & selTask <= 5) {
                flag = false;
            }
            switch (selTask) {
                case 0: {
                    System.out.println("exit, coming soon)");
                    break;
                }
                case 1: {
                    System.out.println("review HW");
                    sequence();
                    break;
                }
                case 2: {
                    System.out.println("Enter quantity number fibonacci");
                    outFibonacci(scanner.nextInt());
                    break;
                }
                case 3: {
                    System.out.println("Enter number and number system. (2, 8 or 16)");
                    String str = scaleNumber(scanner.nextInt(), scanner.nextInt());
                    System.out.println(str);
                    break;
                }
                case 4: {
                    System.out.println("Enter counter");
                    int number = factorial(scanner.nextInt());
                    System.out.println(number);
                    break;
                }
                case 5: {
                    System.out.println("enter number");
                    outDevNatural(scanner.nextInt());
                    break;
                }
                default: {
                    flag = true;
                }
            }
        } while (flag);
    }

    static void sequence() {
        Hw_03_t1.review();
    }

    static void outFibonacci(int counter) {
        int fibonacciN0 = 1, fibonacciN1 = 1, fibonacciN2;
        System.out.print(fibonacciN0 + " " + fibonacciN1 + " ");
        for (int i = 0; i < counter - 2; i++) {
            fibonacciN2 = fibonacciN1 + fibonacciN0;
            System.out.print(fibonacciN2 + " ");
            fibonacciN0 = fibonacciN1;
            fibonacciN1 = fibonacciN2;
        }
    }

    static void outDevNatural(int number) {
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }
    }

    static int factorial(int counter) {
        int factorial = 1;
        for (int i = 1; i < counter + 1; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }

    static String scaleNumber(int number, int numberSystem) {
        int flag = 0;
        String str = "";
        if (number > 0) {
            while (number > 0) {
                switch (number % numberSystem) {
                    case 10: {
                        str += "A";
                        break;
                    }
                    case 11: {
                        str += "B";
                        break;
                    }
                    case 12: {
                        str += "C";
                        break;
                    }
                    case 13: {
                        str += "D";
                        break;
                    }
                    case 14: {
                        str += "E";
                        break;
                    }
                    case 15: {
                        str += "F";
                        break;
                    }
                    default:
                        str += number % numberSystem;
                }
                number = number >> (byte) (Math.log(numberSystem) / Math.log(2));
                flag++;
                if (flag >= 4) {
                    flag = 0;
                    str += " ";
                }
            }
        }
        for (int i = flag; i < 4; i++) {
            str += "0";
        }

        return reverseWithXOR(str);
    }

    public static String reverseWithXOR(String string) {
        char[] array = string.toCharArray();
        int length = array.length;
        int half = (int) Math.floor(array.length / 2);
        for (int i = 0; i < half; i++) {
            array[i] ^= array[length - i - 1];
            array[length - i - 1] ^= array[i];
            array[i] ^= array[length - i - 1];
        }
        return String.valueOf(array);
    }
}
