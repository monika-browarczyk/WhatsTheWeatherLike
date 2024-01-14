package com.weather.data.model;

import jakarta.persistence.*;

@Entity
public class Coord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double lon;
    private Double lat;

}