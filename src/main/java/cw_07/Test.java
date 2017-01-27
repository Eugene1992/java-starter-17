package cw_07;

import java.util.Random;
import java.util.Scanner;

public class Test {

    static int compX;
    static int compY;

    public static void main(String[] args) {
        int[][] player = new int[5][5];
        int[][] comp = new int[5][5];
        player[0][2] = 7;

        compX = getCompChoice();
        compY = getCompChoice();

        start(player, comp);
    }

    static void start(int[][] player, int[][] comp) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Choose x, y: ");
            int playerX = scanner.nextInt();
            int playerY = scanner.nextInt();
            if (shoot(comp, playerX, playerY)) {
                System.out.println("Player won!");
                return;
            } else {
                int compX = getCompChoice();
                int compY = getCompChoice();
                if (shoot(player, compX, compY)) {
                    System.out.println("Computer won!");
                    return;
                }
            }
            System.out.println("Player: ");
            print(player);
            System.out.println("Computer: ");
            print(comp);
        }
    }

    static void print(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static boolean shoot(int[][] arr, int x, int y) {
        if (arr[x][y] == 7) {
            return true;
        } else {
            arr[x][y] = 1;
            return false;
        }
    }

    static int getCompChoice() {
        Random random = new Random();
        return random.nextInt(5);
    }
}
