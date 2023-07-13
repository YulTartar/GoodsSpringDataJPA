package org.example.models;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "shops")
public class Shop extends Place {

    enum Levels{
        BASE,
        GIPER,
        MEGA,
        DISPENSER,
        DELIVERY_POINT,
    }

    @Column(name = "level")
    private Levels level;

    @Column(name = "rating")
    private int rating;

    public Shop(String name, String address, int capacity, int space, Levels level, int rating){
        super(name, address, capacity, space);
        this.level = level;
        this.rating = rating;

    }

    public String getLevel() {

        return level.name();
    }

    public void setLevel(Levels level) {

        this.level = level;
    }
}
