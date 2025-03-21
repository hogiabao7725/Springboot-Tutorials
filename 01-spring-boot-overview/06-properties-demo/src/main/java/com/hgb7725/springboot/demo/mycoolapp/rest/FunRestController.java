package com.hgb7725.springboot.demo.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    // inject properties for: coach.name & team.name
    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    // expose new endpoint for teaminfo
    @GetMapping("/teaminfo")
    public String getTeamInfo() {
        return "Coach: " + coachName + ", Team name: " + teamName;
    }

    // expose "/" that return "Hello World"

    @GetMapping("/")
    public String sayHello() {
        return "Hello World";
    }

    // expose a new endpoint for "workout"
    @GetMapping("/workout")
    public String getDailyFortune() {
        return "Today's fortune!";
    }
}
