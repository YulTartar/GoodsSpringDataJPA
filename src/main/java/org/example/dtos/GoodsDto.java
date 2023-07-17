package org.example.dtos;

public class GoodsDto extends BaseEntityDto {
    private String name;
    private String description;
    private String OKPD;
    private String OKVED;
    private String typeBarcode;
    private String barcode;
    private int shelfLife;


    public GoodsDto(int id, String name, String description, String OKPD, String OKVED, String typeBarcode, String barcode, int shelfLife) {
        super(id);
        this.name = name;
        this.description = description;
        this.OKPD = OKPD;
        this.OKVED = OKVED;
        this.typeBarcode = typeBarcode;
        this.barcode = barcode;
        this.shelfLife = shelfLife;
    }

    public GoodsDto() {}

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
