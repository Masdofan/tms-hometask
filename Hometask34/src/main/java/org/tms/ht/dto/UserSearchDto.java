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

}
