package org.example.controllers.goods;

class GoodsNotFoundException extends RuntimeException {
    GoodsNotFoundException(Integer id) {
        super("Could not find goods " + id);
    }
}