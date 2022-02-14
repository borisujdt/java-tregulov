package p4;

import p1.A;
import p1.p2.p3.*;

import p1.p2.B;

import static p1.p2.B.getAb;


public class D {
    public int e = 12;
    public static int uefa = 20;

    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.i(a.a, a.b));

        System.out.println(B.abc);
        System.out.println(getAb());

        C c = new C();
        c.delenie(35,10);


    }

}

