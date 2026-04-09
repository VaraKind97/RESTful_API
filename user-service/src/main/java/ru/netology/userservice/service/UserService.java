package ru.netology.userservice.service;

import ru.netology.userservice.model.User;
import org.springframework.stereotype.Service;

import java.util.concurrent.ConcurrentHashMap;

@Service
public class UserService {
    private final ConcurrentHashMap<Integer, User> users = new ConcurrentHashMap<>();

    {
        users.put(1, new User(11, "Андрей Соколов", "МО, ул. Лесная 17", "+79776352975", "mail@test.ru"));
        users.put(2, new User(22, "Алексей Мересьев", "СПБ, ул. Ленина 38", "+7999654535", "mail@test.ru"));
        users.put(3, new User(33, "Тамара Иванова", "ЕКБ, ул. Пушкина 4", "+7912312557", "mail@test.ru"));
    }

    public User getUserById(Integer userId) {
        for (User user : users.values()) {
            if (userId.equals(user.getId())) {
                return user;
            }
        }
        return null;
    }
}
