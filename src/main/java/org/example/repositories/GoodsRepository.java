package org.example.repositories;

import org.example.models.Goods;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GoodsRepository extends JpaRepository<Goods, Integer> {
    //Optional<Object> findAllByName(String name);
}
