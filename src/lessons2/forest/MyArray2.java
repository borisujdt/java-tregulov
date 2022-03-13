package lessons2.forest;

public class MyArray2 implements Array{

    int a[] = new int[4];
    int size = 0;

    @Override
    public int get(int i){
        System.out.println("Возвращаю элемент");
        return a[i];
    }

    @Override
    public boolean add(int val){
        if (size != a.length){
            System.out.println("Добавляю элемент");

            a[size] = val;
            size++;
            return true;
        }else
            return false;
    }
}
