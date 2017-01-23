package cw07;

import java.util.Scanner;

/**
 * 1. Написать метод который принимает масив и выводит его сумму
 */
public class Cw07Array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int array[] = {
                scan.nextInt(),
                scan.nextInt(),
                scan.nextInt(),
                scan.nextInt()};
        //System.out.println(arr(array));
        // arr(array);
        System.out.println("Max digit = " + arrMax(array)[0] + " Min digital = " +arrMax(array)[1]);
    }

    static void arr(int[] temp) {

        System.out.print("[");
        for (int i = 0; i < temp.length; i++) {
            if (i == temp.length - 1) System.out.print(temp[i]);
            else System.out.print(temp[i] + ", ");
        }
        System.out.print("]");
    }
// todo : Найти максимальное и минимальное число в массиве. !!!!!
    static int [] arrMax(int[] temp) {
        int max = 0, min = 0;

        for (int i = 0; i < temp.length; i++) {
            for (int j = 0; j < temp.length; j++) {
                if (temp[i] > temp[j]) {
                    max = temp[i];
                }
                else {max = temp[j];}
                if (temp[i] < temp[j]) {
                    min = temp[i];
                }
                else {min = temp[j];}

                }
            }
        int [] maxMin = new int [2];
        maxMin[0] = max;
        maxMin[1] = min;
        return maxMin;
    }

    static void digits13 () {
        int count = 0;
        for (int i = 0; i < 999999 ; i++) {
            if (i % 10 < 10 && i == 13 ) { count ++;



            }

        }
    }


}
