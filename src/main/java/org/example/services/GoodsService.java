package org.example.services;

import org.example.dtos.GoodsDto;
import org.example.dtos.PlaceDto;
import org.example.dtos.ShopDto;

import java.util.List;
import java.util.Optional;

public interface GoodsService<ID> {
    GoodsDto register(GoodsDto goods);

    void expel(GoodsDto goods);

    void expel(ID id);
    Optional<GoodsDto> findGoods(ID id);

    List<GoodsDto> getAll();
}

