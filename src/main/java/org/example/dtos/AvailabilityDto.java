package org.example.dtos;

import java.util.Optional;

public class AvailabilityDto extends BaseEntityDto {
    GoodsDto goodsDto;
    PlaceDto placeDto;
    int count;

    public AvailabilityDto(GoodsDto goodsDto, PlaceDto placeDto, int count){
        this.goodsDto = goodsDto;
        this.placeDto = placeDto;
        this.count = count;
    }

    public AvailabilityDto() {}

    public GoodsDto getGoodsDto() {
        return goodsDto;
    }

    public void setGoodsDto(GoodsDto goodsDto) {
        this.goodsDto = goodsDto;
    }

    public PlaceDto getPlaceDto() {
        return placeDto;
    }

    public void setPlaceDto(PlaceDto placeDto) {
        this.placeDto = placeDto;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Availability { id=" + id + ", goods=" + goodsDto + ", place=" + placeDto + " }";
    }
}
