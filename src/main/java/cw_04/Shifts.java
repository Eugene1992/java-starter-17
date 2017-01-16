package cw_04;

public class Shifts {
    public static void main(String[] args) {
        int b = 25 << 4;

        System.out.println(b);

//        0001 1001
//        0110 0100

        byte c = (byte)(253 << 2);

        System.out.println(c);

        int d = 64 >> 4;

        System.out.println(d);

    }
}
