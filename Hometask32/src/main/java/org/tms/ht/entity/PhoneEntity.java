package org.tms.ht.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.tms.ht.Country;

import javax.persistence.*;
import java.util.Date;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "phones")
public class PhoneEntity {

    @Id
    private Integer id;
    @Column(length = 1024)
    private String name;

    private Boolean isSmartphone;
    @Temporal(TemporalType.DATE)
    private Date date;
    @Enumerated(EnumType.STRING)
    private Country country;

    @ManyToOne
    private PersonEntity person;

}
