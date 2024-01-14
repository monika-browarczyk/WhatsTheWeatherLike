package com.weather.data.repositories;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@Getter
@RequiredArgsConstructor
public class WeatherDataCatalog implements ICatalogData {
    private CityRepository cityRepository;
    private CoordRepository coordRepository;
    private ForecastRepository forecastRepository;
    private MainInfoRepository mainInfoRepository;
    private WeatherDataRepository weatherDataRepository;
    }
