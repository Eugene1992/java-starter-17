package hw_03;

/**
 * Created by ihor on 16.01.2017.
 * Выведите на экран первые 20 членов последовательности Фибоначчи.
 */
public class Hw_03_t2 {
    public static void main(String[] args) {
        //todo: узнать про Фибоначчи
        int fibonachi_n0 = 1, fibonachi_n1 = 1, fibonachi_n2;
        System.out.print(fibonachi_n0 + " " + fibonachi_n1 + " ");
        for (int i = 0; i < 18; i++) {
            fibonachi_n2 = fibonachi_n1 + fibonachi_n0;
            System.out.print(fibonachi_n2 + " ");
            fibonachi_n0 = fibonachi_n1;
            fibonachi_n1 = fibonachi_n2;
        }
    }
}
