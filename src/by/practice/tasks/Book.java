package by.practice.tasks;


import java.util.Objects;

//3. Условие: Создай класс Book с полями:
//•	String title
//•	String author
//3.1. Создайте 3 книги. И добавьте эти книги в коллекцию. Используйте метод List.of();
//3.2 Переоперделите метод equals на книгах так,чтобы он всегда возвращал false
//3.3. Удалите 1 книгу из коллекции. Выведите все книги и проанализируйте результат.
public class Book {
    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

//    @Override
//    public boolean equals(Object o) {
//        Book book = (Book) o;
//        if (title.equals(book.getTitle())){
//            return true;
//        }
//        return false;
//    }


    @Override
    public boolean equals(Object o) {
        Book book = (Book) o;
        if (title.equals(book.getTitle())){
            return true;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return author.hashCode() + title.hashCode();
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}

