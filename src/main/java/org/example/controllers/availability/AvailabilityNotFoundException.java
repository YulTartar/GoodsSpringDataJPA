package org.example.controllers.availability;

class AvailabilityNotFoundException extends RuntimeException {
    AvailabilityNotFoundException(Integer id) {
        super("Could not find availability " + id);
    }
}