package org.example.dtos;

public class PlaceDto extends BaseEntityDto {

    protected String type;
    protected String name;
    protected String address;
    protected int capacity;
    protected int employees;
    protected int space;

    public PlaceDto() {
    }

    protected PlaceDto(String type, String name, String address, int capacity, int employees, int space) {
        this.type = type;
        this.name = name;
        this.address = address;
        this.capacity = capacity;
        this.employees = employees;
        this.space = space;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
