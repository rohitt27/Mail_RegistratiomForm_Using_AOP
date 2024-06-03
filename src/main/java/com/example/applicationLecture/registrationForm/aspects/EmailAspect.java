package com.example.applicationLecture.registrationForm.aspects;

import com.example.applicationLecture.registrationForm.dto.FormDto;
import com.example.applicationLecture.registrationForm.service.FormService;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class EmailAspect {

    @Autowired
    private FormService formService;
    @AfterReturning("execution(* com.example.applicationLecture.registrationForm.service.FormService.saveForm(..)) && args(formDto, ..)")
    public void afterFormSaved(FormDto formDto) {
        formService.sendEmail(formDto);
    }

}
