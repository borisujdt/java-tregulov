package lessons.lesson9;

public class Car {
    String color;
    public static int ab = 10;
    String engine;
    public static int count;


    public Car(String color, String engine){
        count++;
        this.color = color;
        this.engine = engine;
    }
   void changeColor(String color){
       System.out.println(this.color);
   }

    public static void main(String[] args) {
        Car c = new Car("red","V6");
        System.out.println(c.color);
        c.changeColor("black");
        System.out.println(c.color);
    }
}



