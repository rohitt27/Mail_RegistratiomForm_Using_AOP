package com.example.applicationLecture.mapping.entity.controller;

import com.example.applicationLecture.mapping.entity.Country;
import com.example.applicationLecture.mapping.entity.repository.CountryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/country")
public class CountryController {
    @Autowired
    private CountryRepo countryRepo;

    @PostMapping("/saveCountry")
    public ResponseEntity<?> saveCountry(@RequestBody Country country){
        countryRepo.save(country);
        return ResponseEntity.ok().body("saved Successfully");
    }
}
