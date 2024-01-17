package com.weather.updater.mapper;

import com.weather.contract.WeatherDataDto;
import com.weather.data.model.WeatherData;
import org.springframework.stereotype.Component;

@Component
public class WeatherDataMapper implements IMapEntities<WeatherDataDto, WeatherData> {
    @Override
    public WeatherData map(WeatherDataDto weatherDataDto) {
        return map(weatherDataDto, new WeatherData());
    }

    @Override
    public WeatherData map(WeatherDataDto weatherDataDto, WeatherData weatherData) {
        weatherData.setMainInfo(weatherDataDto.getMainInfo());
        weatherData.setRain(weatherDataDto.getRain());
        return weatherData;
    }

}
