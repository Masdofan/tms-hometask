package org.tms.ht;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.tms.ht.HibernateConfig;
import org.tms.ht.entity.PersonEntity;
import org.tms.ht.entity.PhoneEntity;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        Session session = HibernateConfig.create();
        Transaction transaction = session.beginTransaction();

        PhoneEntity phoneEntity = PhoneEntity.builder().
                id(1)
                .name("phone1")
                .isSmartphone(true)
                .date(new Date())
                .country(Country.USA)
                .build();

        session.save(phoneEntity);

        PersonEntity personEntity = PersonEntity.builder()
                .id(1)
                .name("person1")
                .isMan(true)
                .date(new Date())
                .country(Country.CHINA)
                .phone(List.of(phoneEntity))
                .build();


        session.save(phoneEntity);
        session.save(personEntity);

        transaction.commit();
        session.close();

    }

}
