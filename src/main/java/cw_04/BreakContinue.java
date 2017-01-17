package cw_04;

public class BreakContinue {
    public static void main(String[] args) {

        for (int count = 0; count < 10; count++) {
            if (count == 6) break;
            System.out.println(count);
        }

        for (int count = 0; count < 10; count++) {
            if (count == 6) continue;
            System.out.println(count);
        }
    }
}
