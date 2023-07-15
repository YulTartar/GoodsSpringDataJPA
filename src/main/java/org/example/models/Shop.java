package org.example.models;

import jakarta.persistence.*;

@Entity
@Table(name = "shops")
public class Shop extends Place {
    private final static String type = "SHOP";

    @Column(name = "level")
    private String level;

    @Column(name = "rating")
    private int rating;

    public Shop(String name, String address, int capacity, int employees, int space, String level, int rating){
        super(type, name, address, capacity, space, employees);
        this.level = level;
        this.rating = rating;
    }

    public Shop() {
        super();
    }

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
