package org.tms.ht;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.tms.ht.entity.PersonEntity;
import org.tms.ht.entity.PhoneEntity;

public class HibernateConfig {

    private static SessionFactory sessionFactory;

    static {

        Configuration configuration = new Configuration();
        configuration.setProperty("hibernate.connection.url", "jdbc:postgresql://localhost:5432/Hometask32");
        configuration.setProperty("hibernate.connection.username", "postgres");
        configuration.setProperty("hibernate.connection.password", "postgres");
        configuration.setProperty("hibernate.connection.driver_class", "org.postgresql.Driver");
        configuration.setProperty("hibernate.dialect", "org.hibernate.dialect.PostgreSQL95Dialect");
        configuration.setProperty("hibernate.hbm2ddl.auto", "create-drop");

        configuration.addAnnotatedClass(PersonEntity.class);
        configuration.addAnnotatedClass(PhoneEntity.class);

        sessionFactory = configuration.buildSessionFactory();

    }

    public static Session create() {

        return sessionFactory.openSession();

    }

}
