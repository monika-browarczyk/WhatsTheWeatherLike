package com.weather.weatherclient;

import org.springframework.web.util.UriComponentsBuilder;

public interface IWeatherClientSettings {
    String getApiKey();

    String getBaseUrl();

    int getApiVersion();

    String getApiUnits();
    String getApiLang();

    default UriComponentsBuilder getUrlBuilder(){
        return UriComponentsBuilder
                .newInstance()
                .scheme("http")
                .host(getBaseUrl())
                .pathSegment(getApiVersion() + "")
                .queryParam("api_key", getApiKey())
                .pathSegment("units", getApiUnits());

    }
}
