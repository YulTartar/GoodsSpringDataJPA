package org.example.services.impl;

import org.example.dtos.GoodsDto;
import org.example.models.Goods;
import org.example.repositories.GoodsRepository;
import org.example.repositories.PlaceRepository;
import org.example.services.GoodsService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class GoodsServiceImpl implements GoodsService<Integer> {

    @Autowired
    private GoodsRepository goodsRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public GoodsDto register(GoodsDto goods) {
        Goods g = modelMapper.map(goods, Goods.class);
        return modelMapper.map(goodsRepository.save(g), GoodsDto.class);
    }

    @Override
    public void expel(GoodsDto goods) {
        goodsRepository.deleteById(goods.getId());
    }

    @Override
    public void expel(Integer id) {
        goodsRepository.deleteById(id);
    }

    @Override
    public Optional<GoodsDto> findGoods(Integer id) {
        return Optional.ofNullable(modelMapper.map(goodsRepository.findById(id), GoodsDto.class));
    }

     /*@Override
    public GoodsDto findAvailabilityByGoodsName(String goodsName) {
        return modelMapper.map(goodsRepository.findAvailabilityByGoodsName(goodsName), GoodsDto.class);
    }
*/
    @Override
    public List<GoodsDto> getAll() {
        return goodsRepository.findAll().stream().map((s) -> modelMapper.map(s, GoodsDto.class)).collect(Collectors.toList());
    }
}