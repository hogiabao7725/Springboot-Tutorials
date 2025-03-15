package com.hgb7725.springcoredemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class TrackCoach implements Coach {

    public TrackCoach() {
        System.out.println("In constructor: " + this.getClass().getSimpleName());
    }

    @PostConstruct
    public void doMyStartupStuff() {
        System.out.println("In doMyStartupStuff(): " + this.getClass().getSimpleName());
    }

    @PreDestroy
    public void doMyDestroyStuff() {
        System.out.println("In doMyDestroyStuff(): " + this.getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }
}
