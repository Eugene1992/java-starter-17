package cw_02;

public class ShortLongIf {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;

        if (a > b) {
            if (a > c) {
                System.out.println(a);
            }
        }

        if (a > b & 100 / 0 == 10) {
            System.out.println();
        }
    }
}
