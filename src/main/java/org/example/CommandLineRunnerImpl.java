package org.example;

import org.example.dtos.*;
import org.example.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Optional;

@Component
public class CommandLineRunnerImpl implements CommandLineRunner {
    @Autowired
    private ShopService shopService;
    @Autowired
    private StorageService storageService;
    @Autowired
    private GoodsService goodsService;
    @Autowired
    private PlaceService placeService;
    @Autowired
    private AvailabilityService availabilityService;

    @Override
    public void run(String... args) throws Exception {
        seedData();
        // System.out.println(shopService.getAll());
        // System.out.println(shopService.findShop(1));
        //System.out.println(goodsService.findAvailabilityByGoodsName("Яблоки Голден"));
        // System.out.println(shopService.findShopByAddress("Московская обл., г. Одинцово, ул. Неделина, дом 47"));
        //System.out.println(storageService.findStorageNameByCapasity(5000));
        addNewAvailability();
    }

    private void addNewAvailability() throws IOException {
        Optional<GoodsDto> goodsOptional = goodsService.findGoods(1);
        Optional<PlaceDto> placeOptional = placeService.findPlace(1);

        if (goodsOptional.isPresent() && placeOptional.isPresent()) {
            GoodsDto g = goodsOptional.get();
            PlaceDto p = placeOptional.get();
            AvailabilityDto avail = new AvailabilityDto(g, p, 5);
            availabilityService.register(avail);
        } else {
            // Обработка случая, если объекты GoodsDto или PlaceDto не найдены
        }
    }

    private void seedData() throws IOException {
        //Добавление в БД записей
        ShopDto firstShop = new ShopDto("О'Парк", "Московская обл., г. Одинцово, ул. Неделина, дом 47", 250, 8, 100, "Магазин", 4);
        StorageDto firstStorage = new StorageDto("Большой склад под Москвой", "Московская обл., г. Хырадвинск, ул. Шпатель, дом 3, стр. 1", 5000, 34, 1000, 14, 6);
        GoodsDto firstGoods = new GoodsDto("Кофейные капсулы Nutcafe", "Сладкий и вкусный кофе в капсулах", "10.83.99.000", "10.83", "EAN-13", "7348768483745", 365);
        ShopDto secondShop = new ShopDto("Магазин 'Магнит'", "Московская обл., г. Мытищи, ул. Ленина, д. 15", 150, 5, 50, "Магазин", 3);
        StorageDto secondStorage = new StorageDto("Маленький склад", "Московская обл., г. Королев, ул. Заводская, д. 10, стр. 2", 1000, 20, 500, 8, 4);
        GoodsDto secondGoods = new GoodsDto("Молоко Домик в Деревне", "Свежее пастеризованное молоко", "10.55.78.123", "10.55", "EAN-8", "01234567", 180);
        ShopDto thirdShop = new ShopDto("Зеленый огород", "Московская обл., г. Красногорск, ул. Пушкина, дом 25", 150, 6, 50, "Гипер", 3);
        StorageDto thirdStorage = new StorageDto("Склад Зеленого огорода", "Московская обл., г. Химки, ул. Садовая, дом 8", 3000, 20, 500, 10, 4);
        GoodsDto thirdGoods = new GoodsDto("Морковь", "Свежие и сочные моркови", "10.50.12.005", "10.50", "EAN-13", "3256789045172", 90);
        ShopDto fourthShop = new ShopDto("Фруктовый рай", "Московская обл., г. Дмитров, ул. Лесная, дом 15", 200, 5, 80, "Мега", 2);
        StorageDto fourthStorage = new StorageDto("Склад Фруктового райа", "Московская обл., г. Сергиев Посад, ул. Цветочная, дом 7", 4000, 25, 800, 12, 5);
        GoodsDto fourthGoods = new GoodsDto("Яблоки Голден", "Сочные и сладкие яблоки сорта Голден", "10.30.19.002", "10.30", "EAN-13", "4867529130456", 120);
        shopService.register(firstShop);
        storageService.register(firstStorage);
        goodsService.register(firstGoods);
        shopService.register(secondShop);
        storageService.register(secondStorage);
        goodsService.register(secondGoods);
        shopService.register(thirdShop);
        storageService.register(thirdStorage);
        goodsService.register(thirdGoods);
        shopService.register(fourthShop);
        storageService.register(fourthStorage);
        goodsService.register(fourthGoods);
    }
}
