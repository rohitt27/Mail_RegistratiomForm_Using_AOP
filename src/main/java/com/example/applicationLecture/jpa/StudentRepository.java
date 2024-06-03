package com.example.applicationLecture.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface StudentRepository extends JpaRepository<Student,Long> {
    Student findByNameAndAddressIgnoreCase(String name,String address);
    List<Student> findByActiveFalse();
    List<Student> findByAgeNotIn(List<Integer> list);

    List<Student> findByNameNot(String name);
    List<Student> findByDobBetween(LocalDate startDate, LocalDate toDate);

    List<Student> findByAgeLessThan(Integer age);

}
