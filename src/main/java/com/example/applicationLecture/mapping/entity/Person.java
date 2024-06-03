package com.example.applicationLecture.mapping.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String address;
    @OneToOne
    @JoinColumn(name = "aadhar_id")
    private Aadhar aadhar;
}
