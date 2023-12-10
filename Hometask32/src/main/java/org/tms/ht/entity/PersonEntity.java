package org.tms.ht.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.tms.ht.Country;

import java.util.List;
import javax.persistence.*;
import java.util.Date;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "persons")
public class PersonEntity {

    @Id
    private Integer id;
    @Column(length = 1024)
    private String name;

    private Boolean isMan;
    @Temporal(TemporalType.DATE)
    private Date date;
    @Enumerated(EnumType.STRING)
    private Country country;

    @OneToMany
    private List<PhoneEntity> phone;

}

