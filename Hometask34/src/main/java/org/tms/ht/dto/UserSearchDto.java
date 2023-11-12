package org.tms.ht.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
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


    public List<UserEntity> search() {
        Session session = HibernateConfig.create();
        Transaction transaction = session.getTransaction();

        Criteria criteria = session.createCriteria(UserEntity.class, "us");

        List result;

        if (this == null) {
            result = criteria.list();
        } else {

            if (role != null) {
                criteria.add(Restrictions.eq("role", role));
            }

            if (from != null && to != null) {
                criteria.add(Restrictions.gt("birthday", from));
                criteria.add(Restrictions.lt("birthday", to));
            }

            if (taskStatus != null) {
                Criteria crTasks = criteria.createCriteria("us.tasks", "ts");
                crTasks.add(Restrictions.eq("status", taskStatus));
            }

            result = criteria.list();
        }
        return result;
    }

}
