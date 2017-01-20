package method;

import java.util.Scanner;

/**
 * Created by ihor on 18.01.2017.
 * method 02
 */
public class Method_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        random(scanner.nextInt());
    }
    static void random (int count){
        for (int i = 0; i < count; i++) {
            godOrBed((int)( Math.random()*1000));
        }
    }
    static void godOrBed (int ran){
        switch (ran){
            case 7: {}
            case 777: {}
            case 3: {printNumber(true, ran);  break;}
            case 13: {}
            case 33: {}
            case 666: {printNumber(false, ran); break;}
        }
    }

    static void printNumber  (boolean str, int number) {
        if (str) {
            System.out.println(number + " god");
        } else {
            System.out.println(number + " bed");
        }
    }
}

