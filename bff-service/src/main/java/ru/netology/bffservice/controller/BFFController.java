package ru.netology.bffservice.controller;

import org.springframework.http.HttpStatus;
import ru.netology.bffservice.model.UserData;
import ru.netology.bffservice.service.BFFService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;


@RestController
@RequestMapping("/api/site-bff")
public class BFFController {
    private final BFFService bffService;

    public BFFController(BFFService bffService) {
        this.bffService = bffService;
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<Optional<UserData>> getUserData(@PathVariable Integer userId) {
        try {
            Optional<UserData> profile = bffService.getUserData(userId);
            return ResponseEntity.ok(profile);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}
