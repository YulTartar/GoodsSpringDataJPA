package org.example.services;

import org.example.dtos.PlaceDto;
import org.example.dtos.ShopDto;

import java.util.List;
import java.util.Optional;

public interface PlaceService<ID> {

    PlaceDto register(PlaceDto place);

    void expel(PlaceDto place);

    void expel(ID id);

    PlaceDto findPlace(ID id);

    List<PlaceDto> getAll();

}

