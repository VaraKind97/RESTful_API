package ru.netology.orderservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class OrderItem {
    private String productName;
    private Integer quantity;
    private BigDecimal price;

    public OrderItem() {
    }

    // Новый конструктор с параметрами
    public OrderItem(String name, int quantity, BigDecimal price) {
        this.productName = name;
        this.quantity = quantity;
        this.price = price;
    }
}
