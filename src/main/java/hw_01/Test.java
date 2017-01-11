package hw_01;

public class Test {
    public static void main(String[] args) {
        boolean isAuth = true;
        boolean isFalse = false;
        boolean k = 10 == 5;

        char c1 = 'g';
        char c2 = 123;
        char c3 = '\u1234';

        char c4 = 123 + 'g';

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        byte b1 = 100; // -128 ... 127

        short s1 = 3276;

        int i1 = 2_123_211;

        long l1 = 5021221212121212112L;

        float f1 = 100 / 3.0F;

        double d1 = 100 / 3.0F;

        int i2 = 9;
        int i3 = 2;

        System.out.println(i2 + i3);
        System.out.println(i2 - i3);
        System.out.println(i2 / i3);
        System.out.println(i2 * i3);
        System.out.println(i2 % i3);

        int a = 0, b = 10, g, m = 100;

        System.out.println(a);

        byte sum = (byte)(150 * 2);
        System.out.println(sum);
        System.out.print(sum);
        System.out.print(sum);
    }
}
