//package com.example.applicationLecture.controller;
//
//import com.example.applicationLecture.entity.Customer;
//import com.example.applicationLecture.service.CustomerService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class CustomerController {
//    @Autowired
//    private CustomerService customerService;
//    @PostMapping("/saveCustomer")
//    public ResponseEntity<?> save(@RequestBody Customer customer){
//        customerService.saveCustomer(customer);
//        return ResponseEntity.ok("saved Customer");
//    }
//}
