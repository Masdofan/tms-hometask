package com.example.resthometaslil.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.List;

public class StartNameValidator implements ConstraintValidator<CheckStartNameValidation, String> {

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        List<String> blackList =List.of("BMW","Mercedes", "Audi");

        for(String el : blackList) {
            if (s == null || s.isBlank()) {
                return false;
            }

            if (s.contains(el)) {
                return false;
            }
        }
        return true;
    }
}
