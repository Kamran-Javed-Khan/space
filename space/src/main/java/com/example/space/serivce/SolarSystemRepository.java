package com.example.space.serivce;

import com.example.space.model.SolarSystem;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SolarSystemRepository extends JpaRepository<SolarSystem, Integer> {
    
}
