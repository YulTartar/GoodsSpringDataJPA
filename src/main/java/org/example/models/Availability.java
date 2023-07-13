package org.example.models;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "availability")
public class Availability {

    private final int goodsId;
    private final int shopTd;
    private final int storageTd;

    public Availability(int  goodsId, int shopTd, int storageId){
        this.goodsId = Goods.id;
        this.shopTd = Shop.id;
        this.storageTd = Storage.id;
    }
}
