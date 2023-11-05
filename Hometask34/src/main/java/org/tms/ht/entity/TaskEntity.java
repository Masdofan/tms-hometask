package org.tms.ht.entity;

import lombok.*;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.tms.ht.TaskStatus;
import org.tms.ht.config.HibernateConfig;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "task_list")
public class TaskEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String title;

    private String description;

    @Enumerated(EnumType.STRING)
    private TaskStatus status;

    @ManyToOne
    @JoinColumn(name = "user_id")
    @ToString.Exclude
    private UserEntity user;

    public static void save(TaskEntity task) {
        Session session = HibernateConfig.create();
        Transaction transaction = session.beginTransaction();

        session.save(task);

        transaction.commit();
        session.close();
    }

    public static TaskEntity getById(int id){
        Session session = HibernateConfig.create();
        Transaction transaction = session.beginTransaction();

        TaskEntity taskEntity = session.find(TaskEntity.class, id);

        transaction.commit();
        session.close();
        return taskEntity;
    }

    public static void updateTaskStatus (int id, TaskStatus newTaskStatus) {
        Session session = HibernateConfig.create();
        Transaction transaction = session.beginTransaction();

        TaskEntity taskEntity = getById(id);

        taskEntity.setStatus(newTaskStatus);

        session.update(taskEntity);

        transaction.commit();
        session.close();
    }

    public static void addTaskToUser (int taskId, int userId) {
        Session session = HibernateConfig.create();
        Transaction transaction = session.beginTransaction();

        UserEntity user1 = UserEntity.getById(userId);
        TaskEntity task = TaskEntity.getById(taskId);

        task.setUser(user1);

        List<TaskEntity> tasks = user1.getTasks();
        tasks.add(task);
        user1.setTasks(List.of(task));

        session.update(task);
        session.update(user1);

        transaction.commit();
        session.close();
    }

    public static List<TaskEntity> getTasksByUserId (int id) {
        Session session = HibernateConfig.create();
        Transaction transaction = session.beginTransaction();

        UserEntity byId = UserEntity.getById(id);

        List<TaskEntity> tasks = byId.getTasks();

        transaction.commit();
        session.close();

        return tasks;
    }

    public static List<UserEntity> getByActiveTasks () {
        Session session = HibernateConfig.create();
        Transaction transaction = session.beginTransaction();

        Query query = session.createQuery("select distinct user FROM TaskEntity where status ='NEW' or status = 'IN_PROGRESS'");
        List list = query.list();

        transaction.commit();
        session.close();
        return list;
    }

}
