package org.tms.ht;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.tms.ht.config.HibernateConfig;
import org.tms.ht.dto.UserSearchDto;
import org.tms.ht.entity.TaskEntity;
import org.tms.ht.entity.UserEntity;
import org.tms.ht.service.SearchService;
import org.tms.ht.service.TaskService;
import org.tms.ht.service.UserService;

import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        UserService userService = new UserService();
        TaskService taskService = new TaskService();
        SearchService searchService = new SearchService();

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

        userService.save(user1);
        userService.save(user2);


        TaskEntity task1 = TaskEntity.builder()
                .title("title1")
                .description("desc1")
                .status(TaskStatus.NEW)
                .build();
        taskService.save(task1);

        TaskEntity task2 = TaskEntity.builder()
                .title("title2")
                .description("desc2")
                .status(TaskStatus.DONE)
                .build();
        taskService.save(task2);

        TaskEntity task3 = TaskEntity.builder()
                .title("title3")
                .description("desc3")
                .status(TaskStatus.IN_PROGRESS)
                .build();
        taskService.save(task3);

        TaskEntity task4 = TaskEntity.builder()
                .title("title4")
                .description("desc4")
                .status(TaskStatus.DONE)
                .build();
        taskService.save(task4);

        taskService.addTaskToUser(task1,1);
        taskService.addTaskToUser(task2,1);
        taskService.addTaskToUser(task3,2);
        taskService.addTaskToUser(task4,2);

        UserSearchDto dto = UserSearchDto.builder()
                .to(new Date(100, 10, 12))
                .build();

        List<UserEntity> search = searchService.search(dto);

        System.out.println(search);

    }

}
