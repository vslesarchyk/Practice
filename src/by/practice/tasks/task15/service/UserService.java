package by.practice.tasks.task15.service;

import by.practice.tasks.task15.entity.User;
import by.practice.tasks.task15.exception.NotCorrectPasswordException;
import by.practice.tasks.task15.repository.UserRepository;

//4. Создать класс сервис. Реализовать в этом классе метод аутенфикации  пользователя (void authenticate (String login, String password). Этот метод должен проверять наличие пользователя в репозитории по логину. Если пользователя нет, то выбрасываем собственное исключение (UserNotFoundException)

public class UserService {
    public User authenticate (String login, String password){
        UserRepository userRepository = new UserRepository();
        User user = userRepository.searchUserByLogin(login);
        if (user.getPassword().equals(password)){
            return user;
                    }
        throw new NotCorrectPasswordException("Пароль не совпадает");

    }
}
