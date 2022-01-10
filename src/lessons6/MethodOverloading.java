package lessons6;

public class MethodOverloading {
    void showInti(int i1){
        System.out.println(i1);
    }
    void showBoolean(boolean b1){
        System.out.println(b1);
    }
    void showString(String s1){
        System.out.println(s1);
    }
}

class MethodOverloadingTest{
    public static void main(String[] args) {
        MethodOverloading mO = new MethodOverloading();
        int a = 500;
        mO.showInti(a);
        boolean b = true;
        mO.showBoolean(b);
        String s = "privet";
        mO.showString(s);
    }
}
