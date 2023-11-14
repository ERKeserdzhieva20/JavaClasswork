public class Person {
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String Name;
    private int age;

    public Person(String name, int Age) {
        this.Name = name;
        this.age = Age;
    }
}
