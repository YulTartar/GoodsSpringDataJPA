package org.example.models;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "goods")
public class Goods {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    protected int id;
    @Column(name = "name", length = 255, nullable = false)
    private String name;

    @Column(name = "description", length = 255)
    private String description;

    @Column(name = "OKPD")
    private String OKPD;

    @Column(name = "OKVED")
    private String OKVED;

    @Column(name = "type_barcode", length = 255)
    private String typeBarcode;

    @Column(name = "barcode", length = 20)
    private String barcode;

    @Column(name = "shelf_life", length = 255)
    private int shelfLife;

    @OneToMany(mappedBy = "goods")
    Set<Availability> availabilities;

    public Goods(int id, String name, String description, String OKPD, String OKVED, String typeBarcode, String barcode, int shelfLife, Set<Availability> availabilities) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.OKPD = OKPD;
        this.OKVED = OKVED;
        this.typeBarcode = typeBarcode;
        this.barcode = barcode;
        this.shelfLife = shelfLife;
        this.availabilities = availabilities;
    }

    public Goods() {}

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

    public String getBarcode() {return barcode;}

    public void setBarcode(String barcode) {this.barcode = barcode;}

    public int getShelfLife() {
        return shelfLife;
    }

    public void setShelfLife(int shelfLife) {
        this.shelfLife = shelfLife;
    }

    @Override
    public String toString() {
        return "Goods { id=" + id + ", name=" + name + ", description=" + description + ", OKPD=" + OKPD + ", OKVED=" +
                OKVED + ", type_barcode=" + typeBarcode + ", barcode=" + barcode + ", shelf_life=" + shelfLife + " }";
    }
}
