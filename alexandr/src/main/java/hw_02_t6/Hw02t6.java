package hw_02_t6;

import java.util.Scanner;

/**
 * В три переменные a, b и c записаны три вещественных числа. Создать программу, которая
 будет находить и выводить на экран вещественные корни квадратного уравнения ax²+bx+c=0,
 либо сообщать, что корней нет.
 D = b*b-4ac
 x= (-b-+D^2)/2a;    x = -b/2a
 */
public class Hw02t6 {
    public static void main(String[] args) {
        double a, b, c;
        System.out.println("Введите три значение a, b, c: ");
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите три значение a: ");
        a = scan.nextDouble();
        System.out.print("Введите три значение b: ");
        b = scan.nextDouble();
        System.out.print("Введите три значение c: ");
        c = scan.nextDouble();
        double d, x, x2;

        d= b * b - 4* a * c;
        if (d<0 || (a==0 && b == 0)) {
            System.out.println("При данном наборе значений нет корней");
        } else if (d == 0) {
            x = -b / (2 * a);
            System.out.println("x = " + x);
        } else if ( a == 0 && b != 0 && c != 0) {
            x = -c/b;
            System.out.println("x = " + x);
        }else {
            x = (-b + Math.sqrt(d)) / 2* a;
            x2 = (-b - Math.sqrt(d)) / 2* a;
            System.out.println("x1 = "+ x );
            System.out.println("x2 = "+ x2 );



        }


    }
}
