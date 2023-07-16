package org.example.services.impl;

import org.example.dtos.AvailabilityDto;
import org.example.dtos.GoodsDto;
import org.example.dtos.PlaceDto;
import org.example.models.Availability;
import org.example.repositories.AvailabilityRepository;
import org.example.services.AvailabilityService;
import org.example.services.GoodsService;
import org.example.services.PlaceService;
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

    @Autowired
    private PlaceService placeService;

    @Autowired
    private GoodsService goodsService;

    @Override
    public AvailabilityDto register(int idGoods, int idPlace) {
        Availability a = null;
        if (goodsService.findGoods(idGoods) != null && placeService.findPlace(idPlace) != null) {
            Optional<GoodsDto> optionalGoodsDto = goodsService.findGoods(idGoods);
            GoodsDto goodsDto = optionalGoodsDto.get();
            Optional<PlaceDto> optionalPlaceDto = placeService.findPlace(idPlace);
            PlaceDto placeDto = optionalPlaceDto.get();
            AvailabilityDto availabilityDto = new AvailabilityDto(goodsDto, placeDto);
            System.out.println(availabilityDto);
            a = modelMapper.map(availabilityDto, Availability.class);
        } else {
            ;
            // throw new RuntimeException("Unsuccessful object creation class Availability.");
        }
        System.out.println(modelMapper.map(availabilityRepository.save(a), AvailabilityDto.class));
        return modelMapper.map(availabilityRepository.save(a), AvailabilityDto.class);
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