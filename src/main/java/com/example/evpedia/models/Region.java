package com.example.evpedia.models;


import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Getter
public class Region {

    private int id;
    private String name;

    private final List<Location> locations = new ArrayList<>();

}
