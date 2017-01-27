package cw_07;

public class ArrayCicle {
    public static void main(String[] args) {
        int[] arr = {2, 5, 12, 32};

        /*for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }*/

        int[][] array = {
                {2},
                {2, 5, 12},
                {2, 5, 12, 32},
                {2, 5},
                {2, 5, 12, 32}
        };

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
