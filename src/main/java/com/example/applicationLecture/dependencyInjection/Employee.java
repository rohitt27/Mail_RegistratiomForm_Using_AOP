package com.example.applicationLecture.dependencyInjection;

import org.springframework.stereotype.Component;

@Component
public class Employee {
    private int id;

    private String name;

    public void show(){
        System.out.println("In show");
    }
}
