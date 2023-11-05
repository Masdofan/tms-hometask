package org.tms.ht.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.EnumUtils;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.tms.ht.TaskStatus;
import org.tms.ht.UserRole;
import org.tms.ht.config.HibernateConfig;
import org.tms.ht.entity.TaskEntity;
import org.tms.ht.entity.UserEntity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserSearchDto {

    private UserRole role;

    private Date birthday;

    private Date from;

    private Date to;

    private TaskStatus taskStatus;

    private List<TaskEntity> tasks;

    public static List<UserEntity> searchByRole (UserRole role) {
        var search = UserSearchDto.builder()
                .role(role)
                .build();

        Session session = HibernateConfig.create();
        Transaction transaction = session.beginTransaction();

        Criteria criteria = session.createCriteria(UserEntity.class);
        List result;

        if (search == null) {
            result = criteria.list();
        } else {
            if (search.getRole() != null) {
                criteria.add(Restrictions.eq("role", search.getRole()));
            }
        }

        result = criteria.list();

        transaction.commit();
        session.close();
        return result;
    }

    public static List<UserEntity> searchByDate (Date from, Date to) {
        var search = UserSearchDto.builder()
                .from(from)
                .to(to)
                .build();

        Session session = HibernateConfig.create();
        Transaction transaction = session.beginTransaction();

        Criteria criteria = session.createCriteria(UserEntity.class);
        List result;

        if (search == null) {
            result = criteria.list();
        } else {
            if (search.from != null && search.to != null) {
                criteria.add(Restrictions.gt("birthday", search.getFrom()));
                criteria.add(Restrictions.lt("birthday", search.getTo()));
            }
        }

        result = criteria.list();

        transaction.commit();
        session.close();
        return result;
    }

    public static List<UserEntity> searchByTaskStatus (TaskStatus taskStatus) {
        var search = TaskSearchDto.builder()
                .status(taskStatus)
                .build();

        Session session = HibernateConfig.create();
        Transaction transaction = session.beginTransaction();

        Criteria criteria = session.createCriteria(TaskEntity.class);
        List<TaskEntity> result;

        if (search == null) {
            result = criteria.list();
        } else {
            if (search.getStatus() != null) {
                criteria.add(Restrictions.eq("status", taskStatus));
            }
        }

        result = (List<TaskEntity>) criteria.list();

        List<UserEntity> userEntities = new ArrayList<>(); // Это очень костыльно и я вообще не уверен, что надо это решать
                                                           // именно так, но оно работает (вроде как)
        for (TaskEntity entity : result) {
            UserEntity user = entity.getUser();
            userEntities.add(user);
        }

        transaction.commit();
        session.close();
        return userEntities;
    }

}
