package org.tms.ht.service;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.tms.ht.TaskStatus;
import org.tms.ht.config.HibernateConfig;
import org.tms.ht.entity.TaskEntity;
import org.tms.ht.entity.UserEntity;

import java.util.List;

@Data
public class TaskService {

    public void save(TaskEntity task) {
        Session session = HibernateConfig.create();
        Transaction transaction = session.beginTransaction();

        session.save(task);

        transaction.commit();
        session.close();
    }

    public TaskEntity getById(int id){
        Session session = HibernateConfig.create();
        Transaction transaction = session.beginTransaction();

        TaskEntity taskEntity = session.find(TaskEntity.class, id);

        transaction.commit();
        session.close();
        return taskEntity;
    }

    public void updateTaskStatus (int id, TaskStatus newTaskStatus) {
        Session session = HibernateConfig.create();
        Transaction transaction = session.beginTransaction();

        TaskEntity taskEntity = getById(id);

        taskEntity.setStatus(newTaskStatus);

        session.update(taskEntity);

        transaction.commit();
        session.close();
    }

    public void addTaskToUser (int taskId, int userId) {
        UserService userService = new UserService();

        Session session = HibernateConfig.create();
        Transaction transaction = session.beginTransaction();

        UserEntity user1 = userService.getById(userId);
        TaskEntity task = getById(taskId);

        task.setUser(user1);

        List<TaskEntity> tasks = user1.getTasks();
        tasks.add(task);
        user1.setTasks(List.of(task));

        session.update(task);
        session.update(user1);

        transaction.commit();
        session.close();
    }

    public List<TaskEntity> getTasksByUserId (int id) {
        UserService userService = new UserService();

        Session session = HibernateConfig.create();
        Transaction transaction = session.beginTransaction();

        UserEntity byId = userService.getById(id);

        List<TaskEntity> tasks = byId.getTasks();

        transaction.commit();
        session.close();

        return tasks;
    }

    public List<UserEntity> getByActiveTasks () {
        Session session = HibernateConfig.create();
        Transaction transaction = session.beginTransaction();

        Query query = session.createQuery("select distinct user FROM TaskEntity where status ='NEW' or status = 'IN_PROGRESS'");
        List list = query.list();

        transaction.commit();
        session.close();
        return list;
    }

}
