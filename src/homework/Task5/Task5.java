package homework.Task5;

public class Task5 {
    public static void main(String[] args) {
        MyClass<String> s = MyClass.factoryMethod("str");
        System.out.println(s);
        MyClass<Integer> i = MyClass.factoryMethod(345);
        System.out.println(i);
        MyClass<Test> test = MyClass.factoryMethod(new Test("dd", 33));
        System.out.println(test);
    }
}
class Test {
    private String name;
    private int age;
    public Test(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return "Test{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}