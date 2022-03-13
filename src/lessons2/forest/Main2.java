package lessons2.forest;

public class Main2 {
    public static void main(String[] args) {
        Array array = new MyArray2();

        MyArray myArray = new MyArray();

        System.out.println(array.add(3));
        System.out.println(array.add(23));
        System.out.println(array.add(34));
        System.out.println(array.add(7));
        System.out.println(array.add(8));
        System.out.println(array.get(3));

        System.out.println(myArray.add(3));
        System.out.println(myArray.add(23));
        System.out.println(myArray.add(34));
        System.out.println(myArray.add(7));
        System.out.println(myArray.add(8));
        System.out.println(myArray.get(3));

    }
}
