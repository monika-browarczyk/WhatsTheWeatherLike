package com.weather.data.model;
import jakarta.persistence.*;
import java.time.Instant;
import java.util.List;

@Entity
public class Forecast {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer cod;
    private Double message;
    private Integer countDays;

    @ManyToOne
    @JoinColumn(name = "city_id")
    private City city;

    @OneToMany(mappedBy = "forecast", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<WeatherData> weatherDataList;
}
