package hw_03;

/**
 * 1. Создайте программу, выводящую на экран все четырёхзначные числа последовательности 1000 1003 1006 1009 1012 1015 ….
 * 2. Создайте программу, выводящую на экран первые 55 элементов последовательности 1 3 5 7 9 11 13 15 17 ….
 * 3. Создайте программу, выводящую на экран все неотрицательные элементы последовательности 90 85 80 75 70 65 60 ….
 * 4. Создайте программу, выводящую на экран первые 20 элементов последовательности 2 4 8 16 32 64 128 ….
 */
public class Hw03t1 {
    public static void main(String[] args) {
        // 1:
        for (int i = 1000; i < 10000; i += 3) {
            System.out.println(i);
        }
        // 2:
        for (int temp = 1, i = 0; i < 55; i++, temp += 2) {
            System.out.println(temp);
        }
        // 3:
        for (int temp = 90; temp >= 0; temp -= 5) {
            System.out.println(temp);
        }
        // 4:
        for (int temp = 2, i = 1; i < 21; temp *= 2, i++) {
            System.out.println(i + ". " + temp);
        }
    }
    static void digitalMore100 (int temp1 ){
        for (int i = 1000; i < 10000; i += 3) {
            System.out.println(i);
        }
    }
}
