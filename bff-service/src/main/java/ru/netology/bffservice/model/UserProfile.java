package ru.netology.bffservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserProfile {
    private String id;
    private String name;
    private String address;
    private String phoneNumber;
    private String email;
}
