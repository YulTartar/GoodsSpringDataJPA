package org.example.models;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "storages")
public class Storage extends Place {
    @Column(name = "cars", length = 255)
    private int numberOfCars;
    @Column(name = "mechanization")
    private int mechanization;

    public Storage(String name, String address, int capacity, int space, int numberOfCars, int mechanization){
        super(name, address, capacity, space);
        this.numberOfCars = numberOfCars;
        this.mechanization = mechanization;
    }

    public int getNunberOfCars() {
        return numberOfCars;
    }

    public void setNunberOfCars(int numberOfCars) {
        this.numberOfCars = numberOfCars;
    }

    public int getMechanization() {
        return mechanization;
    }

    public void setMechanization(int mechanization) {
        this.mechanization = mechanization;
    }
}
