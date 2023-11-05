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

    public static void save(UserEntity user) {
        Session session = HibernateConfig.create();
        Transaction transaction = session.beginTransaction();

        session.save(user);

        transaction.commit();
        session.close();
    }

    public static UserEntity getById (int id) {
        Session session = HibernateConfig.create();
        Transaction transaction = session.beginTransaction();

        UserEntity userEntity = session.find(UserEntity.class, id);

        transaction.commit();
        session.close();
        return userEntity;
    }

    public static void deleteById (int id) {
        Session session = HibernateConfig.create();
        Transaction transaction = session.beginTransaction();

        UserEntity userEntity = session.find(UserEntity.class, id);
        session.delete(userEntity);

        transaction.commit();
        session.close();
    }

    public static void updateName (int userId, String newName) {
        Session session = HibernateConfig.create();
        Transaction transaction = session.beginTransaction();

        UserEntity userEntity = session.find(UserEntity.class, userId);
        userEntity.setName(newName);

        session.update(userEntity);

        transaction.commit();
        session.close();

    }

    public static void updateRole (int userId, UserRole role) {
        Session session = HibernateConfig.create();
        Transaction transaction = session.beginTransaction();

        UserEntity userEntity = session.find(UserEntity.class, userId);
        userEntity.setRole(role);

        session.update(userEntity);

        transaction.commit();
        session.close();

    }

    public static void updateBirthday (int userId, Date newBirthday) {
        Session session = HibernateConfig.create();
        Transaction transaction = session.beginTransaction();

        UserEntity userEntity = session.find(UserEntity.class, userId);
        userEntity.setBirthday(newBirthday);

        session.update(userEntity);

        transaction.commit();
        session.close();

    }

    public static void updateGender (int userId, boolean isMan) {
        Session session = HibernateConfig.create();
        Transaction transaction = session.beginTransaction();

        UserEntity userEntity = session.find(UserEntity.class, userId);
        userEntity.setMan(isMan);

        session.update(userEntity);

        transaction.commit();
        session.close();

    }

    public static void deleteAll() {
        Session session = HibernateConfig.create();
        Transaction transaction = session.beginTransaction();

        Query query = session.createQuery("from UserEntity");
        List list = query.list();

        for (var item : list) {

            session.delete(item);

        }

        transaction.commit();
        session.close();
    }

}
