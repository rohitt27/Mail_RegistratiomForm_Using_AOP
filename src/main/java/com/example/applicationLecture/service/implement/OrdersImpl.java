//package com.example.applicationLecture.service.implement;
//
//import com.example.applicationLecture.dto.OrdersDto;
//import com.example.applicationLecture.entity.Orders;
//import com.example.applicationLecture.repository.OrdersRepo;
//import com.example.applicationLecture.service.OrdersService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Map;
//
//@Service
//public class OrdersImpl implements OrdersService {
//    @Autowired
//    private OrdersRepo ordersRepo;
//    @Override
//    public ResponseEntity<?> saveOrder(OrdersDto ordersDto) {
//        Orders or = new Orders();
//        or.setQuantity(ordersDto.getQuantity());
//        or.setTotal(ordersDto.getTotal());
//        or.setProduct(ordersDto.getProduct_id());
//        or.setCustomer(ordersDto.getCustomer_id());
//        ordersRepo.save(or);
//        return ResponseEntity.ok("saved Order");
//    }
//
//    @Override
//    public List<Map<String, Object>> getOrderSummary() {
//        return ordersRepo.getOrderSummary();
//    }
//}
