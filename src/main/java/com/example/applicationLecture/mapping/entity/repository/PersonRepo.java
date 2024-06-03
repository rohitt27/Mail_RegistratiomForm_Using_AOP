package com.example.applicationLecture.mapping.entity.repository;

import com.example.applicationLecture.mapping.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepo extends JpaRepository<Person,Long> {
}
