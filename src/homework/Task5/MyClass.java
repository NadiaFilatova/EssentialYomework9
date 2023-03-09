package homework.Task5;

//Створіть проект за допомогою IntelliJ IDEA. Створіть клас MyClass, що містить статичний фабричний метод -
// T factoryMethod(), який породжуватиме екземпляри типу,
// зазначеного як параметр типу (покажчика місця заповнення типом – Т).

public class MyClass <T> {
    private T value;

    public MyClass(T value) {
        this.value = value;
    }

    public static <T> MyClass<T> factoryMethod(T value) {
        return new MyClass<>(value);
    }

    @Override
    public String toString() {
        return "MyClass{" +
                "value=" + value +
                '}';
    }
}
