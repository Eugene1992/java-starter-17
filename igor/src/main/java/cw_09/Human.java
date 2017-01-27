package cw_09;

/**
 * Created by ihor on 27.01.2017.
 */
public class Human {
    public static void main(String[] args) {
        int[][] data = {{10, 11, 12}, {102, 110, 101}}; //age, wage
        String[] str = {"A", "B", "C"};
        getMaxWage(data, str);
    }

    static void getMaxWage(int[][] arr, String[] name) {
        int space = 0, max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[1][i]) {
                max = arr[1][i];
                space = i;
            }
        }
        System.out.println("name " + name[space] + ", ware " + arr[1][space]);
    }
}
