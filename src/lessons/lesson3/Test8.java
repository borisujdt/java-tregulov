package lessons.lesson3;

public class Test8 {
    public static void main(String[] args) {

        boolean b1 = false;
        boolean b2 = b1==true;

        System.out.println(b2);

        int x = 0;
        x = (+5) + (+15); //Скобки для наглядности, можно и без них
        System.out.println("x = " + x);

        int y = -x;
        System.out.println("y = " + y);
    }
}
