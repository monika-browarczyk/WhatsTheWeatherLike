package com.weather.data.model;

import jakarta.persistence.*;

@Entity
public class MainInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double temp;
    private Double windChill;
    private Double tempeMin;
    private Double tempMax;
    private Integer pressure;
    private Integer humidity;
}
