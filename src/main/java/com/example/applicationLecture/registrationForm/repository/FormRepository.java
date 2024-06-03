package com.example.applicationLecture.registrationForm.repository;

import com.example.applicationLecture.registrationForm.entity.Form;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FormRepository extends JpaRepository<Form,Long> {

}
