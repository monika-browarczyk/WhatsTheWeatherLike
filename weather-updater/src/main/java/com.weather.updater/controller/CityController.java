package com.weather.updater.controller;

import com.weather.data.model.City;
import com.weather.data.repositories.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cities")
public class CityController {
    @Autowired
    private CityRepository cityRepository;

    @GetMapping
    public List<City> getAllCities() {
        return cityRepository.findAll();
    }

    @GetMapping("/{name}")
    public City getCityByName(@PathVariable String name) {
        return cityRepository.findByName(name);
    }

    @GetMapping("/{id}")
    public City getCityById(@PathVariable Long id) {
        return cityRepository.findById(id).orElse(null);
    }

    @PostMapping
    public City saveCity(@RequestBody City city) {
        return cityRepository.save(city);
    }

    @DeleteMapping("/{id}")
    public void deleteCity(@PathVariable Long id) {
        cityRepository.deleteById(id);
    }

    // Dodaj inne metody obsługujące zapytania dotyczące miast
}