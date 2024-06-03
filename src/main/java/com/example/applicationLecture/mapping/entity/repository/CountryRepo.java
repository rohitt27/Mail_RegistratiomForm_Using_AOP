package com.example.applicationLecture.mapping.entity.repository;

import com.example.applicationLecture.mapping.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepo extends JpaRepository<Country,Long> {
}
