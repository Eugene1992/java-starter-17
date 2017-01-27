package str_common;

import hw_03.HW_03_Method;

/**
 * Created by ihor on 26.01.2017.
 * написать метод, который принимает две строки и возвращает наибольшую общую подстроку, т.е.
 * Helloween
 * Hellen
 * Имеем две подстроки Hell, en
 * Нужно вернуть большую
 */
public class Str_com {
    public static void main(String[] args) {
        String str1 = "Hel8owlen", str2 = "Hewlen", str;
        str = metod(str1, str2);
        System.out.println(str);
    }

    static String metod(String str1, String str2) {
        String finalstr = "";
        char[] str1Arr = str1.toCharArray();
        char[] str2Arr = str2.toCharArray();
        int[][] arrSS = {{-1, -1, -1, -1}, {0, 0, 0, 0}};
        //interval 1
        for (int i = 0; i < str1Arr.length; i++) {
            for (int j = 0; j < str2Arr.length; j++) {
                if (str1Arr[i] == str2Arr[j]) {
                    if (arrSS[0][0] == -1) {
                        arrSS[0][0] = i;
                        arrSS[1][0] = j;
                    }
                }
            }
        }
        for (int i = 0; i < str2Arr.length - arrSS[0][0]; i++) {
            if (str1Arr[arrSS[0][0] + i] != str2Arr[arrSS[1][0] + i]) {
                if (arrSS[0][1] == -1) {
                    arrSS[0][1] = arrSS[0][0] + i;
                    arrSS[1][1] = arrSS[1][0] + i;
                }
            }
        }

        //interval 2
        for (int i = arrSS[0][1]; i < str1Arr.length; i++) {
            for (int j = arrSS[1][1] + 1; j < str2Arr.length; j++) {
                if (str1Arr[i] == str2Arr[j]) {
                    if (arrSS[0][2] == -1) {
                        arrSS[0][2] = i;
                        arrSS[1][2] = j;
                    }
                }
            }
        }
        for (int i = 0; i < str2Arr.length - arrSS[1][2]; i++) {
            if (str1Arr[arrSS[0][2] + i] != str2Arr[arrSS[1][2] + i]) {
                if (arrSS[0][3] == -1) {
                    arrSS[0][3] = arrSS[0][2] + i;
                    arrSS[1][3] = arrSS[1][2] + i;
                }
            }
        }

        if ((arrSS[0][1] - arrSS[0][0]) > (arrSS[0][3] - arrSS[0][2])) {
            for (int i = arrSS[0][0]; i < arrSS[0][1]; i++) {
                finalstr += str1Arr[i];
            }
        } else {
            for (int i = arrSS[0][3]; i < arrSS[0][2]; i++) {
                finalstr += str1Arr[i];
            }
        }
        return finalstr;
    }
}
