import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Code for Person and Child classes

//        Scanner scanner = new Scanner(System.in);
//        String name = scanner.nextLine();
//        int age = Integer.parseInt((scanner.nextLine()));
//
//        Child child = new Child(name, age);
//        System.out.println(child.getName());
//        System.out.println(child.getAge());


        //Code for classes Vehicle and car
        Vehicle vechile = new Vehicle(100, 100);
        Car car = new Car(100, 100);

        vechile.drive(100);
        car.drive(100);
    }
}