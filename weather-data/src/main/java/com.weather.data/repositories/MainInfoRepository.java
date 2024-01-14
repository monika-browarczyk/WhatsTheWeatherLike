package com.weather.data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.weather.data.model.MainInfo;

public interface MainInfoRepository extends JpaRepository<MainInfo, Long> {

}
