package com.example.resthometaslil.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = StartNameValidator.class)
public @interface CheckStartNameValidation {

    String message() default "must be filled and not start with 'a'";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
