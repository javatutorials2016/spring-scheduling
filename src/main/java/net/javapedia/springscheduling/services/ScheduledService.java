package net.javapedia.springscheduling.services;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledService {

    private int i = 0;

    @Scheduled(fixedDelay = 2000) //in ms
    public void myFixedDelayScheduledMethod() {
        i++;
        System.out.println("Running scheduled Task, iteration :" + i + " Thread name: " + Thread.currentThread().getName());
    }


    @Scheduled(fixedRate = 4000) //in ms
    public void myFixedRateScheduledMethod() {
        System.out.println("Running fixedRate Task, Thread name: " + Thread.currentThread().getName());
    }
}
