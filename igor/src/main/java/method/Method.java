package method;

import java.util.Scanner;

/**
 * Created by ihor on 18.01.2017.
 * test Method
 */
public class Method {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //int quantity = scanner.nextInt();
        //String str = scanner.next();
        //printStr(quantity, str);
        int start = scanner.nextInt(), stop = scanner.nextInt(), step = scanner.nextInt();
        int sum = calcSumInterval(start, stop, step);
        System.out.println(sum);
    }

    static void printStr(int count, String str) {
        for (int i = 0; i < count; i++) {
            System.out.println(i + 1 + " " + str);
        }
    }

    static int calcSumInterval(int start, int stop, int step) {
        int sum = 0;
        for (int i = start; i <= stop; i += step) {
            sum += i;
        }
        return sum;
    }
}
