//package com.example.applicationLecture.controller;
//
//import com.example.applicationLecture.dto.OrdersDto;
//import com.example.applicationLecture.service.OrdersService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//import java.util.Map;
//
//@RestController
//public class OrderController {
//    @Autowired
//    private OrdersService ordersService;
//
//    @PostMapping("/saveOrders")
//    public ResponseEntity<?> save(@RequestBody OrdersDto ordersDto){
//        ordersService.saveOrder(ordersDto);
//        return ResponseEntity.ok("saved");
//    }
//    @GetMapping("/getOrder")
//    public List<Map<String, Object>> getOrderSummary(){
//        return ordersService.getOrderSummary();
//    }
//
//}
