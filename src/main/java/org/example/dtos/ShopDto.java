package org.example.dtos;

public class ShopDto extends PlaceDto {
    private final static String type = "SHOP";

    private String level;
    private int rating;

    public ShopDto(int id, String type, String name, String address, int capacity, int employees, int space, String level, int rating) {
        super(id, type, name, address, capacity, employees, space);
        this.level = level;
        this.rating = rating;
    }

    public ShopDto() {}

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Shop { id=" + id + ", name=" + name + ", address=" + address + ", capacity=" +
                capacity + ", employess=" + employees + ", space=" + space + ", level=" + level + ", space=" + rating + " }";
    }
}
