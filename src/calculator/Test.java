package calculator;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Calculator calculator1 = new Calculator();
        RomanArabic romanArabic1 = new RomanArabic();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите данные для калькулятора");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println("Итого: "+ x+y);

    }
}
