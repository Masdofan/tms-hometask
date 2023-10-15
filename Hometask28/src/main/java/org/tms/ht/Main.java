package org.tms.ht;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.tms.ht.domain.Pair;
import org.tms.ht.service.InputService;
import org.tms.ht.service.RaceService;
import org.tms.ht.service.impl.InputServiceImpl;
import org.tms.ht.service.impl.RaceServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("org.tms.ht.config");
        context.registerShutdownHook();

        RaceService raceService = context.getBean(RaceService.class);

        Scanner scanner = new Scanner(System.in);

        raceService.runRace();

        for (;;) {
            System.out.println("Continue? 1 - yes, 0 - no");
            int contin = scanner.nextInt();
            if (contin == 1) {
                raceService.runRace();
            } else  if (contin == 0) {
                break;
            }
        }

        System.out.println("Thanks for playing");
    }

}