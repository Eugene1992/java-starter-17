package method;

import java.util.Scanner;

/**
 * Created by ihor on 20.01.2017.
 */


public class Recursion {
    static int counter = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startNumber = 0;
        //f(startNumber);
        //int result = fakt(5);
        System.out.println(passwordGenerator(scanner.nextInt()));
    }

    static void f(int i) {
        counter++;
        if (i <= 10 & counter <= 10) {
            i++;
        } else {
            i--;
        }
        System.out.print(i + " ");
        if (counter < 19) {
            f(i);
        } else {
            return;
        }
        return;
    }

    static int fakt(int number) {
        int result = 1;
        if (number < 1) {
            return result;
        }
        result = number * fakt((number - 1));
        return result;
    }

    static String passwordGenerator(int coutner) {
        String pass = "";
        for (int i = 0; i < coutner; i++) {
            pass += randChar();
        }
        return pass;
    }

    static char randChar() {
        int a = 48, b = 122;
        char ch = 0;
        int number = (int) (a + (Math.random() * b));
        if ((48 <= number & number <= 57) | (65 <= number & number <= 90) | (97 <= number & number <= 122)) {
            ch = (char) number;
        } else {
            ch = randChar();
        }
        return ch;
    }
}

