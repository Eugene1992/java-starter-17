package hw_02;

import java.util.Scanner;

/**
 * Created by ihor on 15.01.2017.
 * Программа находить и выводить на экран вещественные корни квадратного уравнения ax²+bx+c=0.
 * В три вещественные переменные a, b и c задает пользователь.
 */
public class hw_02_t6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, c, D, x1, x2;
        System.out.println("ax^2+bx+c=0");
        System.out.println("Enter a, b, c");
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();
        D = Math.pow(b, 2) - 4 * a * c;
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
