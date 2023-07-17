package org.example.repositories;

import org.example.models.Shop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface ShopRepository extends JpaRepository<Shop, Integer> {
    Collection<Object> findShopByAddress(String address);
}
