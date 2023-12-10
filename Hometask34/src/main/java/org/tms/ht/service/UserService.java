package org.tms.ht.service;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.tms.ht.UserRole;
import org.tms.ht.config.HibernateConfig;
import org.tms.ht.dto.UserUpdateDto;
import org.tms.ht.entity.UserEntity;

import java.util.Date;
import java.util.List;

public class UserService {

    public void save(UserEntity user) {
        Session session = HibernateConfig.create();
        Transaction transaction = session.beginTransaction();

        session.save(user);

        transaction.commit();
        session.close();
    }

    public UserEntity getById (int id) {
        Session session = HibernateConfig.create();
        Transaction transaction = session.beginTransaction();

        UserEntity userEntity = session.find(UserEntity.class, id);

        transaction.commit();
        session.close();
        return userEntity;
    }

    public void deleteById (int id) {
        Session session = HibernateConfig.create();
        Transaction transaction = session.beginTransaction();

        UserEntity userEntity = session.find(UserEntity.class, id);
        session.delete(userEntity);

        transaction.commit();
        session.close();
    }

    public void update (int userId, UserUpdateDto updateDto) {
        Session session = HibernateConfig.create();
        Transaction transaction = session.beginTransaction();

        UserEntity userEntity = session.find(UserEntity.class, userId);
        if(updateDto.getUpName() != null) {
            userEntity.setName(updateDto.getUpName());
        }
        if (updateDto.getUpRole() != null) {
            userEntity.setRole(updateDto.getUpRole());
        }
        if (updateDto.getUpBirthday() != null) {
            userEntity.setBirthday(updateDto.getUpBirthday());
        }
        if (updateDto.isMan() != userEntity.isMan()){
            userEntity.setMan(updateDto.isMan());
        }

        session.update(userEntity);

        transaction.commit();
        session.close();
    }

//    public void updateName (int userId, String newName) {
//        Session session = HibernateConfig.create();
//        Transaction transaction = session.beginTransaction();
//
//        UserEntity userEntity = session.find(UserEntity.class, userId);
//        userEntity.setName(newName);
//
//        session.update(userEntity);
//
//        transaction.commit();
//        session.close();
//
//    }
//
//    public void updateRole (int userId, UserRole role) {
//        Session session = HibernateConfig.create();
//        Transaction transaction = session.beginTransaction();
//
//        UserEntity userEntity = session.find(UserEntity.class, userId);
//        userEntity.setRole(role);
//
//        session.update(userEntity);
//
//        transaction.commit();
//        session.close();
//
//    }
//
//    public void updateBirthday (int userId, Date newBirthday) {
//        Session session = HibernateConfig.create();
//        Transaction transaction = session.beginTransaction();
//
//        UserEntity userEntity = session.find(UserEntity.class, userId);
//        userEntity.setBirthday(newBirthday);
//
//        session.update(userEntity);
//
//        transaction.commit();
//        session.close();
//
//    }
//
//    public void updateGender (int userId, boolean isMan) {
//        Session session = HibernateConfig.create();
//        Transaction transaction = session.beginTransaction();
//
//        UserEntity userEntity = session.find(UserEntity.class, userId);
//        userEntity.setMan(isMan);
//
//        session.update(userEntity);
//
//        transaction.commit();
//        session.close();
//
//    }

    public void deleteAll() {
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
