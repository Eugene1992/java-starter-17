package hw_05;

/**
 * Created by ihor on 26.01.2017.
 * 1 Счастливые билетики.
 */
public class HW_01 {
    public static void main(String[] args) {
        System.out.println("HappyTickets " + quantityHappyTickets());
        System.out.println("Clock " + symmetryClock());
        System.out.println("combinatorics " + combinatorics());
    }

    static int quantityHappyTickets() {
        int counter = 0;
        for (int i = 0; i < 1000; i++) {
            int first = i % 10 + i / 10 % 10 + i / 100;
            for (int j = 0; j < 1000; j++) {
                if (first == j % 10 + j / 10 % 10 + j / 100) {
                    counter++;
                }
            }
        }
        return counter;
    }

    static int symmetryClock() {
        int counter = 0;
        for (int i = 0; i < 24; i++) {
            for (int j = 0; j < 60; j++) {
                if ((i / 10 == j % 10) && (i % 10 == j / 10)) {
                    counter++;
                }
            }
        }
        return counter;
    }

    static int combinatorics() {
        int counter = 0;

        for (int i = 10; i < 999999; i++) {
            if ((i / 100000 % 10 == 1) && (i / 10000 % 10 == 3)) {
                counter++;
            } else {
                if ((i / 10000 % 10 == 1) && (i / 1000 % 10 == 3)) {
                    counter++;
                } else {
                    if ((i / 1000 % 10 == 1) && (i / 100 % 10 == 3)) {
                        counter++;
                    } else {
                        if ((i / 100 % 10 == 1) && (i / 10 % 10 == 3)) {
                            counter++;
                        } else {
                            if ((i / 10 % 10 == 1) && (i / 1 % 10 == 3)) {
                                counter++;
                            }
                        }
                    }
                }
            }
        }
        return counter;
    }
}
