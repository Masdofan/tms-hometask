package com.example.hometask35.domain;

import lombok.*;

import javax.persistence.*;


@Entity
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MovieEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String title;

    private String genre;

    private Integer year;

    private Integer rate;

}
