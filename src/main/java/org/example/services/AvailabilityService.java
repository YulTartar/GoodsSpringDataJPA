package org.example.services;

import org.example.dtos.AvailabilityDto;
import org.example.dtos.GoodsDto;

import java.util.List;
import java.util.Optional;

public interface AvailabilityService<ID> {
    AvailabilityDto register(int idGoods, int idPlace);

    void expel(AvailabilityDto availability);

    void expel(ID id);

    Optional<AvailabilityDto> findAvailability(ID id);

    List<AvailabilityDto> getAll();
}

