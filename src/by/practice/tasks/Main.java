package by.practice.tasks;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
//       task1();
//       task2();
      task3();
    }

    public static void task1() {
        //1.1.Создать коллекцию List (реализация ArrayList). Типизация коллекции – String.
        List<String> list = new ArrayList<>();
//1.2 Добавить  пару записей (Привет, Как дела, Праздник, Суфле)

        String string1 = "Привет";
        String string2 = "Как дела";
        String string3 = "Праздник";
        String string4 = "Суфле";

        list.add(string1);
        list.add(string2);
        list.add(string3);
        list.add(string4);

//1.3	Вывести все записи.
        for (String s : list) {
            System.out.println(list);
        }

//1.4	Проверить, содержит ли коллекция слово Конфета

        boolean containsCandy = list.contains("Конфета");
        System.out.println(containsCandy);


//  1.5 Посчитать количество элементов в коллекции

        int size = list.size();
        System.out.println(size);
    }

//2. Условие: Создайте ArrayList<String> для хранения списка покупок. Добавь в него 5 товаров. Затем выведите весь список на экран, а после — удалите один товар по названию и снова выведите обновлённый список.

    public static void task2() {
//        List<String> purchases = List.of("Молоко", "Хлеб", "Батон", "Конфеты", "Зефир"); для чтения
        List<String> purchases = new ArrayList<>();
        String purchase1 = "Молоко";
        String purchase2 = "Хлеб";
        String purchase3 = "Батон";
        String purchase4 = "Конфеты";
        String purchase5 = "Зефир";

        purchases.add(purchase1);
        purchases.add(purchase2);
        purchases.add(purchase3);
        purchases.add(purchase4);
        purchases.add(purchase5);
        printList(purchases);
        purchases.remove("Молоко");
        printList(purchases);
    }

    private static void printList(List<String> purchases) {
        for (String purch : purchases) {
            System.out.println(purch);
        }
    }

    public static void task3() {
//        Book book1 = new Book("Преступление", "Достоевский");
//        Book book2 = new Book("Мастер и Маргарита", "Булгаков");
//        Book book3 = new Book("Война и мир", "Толстой");
//
//        List<Book> books = new ArrayList<>();
//        books.add(book1);
//        books.add(book2);
//        books.add(book3);
//        books.remove(book2);
//        for (Book book : books) {
//            System.out.println(book);
//        }


        Book book1 = new Book("Преступление", "Достоевский");
        Book book2 = new Book("Мастер и Маргарита", "Булгаков");
        Book book3 = new Book("Наказание", "Достоевский");

        Set<Book> books = new HashSet<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
         for (Book book : books) {
            System.out.println(book);
        }
    }
}
