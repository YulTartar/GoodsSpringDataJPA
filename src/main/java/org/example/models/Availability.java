package org.example.models;

import jakarta.persistence.*;
import org.hibernate.annotations.Cascade;

@Entity
@Table(name = "availability")
public class Availability {

    @ManyToOne(optional = false)
    @JoinColumn(name = "id_goods", referencedColumnName = "id", nullable=false)
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    private Goods goods;

    @ManyToOne(optional = false)
    @JoinColumn(name = "id_place", referencedColumnName = "id", nullable=false)
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    private Place place;

    @Id
    @Column(name = "id")
    private final int availabilityId;

    public Availability(int availabilityId, Goods goods, Place place){
        this.availabilityId = availabilityId;
        this.goods = goods;
        this.place = place;
    }
}
