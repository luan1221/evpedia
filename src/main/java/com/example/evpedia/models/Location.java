package com.example.evpedia.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Location {


    private String name;
    private String url;

    @Override
    public String toString() {
        return "name='" + name + "'";
    }
}
