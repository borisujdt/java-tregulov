package homeworks.hm8;

public class Class1 {
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

    public static void main(String[] args) {

        System.out.println(umnojenie(10,5,20));
        delenie(10,3);
        delenie(50,17);

    }
}



