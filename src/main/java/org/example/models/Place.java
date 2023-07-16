package org.example.models;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public class Place extends BaseEntity {
    @Column(name = "type", length = 16)
    protected String type;
    @Column(name = "name", length = 255, nullable = false)
    protected String name;
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

    protected Place(String type, String name, String address, int capacity, int employees, int space) {
        this.type = type;
        this.name = name;
        this.address = address;
        this.capacity = capacity;
        this.employees = employees;
        this.space = space;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getEmployees() {
        return employees;
    }

    public void setEmployees(int employees) {
        this.employees = employees;
    }

    public int getSpace() {
        return space;
    }

    public void setSpace(int space) {
        this.space = space;
    }

    @Override
    public String toString() {
        return "Place { id=" + id + ", type=" + type + ", name=" + name + ", address=" + address + ", capacity=" +
                capacity + ", employess=" + employees + ", space=" + space + " }";
    }
}
