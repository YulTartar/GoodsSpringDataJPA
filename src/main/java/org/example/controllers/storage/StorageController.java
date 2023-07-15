package org.example.controllers.storage;

import org.example.dtos.StorageDto;
import org.example.services.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class StorageController {

    @Autowired
    private StorageService storageService;

    @GetMapping("/storage")
    Iterable<StorageDto> all() {
        return storageService.getAll();
    }

    @PostMapping("/storage")
    StorageDto newStorage(@RequestBody StorageDto newStorage) {  return storageService.register(newStorage); }

    @GetMapping("/storage/{id}")
    StorageDto one(@PathVariable Integer id) throws Throwable {

        return (StorageDto) storageService.findStorage(id)
                .orElseThrow(() -> new StorageNotFoundException(id));
    }

    @DeleteMapping("/storage/{id}")
    void deleteStorage(@PathVariable Integer id) {
        storageService.expel(id);
    }
}
