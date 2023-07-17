package org.example.services.impl;

import jakarta.persistence.EntityNotFoundException;
import org.example.dtos.GoodsDto;
import org.example.dtos.PlaceDto;
import org.example.dtos.ShopDto;
import org.example.models.Goods;
import org.example.models.Place;
import org.example.repositories.GoodsRepository;
import org.example.repositories.PlaceRepository;
import org.example.services.GoodsService;
import org.example.services.PlaceService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PlaceServiceImpl implements PlaceService<Integer> {

    @Autowired
    private PlaceRepository placeRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public PlaceDto register(PlaceDto place) {
        Place p = modelMapper.map(place, Place.class);
        return modelMapper.map(placeRepository.save(p), PlaceDto.class);
    }

    @Override
    public void expel(PlaceDto goods) {
        placeRepository.deleteById(goods.getId());
    }

    @Override
    public void expel(Integer id) {
        placeRepository.deleteById(id);
    }

    @Override
    public PlaceDto findPlace(Integer id) {
        return modelMapper.map(placeRepository.findById(id).orElseThrow(), PlaceDto.class);
    }

    @Override
    public List<PlaceDto> getAll() {
        return placeRepository.findAll().stream().map((p) -> modelMapper.map(p, PlaceDto.class)).collect(Collectors.toList());
    }
}