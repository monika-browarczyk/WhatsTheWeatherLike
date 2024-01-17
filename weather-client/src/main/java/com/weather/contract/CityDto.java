package com.weather.contract;

import lombok.Data;

public class CityDto {
    private String name;
    private String country;
    private CoordDto coord;
    private Integer timezone;
    private Integer population;
}
