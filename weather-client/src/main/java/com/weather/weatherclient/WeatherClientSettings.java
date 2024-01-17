package com.weather.weatherclient;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.util.UriComponentsBuilder;

@Component
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class WeatherClientSettings implements IWeatherClientSettings {
    @Value("${openweathermap.api.key}")
    private String apiKey;
    @Value("${openweathermap.api.host}")
    private String baseUrl;
    @Value("${openweathermap.api.version}")
    private double apiVersion;
    @Value("${openweathermap.api.units}")
    private String apiUnits;
    @Value("${openweathermap.api.lang}")
    private String apiLang;
    public UriComponentsBuilder getWeatherApiUrlBuilder(double lat, double lon) {
        return getUrlBuilder(lat, lon);
    }

}
