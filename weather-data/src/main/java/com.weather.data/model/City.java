package com.weather.data.model;
import jakarta.persistence.*;

@Entity
public class City {
    @Id
    private Long id;

    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "coord_id")
    private Coord coord;
    private String country;
    private Integer timezone;
}

