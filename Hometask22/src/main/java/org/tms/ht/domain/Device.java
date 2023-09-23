package org.tms.ht.domain;

import lombok.*;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Device {

    private String type;
    private String brand;

}