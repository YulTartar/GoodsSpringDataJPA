package org.example.controllers.availability;

import org.example.dtos.AvailabilityDto;
import org.example.services.AvailabilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AvailabilityController {

    @Autowired
    private AvailabilityService availabilityService;

    @GetMapping("/availability")
    Iterable<AvailabilityDto> all() {
        return availabilityService.getAll();
    }
    /*
    @PostMapping("/availability")
    AvailabilityDto newavailability(@RequestBody AvailabilityDto newAvailability) {  return availabilityService.register(newAvailability); }
    */
    @GetMapping("/availability/{id}")
    AvailabilityDto one(@PathVariable Integer id) throws Throwable {

        return (AvailabilityDto) availabilityService.findAvailability(id)
                .orElseThrow(() -> new AvailabilityNotFoundException(id));
    }

    @DeleteMapping("/availability/{id}")
    void deleteavailability(@PathVariable Integer id) {
        availabilityService.expel(id);
    }
}
