package cw_05;

public class MethodExample {

    static int k = 100;

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 10;
        int d = 10;

        int sum1 = a + b;
        int sum2 = 0;

        System.out.println(calcSum(sum1, sum2));

        printDollarConcat("10000");

        int k = 100;

        System.out.println(k);

        mul(k);

        System.out.println(MethodExample.k);
    }

    static int calcSum(int numOne, int numTwo) {
        return numOne + numTwo;
    }

    static void printDollarConcat(String str) {
        System.out.println(calcSum(0, 10) + '$');
    }

    static void mul(int t) {
        k = t + 1000;
    }
}
