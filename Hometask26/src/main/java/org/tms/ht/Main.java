package org.tms.ht;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.tms.ht.domain.Horse;
import org.tms.ht.domain.Pair;
import org.tms.ht.domain.Rider;
import org.tms.ht.service.impl.InputServiceImpl;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("my-config.xml");

        Horse horse1 = context.getBean(Horse.class);
        Horse horse2 = context.getBean(Horse.class);
        Horse horse3 = context.getBean(Horse.class);

        Rider rider1 = context.getBean(Rider.class);
        Rider rider2 = context.getBean(Rider.class);
        Rider rider3 = context.getBean(Rider.class);

        Pair pair1 = context.getBean(Pair.class);
        Pair pair2 = context.getBean(Pair.class);
        Pair pair3 = context.getBean(Pair.class);

        InputServiceImpl inputService = context.getBean(InputServiceImpl.class);

        pair1.setRider(rider1);
        pair2.setRider(rider2);
        pair3.setRider(rider3);
        pair1.setHorse(horse1);
        pair2.setHorse(horse2);
        pair3.setHorse(horse3);

        int i = inputService.inputPair();

        System.out.println("inputService.getPairs()");


    }

}
