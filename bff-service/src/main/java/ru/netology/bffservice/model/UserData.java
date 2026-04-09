package ru.netology.bffservice.model;

import lombok.Data;
import org.springframework.core.annotation.Order;

import java.util.List;

@Data
public class UserData {
    private UserProfile user;
    private List<Order> orders;

    public UserData(UserProfile user, List<Order> orders) {
        this.user = user;
        this.orders = orders;
    }

    public UserData() {
    }

}
