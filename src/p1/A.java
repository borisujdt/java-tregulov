package p1;

public class A {
    public int a = 5;
    public int b = 10;

    public int i (int a, int b){
        final int i = a + b;
        return i;
    }

    public static void main(String[] args) {
        A one = new A();
        System.out.println(one.i(one.a, one.b));
    }
}

