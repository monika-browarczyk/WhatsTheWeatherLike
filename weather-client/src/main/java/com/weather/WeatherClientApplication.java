package com.weather;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class WeatherClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeatherClientApplication.class, args);
	}

}
