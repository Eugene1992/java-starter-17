package cw_04;

public class While {
    public static void main(String[] args) {
        int count = 0;
        boolean b = true;

        while (count < 10 && count != 5 || count != 0) {
            System.out.println(count++);
        }
    }
}
