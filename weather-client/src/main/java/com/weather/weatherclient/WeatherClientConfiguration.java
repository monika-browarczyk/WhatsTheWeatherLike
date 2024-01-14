package com.weather.weatherclient;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WeatherClientConfiguration {
    public IWeatherClientSettings getSettings(
            @Value("${themoviedb.api.key}") String apiKey,
            @Value("${themoviedb.api.host}") String host,
            @Value("${themoviedb.api.version}") int apiVersion,
            @Value("${themoviedb.api.units}") String apiUnits,
            @Value("${themoviedb.api.lang}") String apiLang) {
        return new WeatherClientSettings();

    }
}
