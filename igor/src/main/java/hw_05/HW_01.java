package hw_05;

/**
 * Created by ihor on 26.01.2017.
 * 1 Счастливые билетики. Есть билеты с номерами от 000001 до 999999. «Счастливым» считается билетик у которого сумма первых трёх цифр номера равна сумме последних трёх цифр, как, например, в билетах с номерами 003102 или 567576. С помощью программы, подсчитайте сколько счастливых билетов.
 */
public class HW_01 {
    public static void main(String[] args) {
        System.out.println(quantityHappyTickets());

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
}
