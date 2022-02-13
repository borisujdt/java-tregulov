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

    public static int umnojenie(int a, int b, int c){
        int x = a*b*c;
        return x;
    }
    public static void delenie(int a, int b){

        int y = a/b;
        int z = a%b;
        System.out.println("Целое число="+y);
        System.out.println("Остаток="+z);

    }
}

class Test{
    public static void main(String[] args) {
        Class2 sl2 = new Class2();
        System.out.println(sl2.ploshadCruga(190.5));

        System.out.println(Class2.dlinaCruga(140.7));

        System.out.println(Class2.umnojenie(10,5,20));

        Class2.delenie(10,3);
        Class2.delenie(50,17);
    }
}

