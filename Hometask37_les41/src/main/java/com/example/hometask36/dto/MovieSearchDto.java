package com.example.hometask36.dto;

import lombok.Data;

@Data
public class MovieSearchDto {

    private String title;

    private String genre;

    private Integer rateFrom;
    private Integer rateTo;

}
