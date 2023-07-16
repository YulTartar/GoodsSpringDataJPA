package org.example.dtos;

import java.util.Optional;

public class AvailabilityDto extends BaseEntityDto {
    protected GoodsDto goodsDto;
    protected PlaceDto placeDto;

    public AvailabilityDto(GoodsDto goodsDto, PlaceDto placeDto){
        this.goodsDto = goodsDto;
        this.placeDto = placeDto;
    }

    public AvailabilityDto() {;}

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

    @Override
    public String toString() {
        return "Availability { id=" + id + ", goods=" + goodsDto + ", place=" + placeDto + " }";
    }
}
