package com.example.resthometaslil.dto;

import com.example.resthometaslil.validation.CheckStartNameValidation;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CarDto {

    private Integer id;

    @CheckStartNameValidation
    private String model;

    private Integer number;

}
