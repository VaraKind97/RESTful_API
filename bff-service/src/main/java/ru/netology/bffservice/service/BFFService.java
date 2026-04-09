package ru.netology.bffservice.service;

import org.springframework.core.annotation.Order;
import ru.netology.bffservice.model.UserData;
import ru.netology.bffservice.model.UserProfile;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;
import java.util.Optional;

@Service
public class BFFService {
    private static final String USERS_SERVICE_URL = "http://localhost:8081";
    private static final String ORDERS_SERVICE_URL = "http://localhost:8082";
    private final WebClient.Builder webClientBuilder;

    public BFFService(WebClient.Builder webClientBuilder) {
        this.webClientBuilder = webClientBuilder;
    }

    public Optional<UserData> getUserData(Integer userId) {
        try {
            UserProfile user = webClientBuilder.build()
                    .get()
                    .uri(USERS_SERVICE_URL + "/api/users/" + userId)
                    .retrieve()
                    .bodyToMono(UserProfile.class)
                    .block();

            List<Order> orders = webClientBuilder.build()
                    .get()
                    .uri(ORDERS_SERVICE_URL + "/api/orders/by-user/" + userId)
                    .retrieve()
                    .bodyToMono(new ParameterizedTypeReference<List<Order>>() {
                    })
                    .block();

            return Optional.of(new UserData(user, orders));
        } catch (Exception e) {
            return Optional.empty();
        }
    }
}
