package hw_02;

import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args) {
        int i1 = 10;
        Integer i2 = 10;

        Scanner scanner = new Scanner(System.in);

        String mySuperVariable = scanner.next();

        if (mySuperVariable.equals("One")) {
            System.out.println(1);
        } else if (mySuperVariable.equals("Two")) {
            System.out.println(2);
        } else if (mySuperVariable.equals("Three")) {
            System.out.println(3);
        } else {
            System.out.println("Something else");
        }

        /*
        - all primitives
        - all wrappers
        - all Enums since 1.7
        - String    since 1.7
        */
        switch (mySuperVariable) {
            case "One":
                System.out.println(1);
                switch (mySuperVariable) {
                    case "One":
                        System.out.println(11);
                }
                break;

            case "Two":
                System.out.println(2);
                break;

            case "Three":
                System.out.println(3);
                break;
        }

    }
}
