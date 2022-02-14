package homeworks.hm9;

import lessons.lesson8.Test1;

public class Zadacha2 {

}
class Zadacha2Test2{
    int a = 1;
    static int b = 2;

    static void abc(final int a){
        System.out.println(a);
        System.out.println(Zadacha2Test2.b);
    }

    public static void main(String[] args) {
        abc(5);

    }
}
class Zadacha2Test3{
    int a = 1;
    static int b = 2;
    void abc(int a){
        System.out.println(b);
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(Zadacha2Test3.b);
    }

    public static void main(String[] args) {
        Zadacha2Test3 t = new Zadacha2Test3();
        t.abc(4);
    }
}