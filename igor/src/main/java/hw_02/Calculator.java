package hw_02;

import java.util.Scanner;

/**
 * Created by ihor on 15.01.2017.
 * Calculator
 */
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi. This is Calculator. \nEnter tow number.");
        double result, number1 = scanner.nextDouble(), number2 = scanner.nextDouble();
        System.out.println("Enter arithmetic operation.");
        String arOperator = scanner.next();
        System.out.print("result: ");
        switch (arOperator) {
            case "+": {
                result = number1 + number2;
                System.out.println(result);
                break;
            }
            case "-": {
                result = number1 - number2;
                System.out.println(result);
                break;
            }
            case "*": {
                result = number1 * number2;
                System.out.println(result);
                break;
            }
            case "/": {
                if (number2 == 0) {
                    System.out.println("error: Division dy 0.");
                } else {
                    result = number1 / number2;
                    System.out.println(result);
                }
                break;
            }
            default: {
                System.out.println("error: arithmetic operation not found.");
            }
        }

    }
}
