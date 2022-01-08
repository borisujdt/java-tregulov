package lessons.lesson5;

public class Car3 {
    String color;
    String engine;
    int maxSpeed;

    public Car3(String color, String engine, int maxSpeed) {
        this.color = color;
        this.engine = engine;
        this.maxSpeed = maxSpeed;
    }

    public Car3(String engine) {
        this.engine = engine;
    }

    Car3(){

    }

    public void start(){
        System.out.println("Машина с цветом "+color+" и с двигателем "+engine+" завелась");
    }

    public String getColor() {
        return color;
    }
}

class Car3Test {
    public static void main(String[] args) {
        Car3 nexia = new Car3("black", "V6", 120);
        System.out.println("Цвет: "+nexia.color+"\nдвигатель: "+nexia.engine
                            +"\nмакс. скорость: "+nexia.maxSpeed);

        Car3 lada = new Car3("blue33333333333333333", "v8", 100);


        nexia.start();
        lada.start();
        System.out.println("----------------------------");

        System.out.println("Привет");

        String slovo = "Проверочное слово";

        System.out.println(slovo);

        String colorNexia = nexia.getColor(); // String colorNexia = "black";
        System.out.println(colorNexia);

          // "black"

//        System.out.println(nexia.getColor());
    }

}