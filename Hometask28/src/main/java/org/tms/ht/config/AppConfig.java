package org.tms.ht.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.tms.ht.domain.Horse;
import org.tms.ht.domain.Pair;
import org.tms.ht.domain.Rider;
import org.tms.ht.service.MyAspect;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = "org.tms.ht.service")
public class AppConfig {

    @Bean
    Horse horse1() {
        return new Horse("horse1");
    }

    @Bean
    Horse horse2() {
        return new Horse("horse2");
    }

    @Bean
    Horse horse3() {
        return new Horse("horse3");
    }

    @Bean
    Rider rider1() {
        return new Rider("rider1");
    }

    @Bean
    Rider rider2() {
        return new Rider("rider2");
    }

    @Bean
    Rider rider3() {
        return new Rider("rider3");
    }

    @Bean
    Pair pair1 () {
        return new Pair(1, rider1(), horse1(), 0);
    }

    @Bean
    Pair pair2 () {
        return new Pair(2, rider2(), horse2(), 0);
    }

    @Bean
    Pair pair3 () {
        return new Pair(3, rider1(), horse3(), 0);
    }

}