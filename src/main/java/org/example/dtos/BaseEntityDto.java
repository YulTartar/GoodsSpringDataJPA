package org.example.dtos;

public abstract class BaseEntityDto {
    protected int id;

    public int getId() {
        return id;
    }

    protected void setId(int id) {
        this.id = id;
    }
}
