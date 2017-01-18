package cw_02;

public class Test {
    public static void main(String[] args) {

        byte b = 10;
        int a = 200;

        b = (byte) a;

        System.out.println(b);

        String name = "Evgeniy";

        int age = 24;

        System.out.println("Hello, my name is " + name + "! I'm " + age + " years old!");
        System.out.printf("Hello, my name is %s! I'm %d years old!", name, age);
    }
}
