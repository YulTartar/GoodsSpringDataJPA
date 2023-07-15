package org.example.services.impl;

import org.example.dtos.AvailabilityDto;
import org.example.dtos.GoodsDto;
import org.example.models.Availability;
import org.example.models.Goods;
import org.example.repositories.AvailabilityRepository;
import org.example.repositories.GoodsRepository;
import org.example.repositories.PlaceRepository;
import org.example.services.AvailabilityService;
import org.example.services.GoodsService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class AvailabilityServiceImpl implements AvailabilityService<Integer> {

    @Autowired
    private AvailabilityRepository availabilityRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public AvailabilityDto register(AvailabilityDto availability) {
        Availability g = modelMapper.map(availability, Availability.class);

        return modelMapper.map(availabilityRepository.save(g), AvailabilityDto.class);
    }

    @Override
    public void expel(AvailabilityDto availability) {
        availabilityRepository.deleteById(availability.getId());
    }

    @Override
    public void expel(Integer id) {
        availabilityRepository.deleteById(id);
    }

    @Override
    public Optional<AvailabilityDto> findAvailability(Integer id) {
        return Optional.ofNullable(modelMapper.map(availabilityRepository.findById(id), AvailabilityDto.class));
    }

    @Override
    public List<AvailabilityDto> getAll() {
        return availabilityRepository.findAll().stream().map((s) -> modelMapper.map(s, AvailabilityDto.class)).collect(Collectors.toList());
    }
}