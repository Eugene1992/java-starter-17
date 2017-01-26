package battle;

import java.util.Scanner;

/**
 * Created by ihor on 26.01.2017.
 * battle
 */
public class Battle {

    static int[] coorShipUser = new int[2];
    static int[] coorShipComp = new int[2];

    public static void main(String[] args) {
        int size = knowSize();
        int[][] arrUser = createField(size);
        int[][] arrComp = createField(size);
        getCoorShipUser(size);
        getCoorShipComp(size);
        startGame(arrUser, arrComp);
    }

    static void startGame(int[][] arrUser, int[][] arrComp) {
        step(arrUser, arrComp);
    }

    //TODO endGame
    static void endGame(String str) {
        System.out.println(str + "win");
    }

    static void step(int[][] arrUser, int[][] arrComp) {
        int[] shot = shotUser(arrUser.length);
        hitTest(shot, coorShipComp, "User");
        setShotField(arrComp, shot);
        shot = shotComp(arrComp);
        hitTest(shot, coorShipComp, "Comp");
        setShotField(arrUser, shot);
        printField(arrUser);
        System.out.println("");
        printField(arrComp);
        step(arrUser,arrComp);
    }

    static void hitTest(int[] shot, int[] conct, String str) {
        if ((shot[0] == conct[0]) && (shot[1] == conct[1])) {
            endGame(str);
        }
        return;
    }

    static void printField(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
    }

    static int knowSize() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("size?");
        return scanner.nextInt();
    }

    static int[][] createField(int size) {
        int[][] arr = new int[size][size];

        return arr;
    }

    /*static int[][] shotField(int[][] arr) {
        int[] shot = createUserShot(arr.length);
        arr[shot[0]][shot[1]] = 1;
        return arr;
    }*/

    static int[] shotUser(int size) {
        int[] arr = new int[2];
        Scanner scanner = new Scanner(System.in);
        System.out.println("shop:");
        // не больше масива
        arr[0] = scanner.nextInt();
        arr[1] = scanner.nextInt();
        return arr;
    }

    static int[] shotComp(int[][] arr) {
        int[] shot = {(int) (Math.random() * arr.length), (int) (Math.random() * arr.length)};
        if (arr[shot[0]][shot[1]] == 1) {
            shot = shotComp(arr);
        }
        return shot;
    }

    static int[][] setShotField(int[][] arr, int[] shot) {
        arr[shot[0]][shot[1]] = 1;
        return arr;
    }

    public static void getCoorShipUser(int size) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("chose where is you ship");
        // не больше масива
        coorShipUser[0] = scanner.nextInt();
        coorShipUser[1] = scanner.nextInt();
    }

    static void getCoorShipComp(int size) {
        coorShipComp[0] = (int) (Math.random() * size);
        coorShipComp[1] = (int) (Math.random() * size);
    }
}
