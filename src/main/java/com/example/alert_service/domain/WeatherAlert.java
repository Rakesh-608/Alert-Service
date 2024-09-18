package com.example.alert_service.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class WeatherAlert {

    private double lat;
    private double lon;
    private String timezone;
    private String cityName;
    private String stateCode;
    private String countryCode;
    private List<Alert> alerts;

//    // Getters and Setters
//
//    public double getLat() {
//        return lat;
//    }
//
//    public void setLat(double lat) {
//        this.lat = lat;
//    }
//
//    public double getLon() {
//        return lon;
//    }
//
//    public void setLon(double lon) {
//        this.lon = lon;
//    }
//
//    public String getTimezone() {
//        return timezone;
//    }
//
//    public void setTimezone(String timezone) {
//        this.timezone = timezone;
//    }
//
//    public String getCityName() {
//        return cityName;
//    }
//
//    public void setCityName(String cityName) {
//        this.cityName = cityName;
//    }
//
//    public String getStateCode() {
//        return stateCode;
//    }
//
//    public void setStateCode(String stateCode) {
//        this.stateCode = stateCode;
//    }
//
//    public String getCountryCode() {
//        return countryCode;
//    }
//
//    public void setCountryCode(String countryCode) {
//        this.countryCode = countryCode;
//    }
//
//    public List<Alert> getAlerts() {
//        return alerts;
//    }
//
//    public void setAlerts(List<Alert> alerts) {
//        this.alerts = alerts;
//    }
//
}
