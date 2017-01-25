package cw08;

/**
 * Пинимает две строки - сравниваем
 */
public class Cw08 {
    public static void main(String[] args) {
        String str1 = "First line!";
        String str2 = "First!";

//        System.out.println(str1.equals(str2));
        //System.out.println(eguals(str1, str2));
        System.out.println(haveOrNot(str1, str2));
    }

    static boolean eguals(String str1, String str2) {
        char[] str3 = str1.toCharArray();
        char[] str4 = str2.toCharArray();
        if (str3.length != str4.length) {
            return false;
        }

        for (int i = 0; i < str3.length; i++) {
            if (str3[i] != str4[i]) return false;
        }
        return true;
    }

    static String retChast(String str, int ot, int doKyd) {
        char[] arr = str.toCharArray();
        String out = "";
        for (int i = ot; i < doKyd; i++) {
            out += arr[i];
        }
        return out;
    }

    static String retChast(String str, int ot) {
        return retChast(str, ot, str.length());
    }

    static boolean haveOrNot(String ishodnik, String search) {
        char[] isho = ishodnik.toCharArray();
        char[] sear = search.toCharArray();
        int count = 0;
        for (int i = 0; i < isho.length; i++) {
            int temp1 = i;
            for (int j = 0; j < sear.length; j++, i++) {
                if (sear[j] == isho[i]) count++;
                else count = 0;
            }
            i = temp1;
            if (count == sear.length) return true;
        }
        return false;
    }
// todo: Helloween Hello найти большее совпадения.

}
