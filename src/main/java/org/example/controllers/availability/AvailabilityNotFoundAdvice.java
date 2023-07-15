package org.example.controllers.availability;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class AvailabilityNotFoundAdvice {
    @ResponseBody
    @ExceptionHandler(AvailabilityNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String availabilityNotFoundHandler(AvailabilityNotFoundException ex) {
        return ex.getMessage();
    }
}