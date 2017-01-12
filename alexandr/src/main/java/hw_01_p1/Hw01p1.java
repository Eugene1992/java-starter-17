package hw_01_p1;
/*
1. Создать четыре целочисленные переменные типов byte, short, int, long.
2. Инициализировать переменную типа byte результатом суммы двух любых чисел.
3. Инициализировать переменную типа short результатом вычитания двух любых чисел.
4. Инициализировать переменную типа int результатом деления двух любых чисел.
5. Инициализировать переменную типа long результатом умножения двух любых чисел.
6. Передать переменной типа byte результат суммы двух переменных типа byte.
7. Передать переменной типа byte результат суммы двух переменных типа short, деленных на третью переменную типа byte.
8. Переменной типа int передать результат деления двух short, умноженных на результат деления двух byte.
9. Поменять значения двух целочисленных переменных используя третью.
10.Поменять значения двух переменных без использования третей.

 */

public class Hw01p1 {
    public static void main(String[] args) {
                     // TODO 1.1:
        byte dgt1=1;
        short dgt2;
        int dgt3;
        long dgt4;
      //  dgt1=1;
        dgt2=2;
        dgt3=3;
        dgt4=4;

                    // TODO 1.2:
        byte sum = 2 + 5;
                    // TODO 1.3:
        short minus = 90 - 30;
                    // TODO 1.4:
        int segmentation = 66 / 3;
                    // TODO 1.5:
        long multi = 5 * 5;
                    // TODO 1.6:
        sum = (byte)(sum + dgt1);
                    // TODO 1.7:
        sum = (byte)((minus+dgt2)/sum);
                    // TODO 1.8:
        segmentation = (int)((minus/dgt2)*(sum/dgt1));
                    // TODO 1.9:
        int a=6,b=5,c;
        System.out.println(a+" "+ b);
        c=a;
        a=b;
        b=c;
        System.out.println(a+" "+ b);
                    // TODO 1.10:
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a+" "+ b);


    }
}
