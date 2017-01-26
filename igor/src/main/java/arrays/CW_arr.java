package arrays;

/**
 * Created by ihor on 23.01.2017.
 * CW
 */
public class CW_arr {
    public static void main(String[] args) {
        /*int[] arr = new int[10];
        arr = randArr(arr, 100);
        System.out.println(printArr(arr));
        System.out.println("\n" + sumArr(arr));*/
        
    }


     public static int[] randArr(int length, int a, int b) {
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (a + (Math.random() * b));
        }
        return array;
    }

    public static String printArr(int[] array) {
        String str = "[";
        for (int i = 0; i < array.length; i++) {
            str += array[i];
            if (i < array.length - 1){
                str += ", ";
            }   else {
                str += "]";
            }
        }
        return str;
    }

    static int sumArr(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
}
