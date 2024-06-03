package com.example.applicationLecture.mapping.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Aadhar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long aadharNo;

    @OneToOne(mappedBy = "aadhar")
    private Person person;
}

