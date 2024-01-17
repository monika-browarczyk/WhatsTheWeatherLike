package com.weather.updater.controller;

import com.weather.weatherclient.WeatherClientSettings;
import com.weather.webApi.service.WeatherDataService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

@SuppressWarnings("ALL")
@RestController
@RequiredArgsConstructor
public class WeatherDataController {
    @Autowired
    private final WeatherClientSettings weatherClientSettings;
    @Autowired
    private final WeatherDataService weatherService;

    @GetMapping("/weather")
    public String getWeatherInfo(@RequestParam double lat, @RequestParam double lon) {
        UriComponentsBuilder apiUrlBuilder = weatherClientSettings.getWeatherApiUrlBuilder(lat, lon);

        // You can now use apiUrlBuilder to append additional query parameters if needed

        // For example:
        // apiUrlBuilder.queryParam("additionalParam", "value");

        String apiUrl = apiUrlBuilder.toUriString();

        // Now, you can make a request to the constructed API URL

        return "API URL: " + apiUrl;
    }
    //i have get mapping now add post mapping
}
