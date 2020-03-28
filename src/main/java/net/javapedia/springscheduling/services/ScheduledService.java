package net.javapedia.springscheduling.services;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledService {

    int i=0;
    @Scheduled(fixedDelay = 2000)
    public void myFixedDelayScheduledMethod() {
        i++;
        System.out.println ("Running scheduled Task, iteration :"+ i);
    }

}
