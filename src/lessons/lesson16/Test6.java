package lessons.lesson16;

import java.util.Locale;

public class Test6 {
    public static void main(String[] args) {
        String s = "PrIvEt:2!";
        String s2 = s.toLowerCase();
        System.out.println(s2);

        String s3 = s.toUpperCase();
        System.out.println(s3);

        boolean b = s.contains("T:2");
        System.out.println(b);

    }
}
