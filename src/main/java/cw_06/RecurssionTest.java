package cw_06;

public class RecurssionTest {

    static int count = 0;

    public static void main(String[] args) {
        System.out.println((char)120);
    }

    static void f(int num) {
        System.out.println(num++);
        if (num == 10) return;
        f(num);
        System.out.println(num);
    }

    static int fact(int num) {
        return num != 1 ? num * fact(num - 1) : num;
    }
}
