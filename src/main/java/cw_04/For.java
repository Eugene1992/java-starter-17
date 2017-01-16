package cw_04;

public class For {
    public static void main(String[] args) {

        for (int count = 0, limit = 10; count < 10 && limit != 5; count++, limit--) {
            System.out.println(count);
        }
    }
}
