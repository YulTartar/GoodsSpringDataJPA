package org.example.dtos;

public class AvailabilityDto extends BaseEntityDto {
    private GoodsDto goodsDto;
    private PlaceDto placeDto;

    public AvailabilityDto(GoodsDto goodsDto, PlaceDto placeDto){
        this.goodsDto = goodsDto;
        this.placeDto = placeDto;
    }

    @Override
    public String toString() {
        return "Availability { id=" + id + ", goods=" + goodsDto + ", place=" + placeDto + " }";
    }
}
