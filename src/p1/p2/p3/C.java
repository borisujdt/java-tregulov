package p1.p2.p3;

public class C {
    public int c = 28;
    public int d = 13;

    public void delenie(int c, int d) {
        int x = c / d;
        int y = c % d;

        System.out.println("Целое число =" + x);
        System.out.println("Остаток =" + y);
    }

    public static void main(String[] args) {
        C c1 = new C();
        c1.delenie(c1.c, c1.d);

    }
}
