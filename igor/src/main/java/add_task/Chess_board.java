package add_task;
import java.util.Scanner;
/**
 * Created by ihor on 17.01.2017.
 * chess board
 */
public class Chess_board {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter size, max 8");
        int size = scanner.nextInt();
        boolean flag = true;
        String line_1 = "", line_2 = "", line_3 = "", line_4 = "", line_5 = "", line_6 = "", line_7 = "", line_8 = "";
        switch (size) {
            default: {
                flag = false;
                System.out.println("sorry, max 8");
                break;
            }
            case 8: {
                for (int i = 0; i < size; i++) {
                    line_8 += i % 2 == 0 ? "-" : "*";
                }
            }
            case 7: {
                for (int i = 0; i < size; i++) {
                    line_7 += i % 2 == 0 ? "*" : "-";
                }
            }
            case 6: {
                for (int i = 0; i < size; i++) {
                    line_6 += i % 2 == 0 ? "-" : "*";
                }
            }
            case 5: {
                for (int i = 0; i < size; i++) {
                    line_5 += i % 2 == 0 ? "*" : "-";
                }
            }
            case 4: {
                for (int i = 0; i < size; i++) {
                    line_4 += i % 2 == 0 ? "-" : "*";
                }
            }
            case 3: {
                for (int i = 0; i < size; i++) {
                    line_3 += i % 2 == 0 ? "*" : "-";
                }
            }
            case 2: {
                for (int i = 0; i < size; i++) {
                    line_2 += i % 2 == 0 ? "-" : "*";
                }
            }
            case 1: {
                for (int i = 0; i < size; i++) {
                    line_1 += i % 2 == 0 ? "*" : "-";
                }
            }
        }
        if (flag) {
            System.out.println(line_1);
            System.out.println(line_2);
            System.out.println(line_3);
            System.out.println(line_4);
            System.out.println(line_5);
            System.out.println(line_6);
            System.out.println(line_7);
            System.out.println(line_8);
        }
    }
}