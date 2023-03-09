package homework.Task2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        MyList<String> list = new MyList<>();
        System.out.println("Заповніть масив та для закінчення операції введіть exit");

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        while (!"exit".equalsIgnoreCase(s)) {
            list.add(s);
            s = scanner.nextLine();
        }

        System.out.println("Загальнa кількость елементів: " + list.size());
        System.out.print("Введіть індекс для отримання значення елемента ");
        int index = scanner.nextInt();
        System.out.println("Значення елемента за індексом " + index + " = " + list.get(index));

        System.out.println("Вміст усього масиву: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}