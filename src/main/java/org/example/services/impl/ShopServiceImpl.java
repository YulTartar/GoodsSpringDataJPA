package org.example.services.impl;

import org.example.dtos.ShopDto;
import org.example.models.Shop;
import org.example.repositories.ShopRepository;
import org.example.services.ShopService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ShopServiceImpl implements ShopService<Integer> {

    @Autowired
    private ShopRepository shopRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public ShopDto register(ShopDto shop) {
        Shop p = modelMapper.map(shop, Shop.class);
        return modelMapper.map(shopRepository.save(p), ShopDto.class);
    }

    @Override
    public void expel(ShopDto goods) {
        shopRepository.deleteById(goods.getId());
    }

    @Override
    public void expel(Integer id) {
        shopRepository.deleteById(id);
    }

    @Override
    public Optional<ShopDto> findShop(Integer id) {
        return Optional.ofNullable(modelMapper.map(shopRepository.findById(id), ShopDto.class));
    }

    @Override
    public List<ShopDto> findShopByAddress(String address) {
        return shopRepository.findShopByAddress(address).stream().map((p) -> modelMapper.map(p, ShopDto.class)).collect(Collectors.toList());
    }

    @Override
    public List<ShopDto> getAll() {
        return shopRepository.findAll().stream().map((p) -> modelMapper.map(p, ShopDto.class)).collect(Collectors.toList());
    }
}