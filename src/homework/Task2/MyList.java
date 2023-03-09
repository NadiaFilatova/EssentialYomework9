package homework.Task2;

//Створіть проект за допомогою IntelliJ IDEA. Створіть клас MyList.
// Реалізуйте у найпростішому наближенні можливість використання його екземпляра аналогічно екземпляру класу List.
// Мінімально необхідний інтерфейс взаємодії з екземпляром повинен включати метод додавання елемента,
// індексатор для отримання значення елемента за вказаним індексом і властивість тільки для читання для
// отримання загальної кількості елементів.
public class MyList<T> {
    private final int INIT_SIZE = 6;
    private Object[] array = new Object[INIT_SIZE];
    private int pointer = 0;

    public void add(T item) {
        if (pointer == array.length - 1) {
            resize(array.length + INIT_SIZE);
        }
        array[pointer++] = item;
    }

    public T get(int index) {
        if (index > pointer - 1) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return (T) array[index];
    }

    public int size() {
        return pointer;
    }

    private void resize(int newLength) {
        Object[] newArray = new Object[newLength];
        System.arraycopy(array, 0, newArray, 0, pointer);
        array = newArray;
    }
}

