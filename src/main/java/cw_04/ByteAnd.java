package cw_04;

public class ByteAnd {

    public static final int k = 10;

    public static void main(String[] args) {
        int k = 12 & 4;

        System.out.println(k);

//        0000 1100
//        0000 0100
//        ---------
//        0000 0100

        k = 12 | 4;

        System.out.println(k);

//        0000 1100
//        0000 0100
//        ---------
//        0000 1100

        k = 12 ^ 4;

        System.out.println(k);

//        0000 1100
//        0000 0100
//        ---------
//        0000 1000

        int x = 5, y = 7;

        System.out.println("x = " + x + ", y = " + y);

        x = x ^ y; // x == 2
        y = x ^ y; // y == 5
        x = x ^ y; // x == 7

        System.out.println("x = " + x + ", y = " + y);

        String str = "Hello world";
        System.out.println(reverseWithXOR(str));

        System.out.println(String.valueOf(encode(str, "qwerty")));

        System.out.println(~10 + 1);
    }

    public static String reverseWithXOR(String string) {
        char[] array = string.toCharArray();
        int length = array.length;
        int half = (int) Math.floor(array.length / 2);
        for (int i = 0; i < half; i++) {
            array[i] ^= array[length - i - 1];
            array[length - i - 1] ^= array[i];
            array[i] ^= array[length - i - 1];
        }
        return String.valueOf(array);
    }

    public static byte[] encode(String pText, String pKey) {
        byte[] txt = pText.getBytes();
        byte[] key = pKey.getBytes();
        byte[] res = new byte[pText.length()];

        for (int i = 0; i < txt.length; i++) {
            res[i] = (byte) (txt[i] ^ key[i % key.length]);
        }

        return res;
    }
}
