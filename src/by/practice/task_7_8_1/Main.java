package by.practice.task_7_8_1;

public class Main {
           public static void main(String[] args) {
// 4. В классе main создать массив из пяти книг
            Book[] books = new Book[5];
            books[0] = new Book(1, "Java для начинающих", "Герберт Шилдт", "Эксмо", 2019, 720, 1200.50);
            books[1] = new Book(2, "Effective Java", "Joshua Bloch", "Addison-Wesley", 2008, 416, 1500.00);
            books[2] = new Book(3, "Чистый код", "Robert Martin", "Питер", 2009, 464, 1300.00);
            books[3] = new Book(4, "Программист-прагматик", "Andrew Hunt", "O'Reilly", 1999, 352, 1100.00);
            books[4] = new Book(5, "Head First Java", "Kathy Sierra", "O'Reilly", 2011, 688, 1000.00);

 // Вывод информации о всех книгах
            for (Book book : books) {
                book.info();
            }

            // Изменение цены на первую книгу
            books[0].changePrice(999.99);
            System.out.println("После изменения цены:");
            books[0].info();

            // Книги, изданные до 2010 года
            System.out.println("Книги, изданные до 2010 года:");
            Book[] oldBooks = Book.getBooksBeforeYear(books, 2010);
            for (Book book : oldBooks) {
                book.info();
            }
        }
    }
