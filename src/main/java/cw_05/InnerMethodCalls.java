package cw_05;

import java.util.Random;

public class InnerMethodCalls {
    public static void main(String[] args) {
        printDollarConcat(5);
        System.out.println((int)'$');
        Random random = new Random();
    }

    static void printDollarConcat(int num) {
        System.out.println(calcSum(num, 10) + "$");
    }

    static int calcSum(int numOne, int numTwo) {
        return numOne + numTwo;
    }
}
