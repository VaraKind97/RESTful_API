package ru.netology.orderservice.model;

import lombok.Data;

import java.util.List;

@Data
public class Order {
    private Integer id;
    private Integer userId;
    private double amount;
    private String currency;
    private List<OrderItem> items;

    public Order() {
    }

    public Order(Integer id, Integer userId, double amount,
                 String currency, List<OrderItem> items) {
        this.id = id;
        this.userId = userId;
        this.amount = amount;
        this.currency = currency;
        this.items = items;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}