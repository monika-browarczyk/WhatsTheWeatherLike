package com.weather.weatherclient;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;

@NoArgsConstructor
public class WeatherClientSettings implements IWeatherClientSettings {
    @Value("${openweathermap.api.key}")
    private String apiKey;
    @Value("${openweathermap.api.host}")
    private String baseUrl;
    @Value("${openweathermap.api.version}")
    private int apiVersion;
    @Value("${openweathermap.api.units}")
    private String apiUnits;
    @Value("${openweathermap.api.lang}")
    private String apiLang;

    public WeatherClientSettings(String apiKey, String baseUrl, int apiVersion, String apiUnits, String apiLang) {

        this.apiKey = apiKey;
        this.baseUrl = baseUrl;
        this.apiVersion = apiVersion;
        this.apiUnits = apiUnits;
        this.apiLang = apiLang;
    }

    @Override
    public String getApiKey() {
        return apiKey;
    }

    @Override
    public String getBaseUrl() {
        return baseUrl;
    }

    @Override
    public int getApiVersion() {
        return apiVersion;
    }

    @Override
    public String getApiUnits() { return apiUnits; }

    @Override
    public String getApiLang() { return apiLang; }
}
