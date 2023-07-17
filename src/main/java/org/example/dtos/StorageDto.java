package org.example.dtos;

public class StorageDto extends PlaceDto {
    private final static String type = "STORAGE";

    private int numberOfCars;
    private int mechanization;

    public StorageDto(int id, String type, String name, String address, int capacity, int employees, int space, int numberOfCars, int mechanization) {
        super(id, type, name, address, capacity, employees, space);
        this.numberOfCars = numberOfCars;
        this.mechanization = mechanization;
    }

    public StorageDto() {}

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

    @Override
    public String toString() {
        return "Shop { id=" + id + ", name=" + name + ", address=" + address + ", capacity=" +
                capacity + ", employess=" + employees + ", space=" + space + ", cars=" + numberOfCars + ", mechanization=" + mechanization + " }";
    }
}
