package org.tms.ht.service;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.tms.ht.config.HibernateConfig;
import org.tms.ht.dto.UserSearchDto;
import org.tms.ht.entity.UserEntity;

import java.util.List;

public class SearchService {

    public List<UserEntity> search(UserSearchDto searchDto) {
        Session session = HibernateConfig.create();
        Transaction transaction = session.getTransaction();

        Criteria criteria = session.createCriteria(UserEntity.class, "us");

        List result;

        if (searchDto == null) {
            result = criteria.list();
        } else {

            if (searchDto.getRole() != null) {
                criteria.add(Restrictions.eq("role", searchDto.getRole()));
            }

            if (searchDto.getFrom() != null) {
                criteria.add(Restrictions.gt("birthday", searchDto.getFrom()));
            }

            if (searchDto.getTo() != null) {
                criteria.add(Restrictions.lt("birthday", searchDto.getTo()));
            }

            if (searchDto.getTaskStatus() != null) {
                Criteria crTasks = criteria.createCriteria("us.tasks", "ts");
                crTasks.add(Restrictions.eq("status", searchDto.getTaskStatus()));
            }

            result = criteria.list();
        }
        return result;
    }

}
