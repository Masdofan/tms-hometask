package org.tms.ht;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.tms.ht.config.HibernateConfig;
import org.tms.ht.entity.TaskEntity;
import org.tms.ht.entity.UserEntity;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        UserEntity user1 = UserEntity.builder()
                .name("user1")
                .role(UserRole.USER)
                .birthday(new Date(100, 10, 10)) //Какой-то закидон Date'а? Там в годах на 0, 1900 стоит
                .isMan(true)
                .build();

        UserEntity user2 = UserEntity.builder()
                .name("user2")
                .role(UserRole.ADMIN)
                .birthday(new Date(100, 10, 20))
                .isMan(false)
                .build();

        UserEntity.save(user1);
        UserEntity.save(user2);


        TaskEntity task1 = TaskEntity.builder()
                .title("title1")
                .description("desc1")
                .status(TaskStatus.NEW)
                .build();
        TaskEntity.save(task1);

        TaskEntity task2 = TaskEntity.builder()
                .title("title2")
                .description("desc2")
                .status(TaskStatus.IN_PROGRESS)
                .build();
        TaskEntity.save(task2);

        TaskEntity task3 = TaskEntity.builder()
                .title("title3")
                .description("desc3")
                .status(TaskStatus.DONE)
                .build();
        TaskEntity.save(task3);

        TaskEntity task4 = TaskEntity.builder()
                .title("title4")
                .description("desc4")
                .status(TaskStatus.IN_PROGRESS)
                .build();
        TaskEntity.save(task4);

        TaskEntity.addTaskToUser(1,1);
        TaskEntity.addTaskToUser(2,1);
        TaskEntity.addTaskToUser(3,2);
        TaskEntity.addTaskToUser(4,2);

        TaskEntity.updateTaskStatus(1, TaskStatus.IN_PROGRESS);
        TaskEntity.updateTaskStatus(4, TaskStatus.DONE);

        System.out.println(TaskEntity.getByActiveTasks());

        UserEntity.deleteAll();

    }

}
