package com.example.applicationLecture.registrationForm.service;

import com.example.applicationLecture.registrationForm.dto.FormDto;
import org.springframework.http.ResponseEntity;

public interface FormService {
    ResponseEntity<?> saveForm(FormDto formDto);
    void sendEmail(FormDto formDto);
}
