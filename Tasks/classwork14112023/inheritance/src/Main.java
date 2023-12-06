import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Make a constructor
        Human human = new Human("Dragan", 20);
        //human.setAge(-10); - for testing out negative values (there is an if in the setter)

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        //explanation for replecaeAll
        String str = new String("old String");
        System.out.println(str);
        str.replaceAll("old", "new");
        System.out.println(str);

        //explanation with list (printing the size of the List and adding elements)
        System.out.println(human.getCars().size());

        human.getCars().add("Opel");
        human.getCars().add("Mercedes");

    }
}