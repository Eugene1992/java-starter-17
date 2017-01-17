package cw_04;

public class NestedCycles {
    public static void main(String[] args) {

        sasha:
        for (int i = 0; i < 10; i++) {
            inner:
            for (int j = 0; j < 10; j++) {
                if (i == 6) break sasha;
                System.out.println(i + " " + j);
            }
        }
    }
}
