package cw_07;

import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        byte[] array = new byte[10];
        array[0] = 100;
        array[1] = 101;
        array[2] = 102;
        array[9] = 102;

        System.out.println(Arrays.toString(array));

        byte arr1 [] = new byte[]{2, 5, 2, 6, 12, -12};
        byte[] arr2 = {2, 5, 2, 6, 12, -12};
    }
}
