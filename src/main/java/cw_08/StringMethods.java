package cw_08;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String str = "Hello world!";

        System.out.println(str.length());
        System.out.println(str.isEmpty());

        System.out.println(str.substring(2));
        System.out.println(str.substring(2, 6));
        char c = str.charAt(3);
        System.out.println(c);

        System.out.println("Abba".compareTo(str));
        System.out.println(str.concat("!").concat("*"));

        System.out.println(str.contains("world"));
        System.out.println("199130".contains("13"));

        System.out.println(str.replaceAll("world", " ").split(" ").length);

        String[] split = "My name is Zhenya!".split(" ");
        System.out.println(Arrays.toString(split));

        System.out.println("Hello2".matches("[a-zA-Z]+[0-9]{2,}"));

        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());

        char[] chars = str.toCharArray();
        byte[] bytes = str.getBytes();
    }
}
