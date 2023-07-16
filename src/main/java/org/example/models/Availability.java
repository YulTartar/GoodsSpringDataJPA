package org.example.models;

import jakarta.persistence.*;
import org.hibernate.annotations.Cascade;

@Entity
@Table(name = "availability")
public class Availability extends BaseEntity {

    @ManyToOne(optional = false)
    @JoinColumn(name = "id_goods", referencedColumnName = "id", nullable=false)
    // @Cascade(org.hibernate.annotations.CascadeType.ALL)
    protected Goods goods;

    @ManyToOne(optional = false)
    @JoinColumn(name = "id_place", referencedColumnName = "id", nullable=false)
    // @Cascade(org.hibernate.annotations.CascadeType.ALL)
    protected Place place;

    public Availability(Goods goods, Place place){
        this.goods = goods;
        this.place = place;
    }

    public Availability() {;}

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }

    @Override
    public String toString() {
        return "Availability { id=" + id + ", goods=" + goods + ", place=" + place + " }";
    }
}
