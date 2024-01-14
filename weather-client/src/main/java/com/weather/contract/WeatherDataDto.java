package com.weather.contract;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class WeatherDataDto {
    @JsonProperty("main")
    private MainInfoDto mainInfoDto;
    private Integer visibility;
    @JsonProperty("pop")
    private Double precipitationProbability;
    private Double rain;
}
