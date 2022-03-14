package lessons2.lesson3;

import lessons2.lesson3.packet1.Cat;
import p4.D;

public class Test2 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();

        test(animal);
        test(dog);
        test(cat);

    }
    public static void test(Animal animal){
        animal.eat();

    }
}
