package com.hgb7725.springcoredemo.config;

import com.hgb7725.springcoredemo.common.Coach;
import com.hgb7725.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {
    @Bean
    public Coach swimCoach() {
        return new SwimCoach();
    }
}
