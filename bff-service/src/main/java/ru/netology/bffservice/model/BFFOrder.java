package ru.netology.bffservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BFFOrder {
    private String id;
    private double amount;
    private String currency;
    private List<Item> items;
}
