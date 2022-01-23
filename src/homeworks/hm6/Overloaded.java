package homeworks.hm6;

public class Overloaded {
    int sum(){
        int result = 0;
        System.out.println("Сумма всех чисел: "+result);
        return result;
    }
    int sum(int a, int b){
        int result1 = a+b;
        System.out.println("Сумма всех чисел: "+result1);
        return result1;
    }
    int sum(int c, int d, int e){
        int result2 = c+d+e;
        System.out.println("Сумма всех чисел: "+result2);
        return result2;
    }
    int sum (int f, int g, int h, int j){
        int result3 = f+g+h+j;
        System.out.println("Сумма всех чисел: "+result3);
        return result3;
    }
    int sum(int k, int l, int z, int x, int c){
        int result4 = k+l+z+x+c;
        System.out.println("Сумма всех чисел: "+result4);
        return result4;
    }
}
class OverloadedTest{
    public static void main(String[] args) {
        Overloaded m = new Overloaded();
        m.sum();
        m.sum(1,2);
        m.sum(5,7,8);
        m.sum(3,4,7,5);
        m.sum(2,5,7,8, 9);
    }
}
