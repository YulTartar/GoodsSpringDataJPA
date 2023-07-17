package org.example.controllers.shop;

import org.example.dtos.ShopDto;
import org.example.services.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ShopController {

    @Autowired
    private ShopService shopService;

    @GetMapping("/shop")
    Iterable<ShopDto> all() {
        return shopService.getAll();
    }

    @PostMapping("/shop")
    ShopDto newshop(@RequestBody ShopDto newShop) {  return shopService.register(newShop); }

    @GetMapping("/shop/{id}")
    ShopDto one(@PathVariable Integer id) throws Throwable {

        return null;
    }

    @DeleteMapping("/shop/{id}")
    void deleteshop(@PathVariable Integer id) {
        shopService.expel(id);
    }
}
