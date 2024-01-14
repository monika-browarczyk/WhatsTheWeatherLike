package com.weather.data.repositories;

import com.weather.data.model.Coord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoordRepository extends JpaRepository<Coord, Long> {

}
