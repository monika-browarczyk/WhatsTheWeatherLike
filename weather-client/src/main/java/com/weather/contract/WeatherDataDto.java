package com.weather.contract;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WeatherDataDto {
    @JsonProperty("main")
    private MainInfoDto mainInfoDto;
    private Integer visibility;
    @JsonProperty("pop")
    private Double precipitationProbability;
    private Double rain;

}
