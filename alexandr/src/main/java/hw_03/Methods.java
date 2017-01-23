package hw_03;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**
 * 1. Создайте программу, выводящую на экран все четырёхзначные числа последовательности 1000 1003 1006 1009 1012 1015 ….
 * 2. Создайте программу, выводящую на экран первые 55 элементов последовательности 1 3 5 7 9 11 13 15 17 ….
 * 3. Создайте программу, выводящую на экран все неотрицательные элементы последовательности 90 85 80 75 70 65 60 ….
 * 4. Создайте программу, выводящую на экран первые 20 элементов последовательности 2 4 8 16 32 64 128 ….
 * 5. Выведите на экран первые 20 членов последовательности Фибоначчи.
 * 6. Перевод числа из 10-ой в 2,8,16- ричную систему исчисления.
 * 7. Создайте программу, вычисляющую факториал натурального числа n, введенного пользователем.
 */
public class Methods {
    public static void main(String[] args) {
        // forDigits(1111,1555, 5 ); //  №1. Начальная, конечная цифра и шаг вывода.
        // firstSomeDigigts(1, 55, 2); // №2. Вывести начиная C, сколько раз, шагом в...
        // neOtricatelnie(55, 5); // №3. Вывести начиная с в сторону уменьшения, с шагом x,  не < 0
        // №4. Однотипен с задачей №2.
        // fibonachy(2, 20); // №5. Числа фибоначи. Начать с чиста, сколько раз
        // changeDigitalSystem(); // №6. Перевод обычного 10-го числа в 2-ю, 8-юб 16-ю систему исчисления
        factorial(); // 7. Вычисляет факториал введенныого натурального числа
    }

    static void print(int digit) {
        System.out.print(digit + " ");
    }

    static void print (String str){
        System.out.println(str);
    }

    static int scan () {
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }

    static void forDigits(int start, int doskolky, int shag) {
        for (int i = start; i < doskolky; i += shag) {
            print(i);
        }
    }

    static void firstSomeDigigts(int start, int count, int shag) {
        for (int temp = start, i = 0; i < count; i++, temp += shag) {
            print(temp);
        }
    }

    static void neOtricatelnie(int start, int shag) {
        for ( ; start >= 0; start -= shag) {
            System.out.println(start);
        }
    }

    static void fibonachy (int start, int count) {
        for (int temp1 = start+1, i = 1; i < count; i++) {
            print(start);
            temp1 = temp1 + start;
            start = temp1-start;
        }
    }

    static void changeDigitalSystem () {
        print("Я могу перевести любое число из 10-й системы исчисления в 2-ю, 8-ю, 16-ю. \n" +
                "Для этого введите любое просто число: ");
        int a = scan();
        print("Теперь выберете систему исчисления, для этого введите 2, 8 или 16 соответственно: ");
        int choose = scan();
        if (choose == 2 || choose == 4 || choose == 16) {
            print(Integer.toString(a, choose));
        } else print("Я такого не предлагал, такой системы исчисления.");
    }

    static void factorial () {
        print("Введите число для вычисления факториала: ");
        int fac = scan();
        int temp = 1;
        for (int i = 1; i < fac + 1; i++) {
            temp *= i;
        }
        print(temp);
    }

}
