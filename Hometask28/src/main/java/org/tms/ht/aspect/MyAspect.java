package org.tms.ht.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.Timer;

@Aspect
@Component
@ComponentScan(basePackages = "org.tms.ht.service.impl")
public class MyAspect {

    long timeBefore;

    @Pointcut("execution(public void org.tms.ht.service.impl.RaceServiceImpl.runRace())")
    public void myPointCut() {
    }

    @Pointcut("@annotation(org.tms.ht.annotation.MyAnnotation)")
    public void myAnnotationPointCut() {
    }

    @Before("myAnnotationPointCut()")
    public void printSmth() {
        System.out.println("Annotation aspect");
    }

    @Before("myPointCut()")
    public void timeCountStart() {
        this.timeBefore = System.currentTimeMillis();
    }

    @After("myPointCut()")
    public void timeCountFinish() {
        long timeAfter = System.currentTimeMillis();
        long executionTime = timeAfter - timeBefore;
        System.out.println("execution time = " + executionTime + "ms");
    }
}
