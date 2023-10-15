package org.tms.ht;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {

    @Pointcut(value = "execution(public void org.tms.ht.service.impl.RaceServiceImpl.runRace())")
    public void myPointCut() {
    }

    @Before("myPointCut()")
    public void timeCount() {
        System.out.println("Aspect working");
    }

}
