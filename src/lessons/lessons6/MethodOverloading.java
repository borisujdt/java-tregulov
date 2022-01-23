package lessons.lessons6;

public class MethodOverloading {
    void show(int i1){
        System.out.println(i1);
        System.out.println("Data Type is int");
    }
    void show(boolean b1){

        System.out.println(b1);
        System.out.println("Data Type is boolean");
    }
    void show(String s1){
        System.out.println(s1);
        System.out.println("Data Type is String");
    }
    void show(String s, int a){
        System.out.println("String: "+s+" "+"int: "+a);
    }
    void show(int a, String s){
        System.out.println("Kakoy xoroshiy den!!!");
    }
}

class MethodOverloadingTest{
    public static void main(String[] args) {
        MethodOverloading mO = new MethodOverloading();
        int a = 500;
        mO.show(a);
        boolean b = true;
        mO.show(b);
        String s = "privet";
        mO.show(s);
        mO.show("privet", 10);
        mO.show(10, "privet");
    }
}
