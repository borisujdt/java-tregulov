package homeworks.hm8;

public class Class2 {
    public static final double pi = 3.14;

    public double ploshadCruga(double r){
     double s = pi*r*r;
     return s;
    }
    public static double dlinaCruga(double r){
        double l = 2*pi*r;
        return l;
    }

}

class Test{
    public static void main(String[] args) {
        Class2 sl2 = new Class2();
        System.out.println(sl2.ploshadCruga(190.5));
        System.out.println(Class2.dlinaCruga(140.7));
    }
}

