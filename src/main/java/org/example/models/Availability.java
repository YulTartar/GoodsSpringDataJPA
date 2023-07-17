package org.example.models;

import jakarta.persistence.*;
import org.hibernate.annotations.Cascade;

@Entity
@Table(name = "availability")
public class Availability {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    protected int id;
    @ManyToOne(optional = false)
    @JoinColumn(name = "id_goods", referencedColumnName = "id", nullable=false)
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    Goods goods;

    @ManyToOne(optional = false)
    @JoinColumn(name = "id_place", referencedColumnName = "id", nullable=false)
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    Place place;

    @Column(name = "count")
    int count;

    public Availability(int id, Goods goods, Place place, int count) {
        this.id = id;
        this.goods = goods;
        this.place = place;
        this.count = count;
    }

    public Availability() {

    }

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

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Availability { id=" + id + ", goods=" + goods + ", place=" + place + " }";
    }
}
