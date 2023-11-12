package org.tms.ht.entity;

import lombok.*;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.tms.ht.UserRole;
import org.tms.ht.config.HibernateConfig;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "users")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @Enumerated(EnumType.STRING)
    private UserRole role;

    @Temporal(TemporalType.DATE)
    private Date birthday;

    private boolean isMan;

    @OneToMany(mappedBy = "user"
    , fetch = FetchType.EAGER
    , cascade = CascadeType.REMOVE)
    private List<TaskEntity> tasks;


}
