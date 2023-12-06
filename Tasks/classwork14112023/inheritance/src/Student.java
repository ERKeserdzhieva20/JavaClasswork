public class Student extends Human{

    public Student(String name, int age) {
        super(name, age);
    }

    public void Test() {
        //super.name ako e private ne stava, ako e protected, stava
        super.name = "Sadsa";
    }
}
