package hw_02;

public class TernaryExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 0;

        if (a > b) {
            c = a;
        } else if (b > a) {
            if (a == 0) {
                c = 0;
            } else {
                c = b;
            }
        }
//      condition ? true : false;
        int ct = a > b ? a : a == 0 ? 0 : b;

        System.out.println(c);
        System.out.println(ct);

        boolean b1 = true;
        boolean b2 = true;

        if (a > b ? b1 : b2) {

        }
    }
}
