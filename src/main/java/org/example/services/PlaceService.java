package org.example.services;

import org.example.dtos.PlaceDto;

import java.util.List;
import java.util.Optional;

public interface PlaceService<ID> {

    PlaceDto register(PlaceDto place);

    void expel(PlaceDto place);

    void expel(ID id);

    Optional<PlaceDto> findPlace(ID id);

    List<PlaceDto> getAll();

}

