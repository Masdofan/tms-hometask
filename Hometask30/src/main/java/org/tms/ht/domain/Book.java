package org.tms.ht.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class Book {

    @NotNull
    @NotBlank
    private String name;
    @NotNull
    @Min(10) @Max(400)
    private Integer pages;

}