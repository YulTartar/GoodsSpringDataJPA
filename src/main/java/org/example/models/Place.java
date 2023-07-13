package org.example.models;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public abstract class Place extends BaseEntity {

    @Column(name = "name", length = 255, nullable = false)
    private String name;
    @Column(name = "address", length = 255)
    protected String address;
    @Column(name = "capacity", nullable = false)
    protected int capacity;
    @Column(name = "employees", length = 255)
    protected int employees;
    @Column(name = "space", length = 255)
    protected int space;

    protected Place() {
    }

    protected Place(String name, String address, int capacity, int space) {
        this.name = name;
        this.address = address;
        this.capacity = capacity;
        this.space = space;
    }
}
