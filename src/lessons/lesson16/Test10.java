package lessons.lesson16;

public class Test10 {
    public static void main(String[] args) {
        String x = "privet";
        String y = "privet".trim();
        System.out.println(x==y);

        String x2 = "privet";
        String y2 = "  privet".trim();
        System.out.println(x2==y2);
        System.out.println(x2.equals(y2));
    }
}
