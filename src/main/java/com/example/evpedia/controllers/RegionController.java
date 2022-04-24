package com.example.evpedia.controllers;


import com.example.evpedia.models.Location;
import com.example.evpedia.models.Region;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;


@RestController
@RequestMapping("/regions")
public class RegionController {

    public RegionController() {}

    @GetMapping("/region")
    Region getRegionFromAPI() {
        RestTemplate restTemplate = new RestTemplate();
        String uri = "https://pokeapi.co/api/v2/region/johto";
        return restTemplate.getForObject(uri, Region.class);
    }
}
