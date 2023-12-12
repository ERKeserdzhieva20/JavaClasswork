import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Mammal mammal = new Dog();
        Animal animal = new Dog();

        /*
        List<Integer> ints = new ArrayList<>();

        animal.eat("Meat");
        if (animal instanceof Dog) {
            ((Dog) animal).bark();
        }

        */
        Puppy puppy = new Puppy();
        dog.bark();
        puppy.bark();

    }
}