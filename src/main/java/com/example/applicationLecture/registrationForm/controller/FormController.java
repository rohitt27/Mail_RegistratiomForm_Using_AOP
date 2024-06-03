package com.example.applicationLecture.registrationForm.controller;

import com.example.applicationLecture.registrationForm.dto.FormDto;
import com.example.applicationLecture.registrationForm.service.FormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/form")
@CrossOrigin(origins = "*")
public class FormController {
    @Autowired
    private FormService formService;
    @PostMapping("saveForm")
    public ResponseEntity<?> save(@RequestBody FormDto formDto){
         return formService.saveForm(formDto);
    }
}
