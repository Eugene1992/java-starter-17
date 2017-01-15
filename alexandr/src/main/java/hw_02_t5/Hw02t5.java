package hw_02_t5;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**
 * Задано четыре переменных, найти и вывести на экран вторую по величине (значения всех переменных разные).
 */
public class Hw02t5 {
    public static void main(String[] args) {
        int a, b, c, d, temp1, temp2, temp3, temp4, maxim2, maxim3;

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите 1-е число: ");
        a = scan.nextInt();
        System.out.print("Введите 2-е число: ");
        b = scan.nextInt();
        System.out.print("Введите 3-е число: ");
        c = scan.nextInt();
        System.out.print("Введите 4-е число: ");
        d = scan.nextInt();

        if (a > b) {temp1 = a; temp2 = b;} else { temp1 = b; temp2 = a;}

        if (c > d) { temp3 = c; temp4 = d;} else {temp3 = d; temp4 = c;}

        if (temp1 > temp3) {maxim2= temp3;} else {maxim2 = temp1;}

        if (temp2 > temp4) {maxim3=temp2;} else {maxim3=temp4;}

        if (maxim2 > maxim3) {System.out.println(maxim2);} else System.out.println(maxim3);





/*        for (int i = 0; i<4; i++) {
            System.out.printf("Введите %d-е число: ", i);
            temp1[i]=scan.nextInt();
        }*/
    }
}
