//package com.example.applicationLecture.repository;
//
//import com.example.applicationLecture.entity.Orders;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//
//import java.util.List;
//import java.util.Map;
//
//public interface OrdersRepo extends JpaRepository<Orders,Long> {
//    @Query(value = "select * from get_order()",nativeQuery = true)
//    List<Map<String, Object>> getOrderSummary();
//}
