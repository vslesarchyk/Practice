package by.practice.tasks.task15.repository;

import by.practice.tasks.task15.entity.User;
import by.practice.tasks.task15.exception.UserNotFoundException;

import java.util.ArrayList;
import java.util.List;

//2. Создать класс UserRepository. Внутри класса создать статическую переменную List<User> users.
public class UserRepository {
    public static List<User> users = new ArrayList<>();
//3. Выполнить инициаизацию коллекции в статическом блоке. Создать 5 пользователей и заполнить поля.
    static {
        User user1 = new User("Masha", "12334", "Маша", "Иванова");
        User user2 = new User("Sasha", "12355", "Cаша", "Петрова");
        User user3 = new User("Dasha", "12356", "Даша", "Сергеева");
        User user4 = new User("Ivan", "12357", "Иван", "Иванов");
        User user5 = new User("Petr", "12368", "Петр", "Петров");

        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);
    }

    public User searchUserByLogin (String login) {
        for (User user: users){
            if(user.getLogin().equals(login)){
                return user;
            }
        }
        throw new UserNotFoundException("Пользователь с таким логином не найден");
    }
}
