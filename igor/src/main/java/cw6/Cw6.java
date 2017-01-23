package cw6;

import java.util.Random;

/**
 * Created by Tanchik on 20.01.2017.
 */
public class Cw6 {

    public static void main(String[] args) {

        //ten(0);
       // factorial(5);

        rand(6);


    }

    static void ten(int count) {
        count++;
        System.out.println(count);
        if (count > 9) return;
        else ten(count);
        System.out.println(count);
    }
// TODO : сделать дома.
    /*static void factorial(int digit) {
        int temp1 = digit;
        temp1 *= --digit;

        if (digit <= 1) {
            System.out.println(temp1);
            return;
        } else factorial(temp1);


    }*/

// TODO : Домой
    static void rand (int howLong) {
        Random rand = new Random();

        if (howLong == 0) return; else rand(howLong-1);

    }


}
