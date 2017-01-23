package cw03;

import java.util.*;
import java.lang.*;

/**
 * Created by Tanchik on 16.01.2017.
 */
public class Cw03 {
   /* public static void main(String[] args) {
        String temp = "*";
        for (int i = 0; i < 10; i++) {
            System.out.println(temp);
            temp +="*";
        }

    }

    public static void digit (String[] args) {
        String temp = "*";
        for (int i = 1; i < 11; i++) {
            //int j =0;
            System.out.println(temp);
            for ( int j = 0; j < i; j++) {
                System.out.print(temp);
            }
        }
        // System.out.print(temp);
    }*/

    public static void main(String[] args) throws java.lang.Exception {
        int orel = 0, reshka = 0, orel1=0, reshka1 =0, otklon=0;
        Random rnd = new Random(System.currentTimeMillis());
        for (int i = 0; i <100 ; i++) {

            for (int j = 0; j < 100; j++) {
                int number = rnd.nextInt(10);
                if (number % 2 == 0) {
                    orel++;
                } else {
                    reshka++;
                }

            }
            if ((Math.abs(orel-reshka))>10) otklon++;
            orel=0;
            reshka=0;
        }
        System.out.printf("Орел выпал %d раз, решка - %d раз", orel1, reshka1);
        System.out.println(otklon);


        /*for (int i = 0; i < 10; i++) {
            System.out.println("Сыграем... угадай мое число от 0 до 10");
            // Инициализируем генератор
            Random rnd = new Random(System.currentTimeMillis());
// Получаем случайное число в диапазоне от min до max (включительно)
            int number = 0 + rnd.nextInt(10 - 0 + 1);
            for (int j = 1; j <10 ; j++) {
                Scanner scan = new Scanner(System.in);
                int yourNum = scan.nextInt();
                if (yourNum == number) {
                    System.out.printf("Ты фартовый чел, отгадал за %d раз", j);
                    break;
                } else {
                    System.out.println("Давай еще раз");
                }

            }

        }*/
    }
}
