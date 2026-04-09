package ru.netology.userservice.model;


import lombok.Data;

@Data
public class User {
    private Integer id;
    private String name;
    private String address;
    private String phoneNumber;
    private String email;


    public User() {
    }

    public User(Integer id, String name, String address, String phoneNumber, String email) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}