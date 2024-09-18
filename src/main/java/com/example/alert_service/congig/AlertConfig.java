package com.example.alert_service.congig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AlertConfig {
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}

