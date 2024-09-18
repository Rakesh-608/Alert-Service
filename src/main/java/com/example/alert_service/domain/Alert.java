package com.example.alert_service.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
public class Alert {

    private String title;
    private String description;
    private String severity;

    @JsonProperty("effective_utc")
    private String effectiveUtc;

    @JsonProperty("effective_local")
    private String effectiveLocal;

    @JsonProperty("expires_utc")
    private String expiresUtc;

    @JsonProperty("expires_local")
    private String expiresLocal;

    @JsonProperty("onset_utc")
    private String onsetUtc;

    @JsonProperty("onset_local")
    private String onsetLocal;

    @JsonProperty("ends_utc")
    private String endsUtc;

    @JsonProperty("ends_local")
    private String endsLocal;

    private String uri;
    private List<String> regions;

    // Getters and Setters

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public String getEffectiveUtc() {
        return effectiveUtc;
    }

    public void setEffectiveUtc(String effectiveUtc) {
        this.effectiveUtc = effectiveUtc;
    }

    public String getEffectiveLocal() {
        return effectiveLocal;
    }

    public void setEffectiveLocal(String effectiveLocal) {
        this.effectiveLocal = effectiveLocal;
    }

    public String getExpiresUtc() {
        return expiresUtc;
    }

    public void setExpiresUtc(String expiresUtc) {
        this.expiresUtc = expiresUtc;
    }

    public String getExpiresLocal() {
        return expiresLocal;
    }

    public void setExpiresLocal(String expiresLocal) {
        this.expiresLocal = expiresLocal;
    }

    public String getOnsetUtc() {
        return onsetUtc;
    }

    public void setOnsetUtc(String onsetUtc) {
        this.onsetUtc = onsetUtc;
    }

    public String getOnsetLocal() {
        return onsetLocal;
    }

    public void setOnsetLocal(String onsetLocal) {
        this.onsetLocal = onsetLocal;
    }

    public String getEndsUtc() {
        return endsUtc;
    }

    public void setEndsUtc(String endsUtc) {
        this.endsUtc = endsUtc;
    }

    public String getEndsLocal() {
        return endsLocal;
    }

    public void setEndsLocal(String endsLocal) {
        this.endsLocal = endsLocal;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public List<String> getRegions() {
        return regions;
    }

    public void setRegions(List<String> regions) {
        this.regions = regions;
    }
}
