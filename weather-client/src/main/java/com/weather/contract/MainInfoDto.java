package com.weather.contract;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MainInfoDto {
    private Double temp;
    @JsonProperty("feels_like")
    private Double windChill;
    @JsonProperty("temp_min")
    private Double tempMin;
    @JsonProperty("temp_max")
    private Double tempMax;
    private Integer pressure;
    private Integer humidity;
}
