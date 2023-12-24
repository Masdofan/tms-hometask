package com.example.resthometaskbl.exc;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class CarFailerException extends RuntimeException {

    private final String ErrorMessage;

    public CarFailerException(String errorMessage) {
        super(errorMessage);
        ErrorMessage = errorMessage;
    }
}
