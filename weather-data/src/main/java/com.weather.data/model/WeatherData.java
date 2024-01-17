package com.weather.data.model;
import jakarta.persistence.*;
import lombok.Data;


import java.time.Instant;

@Entity
@Data
public class WeatherData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Instant dt;

    @ManyToOne
    @JoinColumn(name = "main_id")
    private MainInfo mainInfo;

//    @OneToMany(mappedBy = "weatherDate", cascade = CascadeType.ALL, orphanRemoval = true)
//    private List<Weather> weather;
//
//    @ManyToOne
//    @JoinColumn(name = "clouds_id")
//    private Clouds clouds;
//
//    @ManyToOne
//    @JoinColumn(name = "wind_id")
//    private Wind wind;

    private Integer visibility;
    private Double precipitationProbability;
    private Double rain;

    @ManyToOne
    @JoinColumn(name = "forecast_id")
    private Forecast forecast;

}

