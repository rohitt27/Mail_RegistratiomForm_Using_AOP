//package com.example.applicationLecture.repository;
//
//import com.example.applicationLecture.entity.Customer;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//
//import java.util.List;
//import java.util.Map;
//
//public interface CustomerRepo extends JpaRepository<Customer,Long> {
//    @Query(value = "select * from get_order()")
//    List<Map<String, Object>> getCustomerSummary();
//}
