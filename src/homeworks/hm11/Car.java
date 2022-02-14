package homeworks.hm11;

import p1.p2.p3.C;

public class Car {
    String color;
    String engine;
    int carDoor;

    Car(String color, String engine, int carDoor){
        this.color = color;
        this.engine = engine;
        this.carDoor = carDoor;
    }

}
class CarTest{
    public static void numberOfDoors(Car car1, int cadDoor){
        car1.carDoor = cadDoor;
    }
    public static void colorReplacement(Car car1, Car car2){
        String color = car1.color;
        car1.color = car2.color;
        car2.color = color;

    }

    public static void main(String[] args) {
        Car car999 = new Car("Red", "1.6", 2);
        Car car111 = new Car("Желтый", "1.6", 3);
        Car car222 = new Car("black", "1.6", 4);
        Car car333 = new Car("Red", "1.6", 5);

        System.out.println(car999.carDoor);
        System.out.println(car111.carDoor);
        System.out.println(car222.carDoor);
        System.out.println(car333.carDoor);

        numberOfDoors(car999, 10);
        numberOfDoors(car111,15);

        System.out.println(car999.carDoor);
        System.out.println(car111.carDoor);
        System.out.println(car222.carDoor);
        System.out.println(car333.carDoor);

        System.out.println(car111.color);
        System.out.println(car222.color);

        colorReplacement(car111, car222);

        System.out.println(car111.color);
        System.out.println(car222.color);



    }

}
