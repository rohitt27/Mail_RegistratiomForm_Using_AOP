package com.example.applicationLecture.registrationForm.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FormDto {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String confirmPassword;
    private Long phoneNo;
    private String address;
    private String city;
    private String state;
    private Integer zipCode;
}
