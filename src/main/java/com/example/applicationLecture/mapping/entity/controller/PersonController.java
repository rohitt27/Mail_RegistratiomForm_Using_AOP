package com.example.applicationLecture.mapping.entity.controller;

import com.example.applicationLecture.mapping.entity.Aadhar;
import com.example.applicationLecture.mapping.entity.repository.AadharRepo;
import com.example.applicationLecture.mapping.entity.repository.PersonRepo;
import com.example.applicationLecture.mapping.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("person")
public class PersonController {
    @Autowired
    private PersonRepo personRepo;
    @Autowired
    private AadharRepo aadharRepo;

    @PostMapping("save")
    public String savePerson(@RequestBody Person person) {

        var aadhar = new Aadhar();
        aadhar.setAadharNo(person.getAadhar().getAadharNo());
        aadharRepo.save(aadhar);

        var person1 = new Person();
        person1.setAadhar(aadhar);
        person1.setName(person.getName());
        person1.setAddress(person.getAddress());
        personRepo.save(person1);
        return "person saved";


    }
}
