package com.example.applicationLecture.ioc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SimConfig {

    public SimConfig(){
        System.out.println("In Sim Config Constructor");
    }
@Bean
    public Vodafone getVodafone(){
        return new Vodafone();
    }
    public Airtel getAirtel(){
        return new Airtel();
    }
}
