package by.practice.tasks.task15;


//1. Заполнить HashMap 10 объектами <Integer, String>. Найти строки у которых ключ>5. Если ключ = 0, вывести строки через запятую. Перемножить все ключи, где длина строки>5.

import by.practice.tasks.task15.exception.NotCorrectPasswordException;
import by.practice.tasks.task15.exception.UserNotFoundException;
import by.practice.tasks.task15.service.UserService;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "string1");
        map.put(2, "string2");
        map.put(3, "string3");
        map.put(6, "string4");
        map.put(7, "string5");

        Set<Integer> keys = map.keySet();
        Integer var = 1;
        for (Integer i : keys) {
            if (i > 5) {
                System.out.println(map.get(i));
            }
            if (i == 0) {
                System.out.println(map.values());
            }
            String val = map.get(i);
            if (val.length() > 5) {
                var = i * var;
            }
        }
        System.out.println(var);

        authenticating();
    }

//5. В этом же методе выполнить проверку пароля пользователя, если по логину мы его нашли. Если пароль не совпадает, то выбрасываем собственное исключение NotCorrectPasswordException.
//6. В классе main при вызове метода аутенфикации перехватите исключение UserNotFoundException и выведите в консоль (нет пользователя)
//7. Также перехватите оставшиеся исключения и в блоке catch выведите в консоль сообщение (Вы не прошли аутенфикацию)

    public static void authenticating() {
        try {
            UserService userService = new UserService();
            userService.authenticate("Masha", "gggg");
        } catch (NotCorrectPasswordException notCorrectPasswordException) {
            System.out.println("Вы не прошли аутенфикацию");
        } catch (UserNotFoundException userNotFoundException) {
            System.out.println("Нет пользователя");
        }
    }
}


