import hw_01.Hw_01;
import hw_02.HW_02_Method;
import hw_03.HW_03_Method;

import java.util.Scanner;

/**
 * Created by ihor on 20.01.2017.
 * main
 */
public class StartChoiceHW {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("select home world");
        boolean flag = true;
        do {
            System.out.println("select task:");
            String[] strTask = {
                    "1 - HW 01 (review)",
                    "2 - HW 02",
                    "3 - HW 03",
                    "4 - HW arrays, coming soon",
                    "0 - exit, coming soon"};
            for (int i = 0; i < 5; i++) {
                System.out.println(strTask[i]);
            }
            int selTask = scanner.nextInt();
            if (0 <= selTask & selTask <= 4) {
                flag = false;
            }
            switch (selTask) {
                case 0: {
                    System.out.println("Bye");
                    break;
                }
                case 1: {
                    Hw_01.review();
                    break;
                }
                case 2: {
                    HW_02_Method.main(strTask);
                    break;
                }
                case 3: {
                    HW_03_Method.main(strTask);
                    break;
                }
                case 4: {

                    break;
                }
                default: {
                    flag = true;
                }
            }
        } while (flag);
    }
}
