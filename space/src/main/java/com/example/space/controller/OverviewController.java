package com.example.space.controller;

import java.util.List;

import com.example.space.model.SolarSystem;
import com.example.space.serivce.SolarSystemRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OverviewController {
    @Autowired
    SolarSystemRepository systemRepository;

    @GetMapping("/overview")
    public List<SolarSystem> getSolarSystem() {
        return systemRepository.findAll();
    }
}
