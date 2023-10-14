package org.tms.ht;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.tms.ht.domain.Horse;
import org.tms.ht.domain.Pair;
import org.tms.ht.domain.Rider;
import org.tms.ht.service.RaceService;
import org.tms.ht.service.impl.InputServiceImpl;
import org.tms.ht.service.impl.RaceServiceImpl;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("my-config.xml");

        Object horse1 = context.getBean("horse1");
        Object horse2 = context.getBean("horse2");
        Object horse3 = context.getBean("horse3");

        Object rider1 = context.getBean("rider1");
        Object rider2 = context.getBean("rider2");
        Object rider3 = context.getBean("rider3");


        Pair pair1 = (Pair) context.getBean("pair1");
        Pair pair2 = (Pair) context.getBean("pair2");
        Pair pair3 = (Pair) context.getBean("pair3");

        List<Pair> pairs = List.of(pair1, pair2, pair3);

        InputServiceImpl inputService = (InputServiceImpl)context.getBean("inputService");
        inputService.setPairs(pairs);

        RaceServiceImpl raceService  = (RaceServiceImpl)context.getBean("raceService");
        raceService.setPairs(pairs);

        Scanner scanner = new Scanner(System.in);

        System.out.println(pair1);
        System.out.println(pair2);
        System.out.println(pair3);

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
