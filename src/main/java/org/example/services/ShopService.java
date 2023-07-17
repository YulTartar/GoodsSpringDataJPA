package org.example.services;

import org.example.dtos.ShopDto;

import java.util.List;
import java.util.Optional;

public interface ShopService<ID> {

    ShopDto register(ShopDto shop);

    void expel(ShopDto shop);

    void expel(ID id);

    ShopDto findShop(ID id);

    List<ShopDto> findShopByAddress(String address);

    List<ShopDto> getAll();

}

