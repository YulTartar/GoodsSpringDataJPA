package org.example.controllers.storage;

class StorageNotFoundException extends RuntimeException {
    StorageNotFoundException(Integer id) {
        super("Could not find storage" + id);
    }
}