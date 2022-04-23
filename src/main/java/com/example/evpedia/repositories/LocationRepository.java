package com.example.evpedia.repositories;

import com.example.evpedia.models.Location;
import org.springframework.data.repository.CrudRepository;

public interface LocationRepository extends CrudRepository<Location, String> {}
