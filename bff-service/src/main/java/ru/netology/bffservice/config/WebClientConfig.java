package ru.netology.bffservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static org.springframework.web.reactive.function.client.WebClient.*;

@Configuration
public class WebClientConfig {

    @Bean
    public Builder webClientBuilder() {
        return builder();
    }
}
