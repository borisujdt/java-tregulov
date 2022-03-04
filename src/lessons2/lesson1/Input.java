package lessons2.lesson1;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("введите какое-нибудь число");
        int x = scan.nextInt();
        System.out.println("вы ввели "+x);
    }
}
