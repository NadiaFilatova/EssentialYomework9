package homework.Tast3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

//Створіть проект за допомогою IntelliJ IDEA.
// Створіть клас MyDictionary. Реалізуйте у найпростішому наближенні можливість використання його екземпляра.
// Мінімально необхідний інтерфейс взаємодії з екземпляром повинен включати метод додавання пар елементів,
// індексатор для отримання значення елемента за вказаним індексом і властивість тільки для читання для
// отримання загальної кількості пар елементів.
public class MyDictionary<K, V> {
    private final Set<Entry<K, V>> entries;

    // Конструктор.
    public MyDictionary() {
        this.entries = new HashSet<>();
    }

    public Set<Entry<K, V>> entrySet() {
        return this.entries;
    }

    public int size() {
        return this.entries.size();
    }

    public void put(K key, V value) {
        Entry<K, V> entry = new Entry<>(key, value);
        this.entries.add(entry);
    }

    public V get(K key) {
/*
        return this.entries.stream()
                .filter(entry -> entry.getKey().equals(key))
                .findFirst()
                .map(Entry::getValue)
                .orElse(null);
*/
        for (Entry<K, V> entry : this.entries) {
            if (entry.getKey().equals(key)) {
                return entry.getValue();
            }
        }
        return null;
    }

    public V getOrDefault(K key, V defaultValue) {
        V value = get(key);
        if (value == null) {
            return defaultValue;
        }
        return value;
    }

    public V getByIndex(int index) {
        Iterator<Entry<K, V>> entryIterator = this.entries.iterator();
        for (int indexCounter = 0; entryIterator.hasNext(); indexCounter++) {
            Entry<K, V> current = entryIterator.next();
            if (index == indexCounter) {
                return current.getValue();
            }
        }
        return null;
    }

    public static class Entry<K, V> {
        private K key;
        private V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Entry<?, ?> entry = (Entry<?, ?>) o;
            return getKey().equals(entry.getKey());
        }

        @Override
        public int hashCode() {
            return Objects.hash(getKey());
        }

        @Override
        public String toString() {
            return "MyDictionary.Entry{key=" + this.key + ", value=" + this.value + "}";
        }
    }
}
