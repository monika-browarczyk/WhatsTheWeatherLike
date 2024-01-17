package com.weather.weatherclient;

import org.springframework.web.util.UriComponentsBuilder;

public interface IWeatherClientSettings {
    String getApiKey();
    String getBaseUrl();
    double getApiVersion();
    String getApiUnits();
    String getApiLang();

    default UriComponentsBuilder getUrlBuilder(double lat, double lon) {
        return UriComponentsBuilder
                .newInstance()
                .scheme("http")
                .host(getBaseUrl())
                .pathSegment("data", String.valueOf(getApiVersion()), "forecast")
                .queryParam("lat", lat)
                .queryParam("lon", lon)
                .queryParam("apiid", getApiKey())
                .queryParam("units", getApiUnits())
                .queryParam("lang", getApiLang());
    }
}
