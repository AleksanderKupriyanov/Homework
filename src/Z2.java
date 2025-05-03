import java.util.Scanner;

public class Z2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Ввидите число типа long");
        long j = console.nextLong();

        //Задание 1.
        long i, b = 0;
        i = j;
        for (; i > 0; ) {
            b = b * 10 + (i % 10);
            i = i / 10;
        }
        System.out.println("Число записанное справа налево: " + b);

        //Задание 2.
        long min, max = 0;
        i = j;
        min = b % 10;
        for (; i > 0; i = i / 10) {
            b = i % 10;
            if (b <= min) min = b;
            if (b >= max) max = b;
        }
        System.out.println("min=" + min + " " + "max=" + max);

        //Задание 3.
        int t = 0;
        long c;
        i = j;
        for (; i > 0; i = i / 10) {
            b = i % 10;
            for (long a = i / 10; a > 0; a = a / 10) {
                c = a % 10;
                if (c == b) t = 1;
            }
        }
        if (t != 1) System.out.println("true");

        //Задание 4.
        long k = 0;
        max = 0;
        i = j;
        for (; i > 0; i = i / 10) {
            b = i % 10;
            if (b >= max) max = b;
        } //Ищем максимум
        i = j;
        for (; i > 0; i = i / 10) {
            b = i % 10;
            if (b == max) k = k * 10 + b;
        } //Ищем повторяющие цифры максимума
        i = j * 10;
        for (; i > 0; i = i / 10) {
            max = max - 1;
            for (long a = j; a > 0; a = a / 10) {
                b = a % 10;
                if (b == max) k = k * 10 + b;
            }
        } //Создаём последовательность по убыванию
        System.out.println("Цифры в числе от большего к меньшему: " + k);
    }
}