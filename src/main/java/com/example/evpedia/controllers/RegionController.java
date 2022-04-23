package com.example.evpedia.controllers;

import com.example.evpedia.models.Location;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/regions")
public class RegionController {

    @GetMapping("/{name}")
    Iterable<Location> getRoutes() {
        return null;
    }

}
