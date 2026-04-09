package ru.netology.userservice.controller;

import ru.netology.userservice.model.User;
import ru.netology.userservice.service.UserService;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{userId}")
    public User getUserById(@PathVariable Integer userId) {
        return userService.getUserById(userId);
    }
}