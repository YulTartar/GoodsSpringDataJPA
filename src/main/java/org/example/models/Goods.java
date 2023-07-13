package org.example.models;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "goods")
public class Goods extends BaseEntity {
    @Column(name = "name", length = 255, nullable = false)
    private String name;

    @Column(name = "description", length = 255)
    private String description;

    @Column(name = "OKPD")
    private String OKPD;

    @Column(name = "OKVED")
    private String OKVED;

    @Column(name = "typeBarcode", length = 255)
    private String typeBarcode;

    @Column(name = "barcode", length = 255)
    private long barcode;

    @Column(name = "shelf_life", length = 255)
    private int shelfLife;

    public Goods(String name, String description, String OKPD, String OKVED, String typeBarcode, long barcode, int shelfLife){
        this.name = name;
        this.description = description;
        this.OKPD = OKPD;
        this.OKVED = OKVED;
        this.typeBarcode = typeBarcode;
        this.barcode = barcode;
        this.shelfLife = shelfLife;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOKPD() {
        return OKPD;
    }

    public void setOKPD(String OKPD) {
        this.OKPD = OKPD;
    }

    public String getOKVED() {
        return OKVED;
    }

    public void setOKVED(String OKVED) {
        this.OKVED = OKVED;
    }

    public String getTypeBarcode() {
        return typeBarcode;
    }

    public void setTypeBarcode(String typeBarcode) {
        this.typeBarcode = typeBarcode;
    }

    public long getBarcode() {
        return barcode;
    }

    public void setBarcode(long barcode) {
        this.barcode = barcode;
    }

    public int getShelfLife() {
        return shelfLife;
    }

    public void setShelfLife(int shelfLife) {
        this.shelfLife = shelfLife;
    }
}
