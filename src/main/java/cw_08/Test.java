package cw_08;

public class Test {
    public static void main(String[] args) {
        String s1 = "Hello world";
        String s2 = new String("Hello world");
        String s3 = "Hello world" + s1;
        String s4 = s1.toLowerCase();

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
    }
}
