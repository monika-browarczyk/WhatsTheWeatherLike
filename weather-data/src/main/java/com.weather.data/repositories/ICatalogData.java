package com.weather.data.repositories;

public interface ICatalogData {
    CityRepository getCityRepository();
    CoordRepository getCoordRepository();
    ForecastRepository getForecastRepository();
    MainInfoRepository getMainInfoRepository();
    WeatherDataRepository getWeatherDataRepository();

}
