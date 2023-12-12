import javax.annotation.processing.SupportedSourceVersion;

public class Dog extends Mammal{
    public void bark() {
        System.out.println("Bark");
    }

    @Override
    public void eat(String food)
    {
        System.out.println("Eating + foor");
    }

    @Override
    public void walk() {
        System.out.println("Walking..");
    }

}
