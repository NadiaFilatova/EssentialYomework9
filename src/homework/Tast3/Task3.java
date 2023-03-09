package homework.Tast3;

public class Task3 {
    public static void main(String[] args) {
        MyDictionary<Integer, String> map = new MyDictionary<>();
        map.put(1, "hello");
        map.put(4, "some value");
        map.put(6, "dd");
        map.put(55, "abcd");
        map.put(8, "lll");

        String s1 = map.get(4);
        System.out.println(s1);

        String s2 = map.getOrDefault(10, "default value");
        System.out.println(s2);

        String s3 = map.getByIndex(3);
        System.out.println(s3);

        System.out.println("My dictionary size: " + map.size());
        for (MyDictionary.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry);
        }
    }
}
