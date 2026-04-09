package ru.netology.orderservice.service;

import ru.netology.orderservice.model.Order;
import ru.netology.orderservice.model.OrderItem;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class OrderService {
    private final List<Order> orders;

    public OrderService() {
        orders = new ArrayList<>();
        orders.add(new Order(1, 1, 200.50, "RUB",
                List.of(new OrderItem("Лэптоп", 1, new BigDecimal("50000")))));
        orders.add(new Order(2, 2, 200.00, "RUB",
                List.of(new OrderItem("Планшет", 1, new BigDecimal("70000")))));
    }

    public List<Order> getOrdersByUserId(Integer userId) {
        return orders.stream()
                .filter(order -> order.getUserId().equals(userId))
                .collect(Collectors.toList());
    }

    public Optional<Order> getOrderById(Integer orderId) {
        try {
            int index = Integer.parseInt(String.valueOf(orderId)) - 1;
            if (index < 0 || index >= orders.size()) {
                return Optional.empty();
            }
            return Optional.of(orders.get(index));
        } catch (NumberFormatException e) {
            return Optional.empty();
        }
    }

    public List<Order> getAllOrders() {
        return orders;
    }
}
