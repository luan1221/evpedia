package com.example.evpedia.controllers;


import com.example.evpedia.models.Location;
import com.example.evpedia.models.Region;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;


@RestController
@RequestMapping("/regions")
public class RegionController {

    public RegionController() {}

    @GetMapping("/region/{name}")
    List<Location> getRegionFromAPI(@PathVariable String name) {
        RestTemplate restTemplate = new RestTemplate();
        String uri = "https://pokeapi.co/api/v2/region/" + name;
        Region region = restTemplate.getForObject(uri, Region.class);
        return region.getLocations();
    }
}
