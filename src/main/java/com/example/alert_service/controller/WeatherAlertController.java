package com.example.alert_service.controller;

import com.example.alert_service.domain.WeatherAlert;
import com.example.alert_service.service.WeatherAlertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

// https://api.weatherbit.io/v2.0/alerts?lat=49.8209&lon=18.2625&key=9b048f06cc0449a095e8bfc3067db3aa
// http://localhost:8080/fetch-alerts?latitude=49.8209&longitude=18.2625

@RestController
public class WeatherAlertController {
    @Autowired
    private WeatherAlertService weatherAlertService;

//    @Value("${other.service.url}")
//    private String otherServiceUrl;
//
//    private final RestTemplate restTemplate;
//
//    @Autowired
//    public WeatherAlertController(RestTemplate restTemplate) {
//        this.restTemplate = restTemplate;
//    }
//
//    @GetMapping("/fetch-alerts")
//    public String fetchAndSendAlerts(@RequestParam String location) {
//        WeatherAlert alerts = weatherAlertService.getWeatherAlerts(location);
//        // Send alerts to another microservice
//        String response = restTemplate.postForObject(otherServiceUrl, alerts, String.class);
//        return response;
//    }


    @GetMapping("/fetch-alerts")
    public WeatherAlert fetchWeatherAlerts(@RequestParam Double latitude, @RequestParam Double longitude) {
        WeatherAlert alerts = weatherAlertService.getWeatherAlerts(latitude, longitude);
        return alerts; // Return the retrieved alerts
    }
}
