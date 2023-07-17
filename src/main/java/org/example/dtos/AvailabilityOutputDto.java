package org.example.dtos;

public class AvailabilityOutputDto {
    int id;
    int goodsDto;
    int placeDto;
    int count;

    public AvailabilityOutputDto(int id, int goodsDto, int placeDto, int count){
        this.id = id;
        this.goodsDto = goodsDto;
        this.placeDto = placeDto;
        this.count = count;
    }

    public AvailabilityOutputDto() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGoodsDto() {
        return goodsDto;
    }

    public void setGoodsDto(int goodsDto) {
        this.goodsDto = goodsDto;
    }

    public int getPlaceDto() {
        return placeDto;
    }

    public void setPlaceDto(int placeDto) {
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
