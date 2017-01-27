package cw_07;

public class TwoArray {
    public static void main(String[] args) {
        int[][] array = {
//           0  1   2   3
       /*0*/{2, 65, 12, 87},
       /*1*/{2, 15, 32, 17}
        };

        System.out.println(array.length);
        System.out.println(array[0].length);
        System.out.println(array[0][2]);

        int[][] arr = new int[4][4];
        arr[0] = new int[]{2, 65, 12, 87};
        arr[1] = new int[]{2, 65, 12, 87};
        arr[2] = new int[]{2, 65, 12, 87};
        arr[3] = new int[]{2, 65, 12, 87};

        arr[0][0] = 5;

        int[] arrs = new int[1];
    }
}
