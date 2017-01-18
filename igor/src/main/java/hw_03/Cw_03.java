package hw_03;

import java.util.Scanner;

/**
 * Created by ihor on 16.01.2017. done
 */
public class Cw_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //task 1
        /*for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }*/

        //task 2
        /*boolean flag = true;
        int numberSys, numberYou, a = 0, b = 10, attempts = 0;
        numberSys = a + (int) (Math.random() * b);
        do {
            numberYou = scanner.nextInt();
            attempts++;
            System.out.println(numberSys);
            if (numberSys == numberYou) {
                System.out.println("Win!");
                System.out.println("the number of attempts=" + attempts);
                flag = false;
            } else {
                System.out.println("try again.");
            }
        } while (flag);*/

        //task 3
        int deviation0 = 0, deviation1 = 0, deviation2 = 0, deviation3 = 0, deviation4 = 0, deviation5 = 0;
        int random, a = 0, b = 100, eagle = 0, tails = 0;
        final int NORM = 5;
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 10; j++) {
                random = a + (int) (Math.random() * b);
                if (random % 2 == 0) {
                    eagle++;
                } else {
                    tails++;
                }
            }
            //System.out.println("eagle=" + eagle + ", tails=" + tails);
            int deviationEagle = Math.abs(NORM - eagle);
            eagle = 0;
            //int deviationTails = Math.abs(NORM - tails);
            //System.out.println("deviation1=" + deviationEagle);

            switch (deviationEagle) {
                case 0: {
                    deviation0++;
                    break;
                }
                case 1: {
                    deviation1++;
                    break;
                }
                case 2: {
                    deviation2++;
                    break;
                }
                case 3: {
                    deviation3++;
                    break;
                }
                case 4: {
                    deviation4++;
                    break;
                }
                case 5: {
                    deviation5++;
                    break;
                }
            }
        }
        System.out.println("0=" + deviation0);
        System.out.println("1=" + deviation1);
        System.out.println("2=" + deviation2);
        System.out.println("3=" + deviation3);
        System.out.println("4=" + deviation4);
        System.out.println("5=" + deviation5);
    }
}
