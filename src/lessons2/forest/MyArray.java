package lessons2.forest;

public class MyArray implements Array{
    int a[] = new int[4];
    int size = 0;

    @Override
    public int get(int i){
        return a[i];
    }

    @Override
    public boolean add(int val){
       if (size != a.length){
           a[size] = val;
           size++;
           return true;
       }else
           return false;
    }

    public void method(){
        System.out.println("Этот метод принадлежит MyArray, а не Array");
    }
}
